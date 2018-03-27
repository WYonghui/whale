/*
 * Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *  
 *   http://www.apache.org/licenses/LICENSE-2.0
 *  
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.apache.storm.kafka.trident;

import org.apache.storm.generated.StormTopology;
import org.apache.storm.trident.Stream;
import org.apache.storm.trident.TridentTopology;
import org.apache.storm.trident.operation.builtin.Debug;
import org.apache.storm.trident.spout.ITridentDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TridentKafkaConsumerTopology {

    protected static final Logger LOG = LoggerFactory.getLogger(TridentKafkaConsumerTopology.class);

    /**
     * Creates a new topology that prints inputs to stdout.
     * @param tridentSpout The spout to use
     */
    public static StormTopology newTopology(ITridentDataSource tridentSpout) {
        final TridentTopology tridentTopology = new TridentTopology();
        final Stream spoutStream = tridentTopology.newStream("spout", tridentSpout).parallelismHint(2);
        spoutStream.each(spoutStream.getOutputFields(), new Debug(false));
        return tridentTopology.build();
    }
}
