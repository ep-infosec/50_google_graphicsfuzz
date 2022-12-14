/*
 * Copyright 2018 The GraphicsFuzz Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.graphicsfuzz.generator.transformation;

import com.graphicsfuzz.common.ast.expr.Expr;
import com.graphicsfuzz.common.ast.type.BasicType;
import com.graphicsfuzz.generator.fuzzer.Fuzzer;

public interface ExpressionIdentity {

  Expr apply(Expr expr, BasicType type, boolean constContext, final int depth, Fuzzer fuzzer);

  boolean preconditionHolds(Expr expr, BasicType basicType, boolean constContext);

}
