package p411x9;

/* renamed from: x9.q */
/* loaded from: classes.dex */
public final class C6998q {

    /* renamed from: a */
    public final android.content.SharedPreferences f27292a;

    /* renamed from: b */
    public final p306r6.C5797a f27293b;

    public C6998q(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r3, r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r4)
            android.content.Context r3 = r3.getApplicationContext()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "com.google.firebase.auth.api.Store.%s"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r1)
            r2.f27292a = r3
            r6.a r3 = new r6.a
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.String r0 = "StorageHelpers"
            r3.<init>(r0, r4)
            r2.f27293b = r3
            return
    }

    /* renamed from: a */
    public final p411x9.C6985f0 m14147a(org.json.JSONObject r26) {
            r25 = this;
            r0 = r26
            java.lang.String r1 = "enrollmentTimestamp"
            java.lang.String r2 = "userMultiFactorInfo"
            java.lang.String r3 = "userMetadata"
            java.lang.String r5 = "cachedTokenState"
            java.lang.String r5 = r0.getString(r5)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            java.lang.String r6 = "applicationName"
            java.lang.String r6 = r0.getString(r6)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            java.lang.String r7 = "anonymous"
            boolean r7 = r0.getBoolean(r7)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            java.lang.String r8 = "2"
            java.lang.String r9 = "version"
            java.lang.String r9 = r0.getString(r9)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            if (r9 == 0) goto L25
            r8 = r9
        L25:
            java.lang.String r9 = "userInfos"
            org.json.JSONArray r9 = r0.getJSONArray(r9)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            int r10 = r9.length()     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            r11.<init>(r10)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            r13 = 0
        L35:
            java.lang.String r14 = "displayName"
            java.lang.String r15 = "phoneNumber"
            if (r13 >= r10) goto L8b
            java.lang.String r12 = r9.getString(r13)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            r4.<init>(r12)     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            java.lang.String r12 = "userId"
            java.lang.String r17 = r4.optString(r12)     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            java.lang.String r12 = "providerId"
            java.lang.String r18 = r4.optString(r12)     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            java.lang.String r12 = "email"
            java.lang.String r19 = r4.optString(r12)     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            java.lang.String r20 = r4.optString(r15)     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            java.lang.String r21 = r4.optString(r14)     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            java.lang.String r12 = "photoUrl"
            java.lang.String r22 = r4.optString(r12)     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            java.lang.String r12 = "isEmailVerified"
            boolean r23 = r4.optBoolean(r12)     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            java.lang.String r12 = "rawUserInfo"
            java.lang.String r24 = r4.optString(r12)     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            x9.c0 r4 = new x9.c0     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: org.json.JSONException -> L7d p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            r11.add(r4)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            int r13 = r13 + 1
            goto L35
        L7d:
            r0 = move-exception
            java.lang.String r1 = "DefaultAuthUserInfo"
            java.lang.String r2 = "Failed to unpack UserInfo from JSON"
            android.util.Log.d(r1, r2)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            h7.g8 r1 = new h7.g8     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            r1.<init>(r0)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            throw r1     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
        L8b:
            o9.d r4 = p251o9.C5180d.m11495d(r6)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            x9.f0 r6 = new x9.f0     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            r6.<init>(r4, r11)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            if (r4 != 0) goto La0
            h7.me r4 = p124h7.C2752me.m6985X(r5)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            r6.f27263Y = r4     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
        La0:
            if (r7 != 0) goto La6
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            r6.f27270f0 = r4     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
        La6:
            r6.f27269e0 = r8     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            boolean r4 = r0.has(r3)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            if (r4 == 0) goto Lcc
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            if (r3 != 0) goto Lb5
            goto Lc7
        Lb5:
            java.lang.String r4 = "lastSignInTimestamp"
            long r4 = r3.getLong(r4)     // Catch: org.json.JSONException -> Lc7 p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            java.lang.String r7 = "creationTimestamp"
            long r7 = r3.getLong(r7)     // Catch: org.json.JSONException -> Lc7 p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            x9.h0 r3 = new x9.h0     // Catch: org.json.JSONException -> Lc7 p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            r3.<init>(r4, r7)     // Catch: org.json.JSONException -> Lc7 p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132
            goto Lc8
        Lc7:
            r3 = 0
        Lc8:
            if (r3 == 0) goto Lcc
            r6.f27271g0 = r3     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
        Lcc:
            boolean r3 = r0.has(r2)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            if (r3 == 0) goto L12d
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            if (r0 == 0) goto L12d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            r2.<init>()     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            r12 = 0
        Lde:
            int r3 = r0.length()     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            if (r12 >= r3) goto L12a
            java.lang.String r3 = r0.getString(r12)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            r4.<init>(r3)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            java.lang.String r3 = "phone"
            java.lang.String r5 = "factorIdKey"
            java.lang.String r5 = r4.optString(r5)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            boolean r3 = r3.equals(r5)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            if (r3 == 0) goto L123
            boolean r3 = r4.has(r1)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            if (r3 == 0) goto L11b
            java.lang.String r3 = "uid"
            java.lang.String r17 = r4.optString(r3)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            java.lang.String r18 = r4.optString(r14)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            long r19 = r4.optLong(r1)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            java.lang.String r21 = r4.optString(r15)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            v9.w r3 = new v9.w     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            r16 = r3
            r16.<init>(r17, r18, r19, r21)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            goto L124
        L11b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."
            r0.<init>(r1)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            throw r0     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
        L123:
            r3 = 0
        L124:
            r2.add(r3)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
            int r12 = r12 + 1
            goto Lde
        L12a:
            r6.mo13475k0(r2)     // Catch: p124h7.C2638g8 -> L12e java.lang.IllegalArgumentException -> L130 java.lang.ArrayIndexOutOfBoundsException -> L132 org.json.JSONException -> L134
        L12d:
            return r6
        L12e:
            r0 = move-exception
            goto L135
        L130:
            r0 = move-exception
            goto L135
        L132:
            r0 = move-exception
            goto L135
        L134:
            r0 = move-exception
        L135:
            r1 = r25
            r6.a r2 = r1.f27293b
            java.lang.String r2 = r2.f22479a
            android.util.Log.wtf(r2, r0)
            r2 = 0
            return r2
    }
}
