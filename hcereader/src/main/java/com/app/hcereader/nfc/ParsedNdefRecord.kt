/*
 *  ---license-start
 *  MykhailoNester / Host-based-card-emulation
 *  ---
 *  Copyright (C) 2022 Mykhailo Nester and all other contributors
 *  ---
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  ---license-end
 *
 *  Created by mykhailo.nester on 21/06/2022, 15:12
 */

package com.app.hcereader.nfc

/**
 * Parsed ndef record
 */
interface ParsedNdefRecord {

    fun str(): String
}
