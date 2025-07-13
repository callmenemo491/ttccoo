package p036c6;

/* renamed from: c6.q */
/* loaded from: classes.dex */
public class C0905q extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0905q> CREATOR = null;

    /* renamed from: Y */
    public final p036c6.C0891j f4849Y;

    /* renamed from: Z */
    public java.lang.String f4850Z;

    /* renamed from: a0 */
    public final org.json.JSONObject f4851a0;

    static {
            c6.w0 r0 = new c6.w0
            r0.<init>()
            p036c6.C0905q.CREATOR = r0
            return
    }

    public C0905q(p036c6.C0891j r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>()
            r0.f4849Y = r1
            r0.f4851a0 = r2
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: X */
    public static p036c6.C0905q m2612X(@androidx.annotation.RecentlyNonNull org.json.JSONObject r36) {
            r0 = r36
            java.lang.String r1 = "loadRequestData"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            java.lang.String r3 = "customData"
            if (r1 == 0) goto L149
            android.os.Parcelable$Creator<c6.j> r4 = p036c6.C0891j.CREATOR
            java.lang.String r4 = "currentTime"
            java.lang.String r5 = "autoplay"
            java.lang.String r6 = "queueData"
            java.lang.String r7 = "media"
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r9 = -1
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            boolean r15 = r1.has(r7)     // Catch: org.json.JSONException -> L122
            if (r15 == 0) goto L2c
            com.google.android.gms.cast.MediaInfo r15 = new com.google.android.gms.cast.MediaInfo     // Catch: org.json.JSONException -> L122
            org.json.JSONObject r7 = r1.getJSONObject(r7)     // Catch: org.json.JSONException -> L122
            r15.<init>(r7)     // Catch: org.json.JSONException -> L122
            goto L2d
        L2c:
            r15 = 0
        L2d:
            boolean r7 = r1.has(r6)     // Catch: org.json.JSONException -> L123
            if (r7 == 0) goto L47
            c6.m$a r7 = new c6.m$a     // Catch: org.json.JSONException -> L123
            r7.<init>()     // Catch: org.json.JSONException -> L123
            org.json.JSONObject r6 = r1.getJSONObject(r6)     // Catch: org.json.JSONException -> L123
            r7.m2606a(r6)     // Catch: org.json.JSONException -> L123
            c6.m r6 = new c6.m     // Catch: org.json.JSONException -> L123
            c6.m r7 = r7.f4810a     // Catch: org.json.JSONException -> L123
            r6.<init>(r7)     // Catch: org.json.JSONException -> L123
            goto L48
        L47:
            r6 = 0
        L48:
            boolean r7 = r1.has(r5)     // Catch: org.json.JSONException -> L124
            if (r7 == 0) goto L58
            boolean r5 = r1.getBoolean(r5)     // Catch: org.json.JSONException -> L124
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: org.json.JSONException -> L124
            r8 = r5
            goto L59
        L58:
            r8 = 0
        L59:
            boolean r5 = r1.has(r4)     // Catch: org.json.JSONException -> L124
            if (r5 == 0) goto L67
            double r4 = r1.getDouble(r4)     // Catch: org.json.JSONException -> L124
            long r9 = p123h6.C2487a.m6365d(r4)     // Catch: org.json.JSONException -> L124
        L67:
            java.lang.String r4 = "playbackRate"
            double r4 = r1.optDouble(r4, r13)     // Catch: org.json.JSONException -> L124
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r7 = java.lang.Double.compare(r4, r11)     // Catch: org.json.JSONException -> L124
            if (r7 > 0) goto L11a
            r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r7 = java.lang.Double.compare(r4, r11)     // Catch: org.json.JSONException -> L124
            if (r7 < 0) goto L11a
            java.lang.String r7 = "credentials"
            java.lang.String r7 = p123h6.C2487a.m6364c(r1, r7)     // Catch: org.json.JSONException -> L118
            java.lang.String r11 = "credentialsType"
            java.lang.String r11 = p123h6.C2487a.m6364c(r1, r11)     // Catch: org.json.JSONException -> L126
            java.lang.String r12 = "atvCredentials"
            java.lang.String r12 = p123h6.C2487a.m6364c(r1, r12)     // Catch: org.json.JSONException -> L127
            java.lang.String r13 = "atvCredentialsType"
            java.lang.String r13 = p123h6.C2487a.m6364c(r1, r13)     // Catch: org.json.JSONException -> L128
            java.lang.String r14 = "requestId"
            long r32 = r1.optLong(r14)     // Catch: org.json.JSONException -> Lf8
            java.lang.String r14 = "activeTrackIds"
            org.json.JSONArray r14 = r1.optJSONArray(r14)     // Catch: org.json.JSONException -> Lbd
            if (r14 == 0) goto Lc0
            int r2 = r14.length()     // Catch: org.json.JSONException -> Lbd
            long[] r2 = new long[r2]     // Catch: org.json.JSONException -> Lbd
            r16 = 0
            r34 = r13
            r0 = 0
        Lae:
            int r13 = r14.length()     // Catch: org.json.JSONException -> Lef
            if (r0 >= r13) goto Lc3
            long r16 = r14.getLong(r0)     // Catch: org.json.JSONException -> Lef
            r2[r0] = r16     // Catch: org.json.JSONException -> Lef
            int r0 = r0 + 1
            goto Lae
        Lbd:
            r34 = r13
            goto Lef
        Lc0:
            r34 = r13
            r2 = 0
        Lc3:
            org.json.JSONObject r0 = r1.optJSONObject(r3)     // Catch: org.json.JSONException -> Lf0
            c6.j r1 = new c6.j     // Catch: org.json.JSONException -> Le9
            r16 = r1
            r17 = r15
            r18 = r6
            r19 = r8
            r20 = r9
            r22 = r4
            r24 = r2
            r25 = r0
            r26 = r7
            r27 = r11
            r28 = r12
            r29 = r34
            r30 = r32
            r16.<init>(r17, r18, r19, r20, r22, r24, r25, r26, r27, r28, r29, r30)     // Catch: org.json.JSONException -> Le9
            r2 = r1
            goto L14a
        Le9:
            r35 = r2
            r2 = r0
            r0 = r35
            goto Lf2
        Lef:
            r2 = 0
        Lf0:
            r0 = r2
            r2 = 0
        Lf2:
            r18 = r2
            r16 = r32
            r2 = r0
            goto Lff
        Lf8:
            r34 = r13
            r2 = 0
            r16 = 0
            r18 = 0
        Lff:
            r27 = r2
            r25 = r4
            r21 = r6
            r29 = r7
            r22 = r8
            r23 = r9
            r30 = r11
            r31 = r12
            r20 = r15
            r28 = r18
            r32 = r34
            r33 = r16
            goto L140
        L118:
            r13 = r4
            goto L124
        L11a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: org.json.JSONException -> L124
            java.lang.String r1 = "playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX"
            r0.<init>(r1)     // Catch: org.json.JSONException -> L124
            throw r0     // Catch: org.json.JSONException -> L124
        L122:
            r15 = 0
        L123:
            r6 = 0
        L124:
            r4 = r13
            r7 = 0
        L126:
            r11 = 0
        L127:
            r12 = 0
        L128:
            r25 = r4
            r21 = r6
            r29 = r7
            r22 = r8
            r23 = r9
            r30 = r11
            r31 = r12
            r20 = r15
            r27 = 0
            r28 = 0
            r32 = 0
            r33 = 0
        L140:
            c6.j r0 = new c6.j
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33)
            r2 = r0
            goto L14a
        L149:
            r2 = 0
        L14a:
            r0 = r36
            org.json.JSONObject r0 = r0.optJSONObject(r3)
            c6.q r1 = new c6.q
            r1.<init>(r2, r0)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof p036c6.C0905q
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            c6.q r4 = (p036c6.C0905q) r4
            org.json.JSONObject r0 = r3.f4851a0
            org.json.JSONObject r2 = r4.f4851a0
            boolean r0 = p353u6.C6344g.m12994a(r0, r2)
            if (r0 != 0) goto L17
            return r1
        L17:
            c6.j r0 = r3.f4849Y
            c6.j r4 = r4.f4849Y
            boolean r4 = p248o6.C4924o.m11074a(r0, r4)
            return r4
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            c6.j r1 = r3.f4849Y
            r2 = 0
            r0[r2] = r1
            org.json.JSONObject r1 = r3.f4851a0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            org.json.JSONObject r0 = r4.f4851a0
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r0.toString()
        La:
            r4.f4850Z = r0
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 2
            c6.j r2 = r4.f4849Y
            r3 = 0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r6 = 3
            java.lang.String r1 = r4.f4850Z
            p270p6.C5369c.m11719g(r5, r6, r1, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
