/*-
 * Copyright (c) 2020 Sygic a.s.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package intl.who.covid19;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Location {

    // Do not rename these fields! They are named to match API
    private double latitude;
    private double longitude;
    private Integer accuracy;
    @SerializedName(value = "recordTimestamp", alternate = { "timestamp" }) // For back-compatibility
    private long recordTimestamp;

    public Location() { }
    public Location(@NonNull android.location.Location src) {
        latitude = src.getLatitude();
        longitude = src.getLongitude();
        accuracy = src.hasAccuracy() ? (int)src.getAccuracy() : null;
        recordTimestamp = src.getTime() / 1000;
    }
}
