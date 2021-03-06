/*
 * Copyright 2013 Twitter inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.twitter.tormenta.scheme.avro.specific

import scala.reflect.ClassTag

import org.apache.avro.Schema
import org.apache.avro.specific.SpecificRecordBase

import com.twitter.tormenta.scheme.avro.InjectionScheme
import com.twitter.bijection.avro.SpecificAvroCodecs
import com.twitter.bijection.Injection._

object SpecificAvroScheme {
  def apply[T <: SpecificRecordBase: ClassTag] = InjectionScheme(SpecificAvroCodecs[T])
}

object BinaryAvroScheme {
  def apply[T <: SpecificRecordBase: ClassTag] = InjectionScheme(SpecificAvroCodecs.toBinary[T])
}

object JsonAvroScheme {
  def apply[T <: SpecificRecordBase: ClassTag](schema: Schema) =
    InjectionScheme(SpecificAvroCodecs.toJson[T](schema) andThen connect[String, Array[Byte]])
}

