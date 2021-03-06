/*
 * Copyright (c) 2008-2013, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.mapreduce;

/**
 * The Context interface is used for emitting keys and values to the sample space of
 * the MapReduce algorithm.
 *
 * @param <K> key type of the resulting keys
 * @param <V> value type of the resulting values
 */
public interface Context<K, V> {

    /**
     * Emits a key-value pair to the sample space. The same key can be used multiple
     * times to collect values under the same key.
     *
     * @param key   emitted key.
     * @param value emitted value.
     */
    void emit(K key, V value);

}
