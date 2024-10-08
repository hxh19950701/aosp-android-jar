/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Denotes that a numeric parameter, field or method return value is expected
 * to represent a pixel dimension.
 *
 * @memberDoc The units of this value are pixels.
 * @paramDoc The units of this value are pixels.
 * @returnDoc The units of this value are pixels.
 * {@hide}
 */
@Documented
@Retention(SOURCE)
@Target({METHOD, PARAMETER, FIELD, LOCAL_VARIABLE})
@Dimension(unit = Dimension.PX)
public @interface Px {
}
