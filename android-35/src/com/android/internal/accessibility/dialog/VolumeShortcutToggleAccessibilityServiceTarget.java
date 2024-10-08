/*
 * Copyright (C) 2020 The Android Open Source Project
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

package com.android.internal.accessibility.dialog;

import static com.android.internal.accessibility.common.ShortcutConstants.UserShortcutType.HARDWARE;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.NonNull;
import android.content.Context;

import com.android.internal.accessibility.common.ShortcutConstants.AccessibilityFragmentType;
import com.android.internal.accessibility.common.ShortcutConstants.UserShortcutType;

/**
 * Extension for {@link AccessibilityServiceTarget} with
 * {@link AccessibilityFragmentType#VOLUME_SHORTCUT_TOGGLE} type.
 */
class VolumeShortcutToggleAccessibilityServiceTarget extends AccessibilityServiceTarget {

    VolumeShortcutToggleAccessibilityServiceTarget(Context context,
            @UserShortcutType int shortcutType, @NonNull AccessibilityServiceInfo serviceInfo) {
        super(context,
                shortcutType,
                AccessibilityFragmentType.VOLUME_SHORTCUT_TOGGLE,
                serviceInfo);
    }

    @Override
    public void onCheckedChanged(boolean isChecked) {
        if (getShortcutType() == HARDWARE) {
            super.onCheckedChanged(isChecked);
        } else {
            throw new IllegalStateException("Unexpected shortcut type");
        }
    }
}
