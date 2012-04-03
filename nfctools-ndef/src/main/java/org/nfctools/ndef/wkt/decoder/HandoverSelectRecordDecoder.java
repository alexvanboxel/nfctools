/**
 * Copyright 2011 Adrian Stabiszewski, as@nfctools.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.nfctools.ndef.wkt.decoder;

import org.nfctools.ndef.NdefConstants;
import org.nfctools.ndef.NdefMessageDecoder;
import org.nfctools.ndef.NdefRecord;
import org.nfctools.ndef.wkt.records.HandoverSelectRecord;

/**
 * 
 * @author Thomas Rorvik Skjolberg (skjolber@gmail.com)
 *
 */

public class HandoverSelectRecordDecoder extends AbstractTypeRecordDecoder<HandoverSelectRecord> {

	public HandoverSelectRecordDecoder() {
		super(NdefConstants.TNF_WELL_KNOWN, HandoverSelectRecord.TYPE);
	}
	
	@Override
	public HandoverSelectRecord decodeRecord(NdefRecord ndefRecord, NdefMessageDecoder messageDecoder) {

		return new HandoverSelectRecord();
	}

}