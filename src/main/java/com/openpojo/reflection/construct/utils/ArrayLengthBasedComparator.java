/*
 * Copyright (c) 2010-2016 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.openpojo.reflection.construct.utils;

/**
 * @author oshoukry
 */
public abstract class ArrayLengthBasedComparator {
  public abstract boolean compare(final Class<?>[] leftHand, final Class<?>[] rightHand);

  protected int getLength(final Object[] array) {
    return array == null ? -1 : array.length;
  }
}
