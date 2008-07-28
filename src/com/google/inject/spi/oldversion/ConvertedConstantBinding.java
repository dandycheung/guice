/*
 * Copyright (C) 2007 Google Inc.
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

package com.google.inject.spi.oldversion;

/**
 * A binding which was converted from a string contant.
 *
 * @deprecated replaced with {@link
 * com.google.inject.Binding.TargetVisitor#visitConvertedConstant(Object)}
 *
 * @author crazybob@google.com (Bob Lee)
 */
@Deprecated
public interface ConvertedConstantBinding<T> extends ConstantBinding<T> {

  /**
   * Gets the binding that we converted to create this binding.
   */
  OldVersionBinding<String> getOriginal();
}