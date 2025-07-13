package com.google.android.gms.cast;

/* loaded from: classes.dex */
public class MediaInfo extends p270p6.AbstractC5367a implements com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.cast.MediaInfo> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f5373Y;

    /* renamed from: Z */
    public int f5374Z;

    /* renamed from: a0 */
    public java.lang.String f5375a0;

    /* renamed from: b0 */
    public p036c6.C0893k f5376b0;

    /* renamed from: c0 */
    public long f5377c0;

    /* renamed from: d0 */
    public java.util.List<com.google.android.gms.cast.MediaTrack> f5378d0;

    /* renamed from: e0 */
    public p036c6.C0907r f5379e0;

    /* renamed from: f0 */
    public java.lang.String f5380f0;

    /* renamed from: g0 */
    public java.util.List<p036c6.C0874b> f5381g0;

    /* renamed from: h0 */
    public java.util.List<p036c6.C0871a> f5382h0;

    /* renamed from: i0 */
    public java.lang.String f5383i0;

    /* renamed from: j0 */
    public p036c6.C0909s f5384j0;

    /* renamed from: k0 */
    public long f5385k0;

    /* renamed from: l0 */
    public java.lang.String f5386l0;

    /* renamed from: m0 */
    public java.lang.String f5387m0;

    /* renamed from: n0 */
    public java.lang.String f5388n0;

    /* renamed from: o0 */
    public java.lang.String f5389o0;

    /* renamed from: p0 */
    public org.json.JSONObject f5390p0;

    /* renamed from: q0 */
    public final com.google.android.gms.cast.MediaInfo.C1056a f5391q0;

    /* renamed from: com.google.android.gms.cast.MediaInfo$a */
    public class C1056a {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.gms.cast.MediaInfo f5392a;

        public C1056a(com.google.android.gms.cast.MediaInfo r1) {
                r0 = this;
                r0.f5392a = r1
                r0.<init>()
                return
        }
    }

    static {
            java.util.regex.Pattern r0 = p123h6.C2487a.f11248a
            c6.k0 r0 = new c6.k0
            r0.<init>()
            com.google.android.gms.cast.MediaInfo.CREATOR = r0
            return
    }

    public MediaInfo(java.lang.String r5, int r6, java.lang.String r7, p036c6.C0893k r8, long r9, java.util.List<com.google.android.gms.cast.MediaTrack> r11, p036c6.C0907r r12, java.lang.String r13, java.util.List<p036c6.C0874b> r14, java.util.List<p036c6.C0871a> r15, java.lang.String r16, p036c6.C0909s r17, long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
            r4 = this;
            r0 = r4
            r1 = r13
            r4.<init>()
            com.google.android.gms.cast.MediaInfo$a r2 = new com.google.android.gms.cast.MediaInfo$a
            r2.<init>(r4)
            r0.f5391q0 = r2
            r2 = r5
            r0.f5373Y = r2
            r2 = r6
            r0.f5374Z = r2
            r2 = r7
            r0.f5375a0 = r2
            r2 = r8
            r0.f5376b0 = r2
            r2 = r9
            r0.f5377c0 = r2
            r2 = r11
            r0.f5378d0 = r2
            r2 = r12
            r0.f5379e0 = r2
            r0.f5380f0 = r1
            r2 = 0
            if (r1 == 0) goto L33
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2e
            r3.<init>(r13)     // Catch: org.json.JSONException -> L2e
            r0.f5390p0 = r3     // Catch: org.json.JSONException -> L2e
            goto L35
        L2e:
            r0.f5390p0 = r2
            r0.f5380f0 = r2
            goto L35
        L33:
            r0.f5390p0 = r2
        L35:
            r1 = r14
            r0.f5381g0 = r1
            r1 = r15
            r0.f5382h0 = r1
            r1 = r16
            r0.f5383i0 = r1
            r1 = r17
            r0.f5384j0 = r1
            r1 = r18
            r0.f5385k0 = r1
            r1 = r20
            r0.f5386l0 = r1
            r1 = r21
            r0.f5387m0 = r1
            r1 = r22
            r0.f5388n0 = r1
            r1 = r23
            r0.f5389o0 = r1
            return
    }

    public MediaInfo(org.json.JSONObject r45) {
            r44 = this;
            r14 = r44
            r15 = r45
            r0 = r44
            java.lang.String r1 = "contentId"
            java.lang.String r1 = r15.optString(r1)
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = -1
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            java.lang.String r0 = "streamType"
            java.lang.String r1 = "NONE"
            r2 = r45
            java.lang.String r0 = r2.optString(r0, r1)
            boolean r3 = r1.equals(r0)
            r4 = -1
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L40
            r3 = r44
            r3.f5374Z = r6
            goto L5a
        L40:
            r3 = r44
            java.lang.String r8 = "BUFFERED"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4d
            r3.f5374Z = r7
            goto L5a
        L4d:
            java.lang.String r8 = "LIVE"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L58
            r3.f5374Z = r5
            goto L5a
        L58:
            r3.f5374Z = r4
        L5a:
            java.lang.String r0 = "contentType"
            java.lang.String r0 = p123h6.C2487a.m6364c(r2, r0)
            r3.f5375a0 = r0
            java.lang.String r0 = "metadata"
            boolean r8 = r2.has(r0)
            if (r8 == 0) goto L7e
            org.json.JSONObject r0 = r2.getJSONObject(r0)
            java.lang.String r8 = "metadataType"
            int r8 = r0.getInt(r8)
            c6.k r9 = new c6.k
            r9.<init>(r8)
            r3.f5376b0 = r9
            r9.m2602b0(r0)
        L7e:
            r8 = -1
            r3.f5377c0 = r8
            java.lang.String r0 = "duration"
            boolean r8 = r2.has(r0)
            r9 = 0
            if (r8 == 0) goto La8
            boolean r8 = r2.isNull(r0)
            if (r8 != 0) goto La8
            double r11 = r2.optDouble(r0, r9)
            boolean r0 = java.lang.Double.isNaN(r11)
            if (r0 != 0) goto La8
            boolean r0 = java.lang.Double.isInfinite(r11)
            if (r0 != 0) goto La8
            long r11 = p123h6.C2487a.m6365d(r11)
            r3.f5377c0 = r11
        La8:
            java.lang.String r0 = "tracks"
            boolean r8 = r2.has(r0)
            java.lang.String r12 = "customData"
            r14 = 4
            if (r8 == 0) goto L1d5
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            org.json.JSONArray r0 = r2.getJSONArray(r0)
            r4 = 0
        Lbd:
            int r11 = r0.length()
            if (r4 >= r11) goto L1cf
            org.json.JSONObject r11 = r0.getJSONObject(r4)
            java.lang.String r9 = "trackId"
            long r21 = r11.getLong(r9)
            java.lang.String r9 = "type"
            java.lang.String r9 = r11.optString(r9)
            java.lang.String r10 = "TEXT"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto Lde
            r23 = 1
            goto Lf6
        Lde:
            java.lang.String r10 = "AUDIO"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto Le9
            r23 = 2
            goto Lf6
        Le9:
            java.lang.String r10 = "VIDEO"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto Lf4
            r23 = 3
            goto Lf6
        Lf4:
            r23 = 0
        Lf6:
            java.lang.String r9 = "trackContentId"
            java.lang.String r24 = p123h6.C2487a.m6364c(r11, r9)
            java.lang.String r9 = "trackContentType"
            java.lang.String r25 = p123h6.C2487a.m6364c(r11, r9)
            java.lang.String r9 = "name"
            java.lang.String r26 = p123h6.C2487a.m6364c(r11, r9)
            java.lang.String r9 = "language"
            java.lang.String r27 = p123h6.C2487a.m6364c(r11, r9)
            java.lang.String r9 = "subtype"
            boolean r10 = r11.has(r9)
            if (r10 == 0) goto L154
            java.lang.String r9 = r11.getString(r9)
            java.lang.String r10 = "SUBTITLES"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L125
            r28 = 1
            goto L156
        L125:
            java.lang.String r10 = "CAPTIONS"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L130
            r28 = 2
            goto L156
        L130:
            java.lang.String r10 = "DESCRIPTIONS"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L13b
            r28 = 3
            goto L156
        L13b:
            java.lang.String r10 = "CHAPTERS"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L146
            r28 = 4
            goto L156
        L146:
            java.lang.String r10 = "METADATA"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L151
            r28 = 5
            goto L156
        L151:
            r28 = -1
            goto L156
        L154:
            r28 = 0
        L156:
            java.lang.String r9 = "roles"
            boolean r10 = r11.has(r9)
            if (r10 == 0) goto L1b6
            e7.a0<java.lang.Object> r10 = p072e7.AbstractC1722r.f7762Z
            java.lang.Object[] r10 = new java.lang.Object[r14]
            org.json.JSONArray r9 = r11.getJSONArray(r9)
            r13 = 0
            r14 = 0
            r20 = 0
        L16a:
            int r5 = r9.length()
            if (r14 >= r5) goto L1a9
            java.lang.String r5 = r9.optString(r14)
            java.util.Objects.requireNonNull(r5)
            int r6 = r13 + 1
            int r15 = r10.length
            if (r15 >= r6) goto L195
            int r20 = r15 >> 1
            int r15 = r15 + r20
            int r15 = r15 + r7
            if (r15 >= r6) goto L18b
            int r6 = r6 + (-1)
            int r6 = java.lang.Integer.highestOneBit(r6)
            int r15 = r6 + r6
        L18b:
            if (r15 >= 0) goto L190
            r15 = 2147483647(0x7fffffff, float:NaN)
        L190:
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r10, r15)
            goto L19d
        L195:
            if (r20 == 0) goto L1a0
            java.lang.Object r6 = r10.clone()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
        L19d:
            r10 = r6
            r20 = 0
        L1a0:
            int r6 = r13 + 1
            r10[r13] = r5
            int r14 = r14 + 1
            r13 = r6
            r6 = 0
            goto L16a
        L1a9:
            if (r13 != 0) goto L1ae
            e7.r<java.lang.Object> r5 = p072e7.C1750u.f7795c0
            goto L1b3
        L1ae:
            e7.u r5 = new e7.u
            r5.<init>(r10, r13)
        L1b3:
            r29 = r5
            goto L1b8
        L1b6:
            r29 = 0
        L1b8:
            org.json.JSONObject r30 = r11.optJSONObject(r12)
            com.google.android.gms.cast.MediaTrack r5 = new com.google.android.gms.cast.MediaTrack
            r20 = r5
            r20.<init>(r21, r23, r24, r25, r26, r27, r28, r29, r30)
            r8.add(r5)
            int r4 = r4 + 1
            r5 = 2
            r6 = 0
            r9 = 0
            r14 = 4
            goto Lbd
        L1cf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            goto L1d6
        L1d5:
            r0 = 0
        L1d6:
            r3.f5378d0 = r0
            java.lang.String r0 = "textTrackStyle"
            boolean r4 = r2.has(r0)
            if (r4 == 0) goto L356
            org.json.JSONObject r0 = r2.getJSONObject(r0)
            c6.r r4 = new c6.r
            r32 = 1065353216(0x3f800000, float:1.0)
            r33 = 0
            r34 = 0
            r35 = -1
            r36 = 0
            r37 = -1
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = -1
            r42 = -1
            r43 = 0
            r31 = r4
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r8 = "fontScale"
            double r5 = r0.optDouble(r8, r5)
            float r5 = (float) r5
            r4.f4852Y = r5
            java.lang.String r5 = "foregroundColor"
            java.lang.String r5 = r0.optString(r5)
            int r5 = p036c6.C0907r.m2632X(r5)
            r4.f4853Z = r5
            java.lang.String r5 = "backgroundColor"
            java.lang.String r5 = r0.optString(r5)
            int r5 = p036c6.C0907r.m2632X(r5)
            r4.f4854a0 = r5
            java.lang.String r5 = "edgeType"
            boolean r6 = r0.has(r5)
            if (r6 == 0) goto L266
            java.lang.String r5 = r0.getString(r5)
            boolean r6 = r1.equals(r5)
            if (r6 == 0) goto L23c
            r6 = 0
        L239:
            r4.f4855b0 = r6
            goto L266
        L23c:
            java.lang.String r6 = "OUTLINE"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L247
            r4.f4855b0 = r7
            goto L266
        L247:
            java.lang.String r6 = "DROP_SHADOW"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L251
            r6 = 2
            goto L239
        L251:
            java.lang.String r6 = "RAISED"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L25b
            r6 = 3
            goto L239
        L25b:
            java.lang.String r6 = "DEPRESSED"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L266
            r5 = 4
            r4.f4855b0 = r5
        L266:
            java.lang.String r5 = "edgeColor"
            java.lang.String r5 = r0.optString(r5)
            int r5 = p036c6.C0907r.m2632X(r5)
            r4.f4856c0 = r5
            java.lang.String r5 = "windowType"
            boolean r6 = r0.has(r5)
            java.lang.String r8 = "NORMAL"
            if (r6 == 0) goto L29f
            java.lang.String r5 = r0.getString(r5)
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L28a
            r1 = 0
            r4.f4857d0 = r1
            goto L29f
        L28a:
            boolean r1 = r8.equals(r5)
            if (r1 == 0) goto L293
            r4.f4857d0 = r7
            goto L29f
        L293:
            java.lang.String r1 = "ROUNDED_CORNERS"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L29f
            r1 = 2
            r4.f4857d0 = r1
            goto L2a0
        L29f:
            r1 = 2
        L2a0:
            java.lang.String r5 = "windowColor"
            java.lang.String r5 = r0.optString(r5)
            int r5 = p036c6.C0907r.m2632X(r5)
            r4.f4858e0 = r5
            int r5 = r4.f4857d0
            if (r5 != r1) goto L2b9
            java.lang.String r1 = "windowRoundedCornerRadius"
            r5 = 0
            int r1 = r0.optInt(r1, r5)
            r4.f4859f0 = r1
        L2b9:
            java.lang.String r1 = "fontFamily"
            java.lang.String r1 = p123h6.C2487a.m6364c(r0, r1)
            r4.f4860g0 = r1
            java.lang.String r1 = "fontGenericFamily"
            boolean r5 = r0.has(r1)
            if (r5 == 0) goto L317
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r5 = "SANS_SERIF"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2d9
            r5 = 0
        L2d6:
            r4.f4861h0 = r5
            goto L317
        L2d9:
            java.lang.String r5 = "MONOSPACED_SANS_SERIF"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2e4
            r4.f4861h0 = r7
            goto L317
        L2e4:
            java.lang.String r5 = "SERIF"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2ee
            r5 = 2
            goto L2d6
        L2ee:
            java.lang.String r5 = "MONOSPACED_SERIF"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2f8
            r5 = 3
            goto L2d6
        L2f8:
            java.lang.String r5 = "CASUAL"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L302
            r5 = 4
            goto L2d6
        L302:
            java.lang.String r5 = "CURSIVE"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L30c
            r11 = 5
            goto L315
        L30c:
            java.lang.String r5 = "SMALL_CAPITALS"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L317
            r11 = 6
        L315:
            r4.f4861h0 = r11
        L317:
            java.lang.String r1 = "fontStyle"
            boolean r5 = r0.has(r1)
            if (r5 == 0) goto L34d
            java.lang.String r1 = r0.getString(r1)
            boolean r5 = r8.equals(r1)
            if (r5 == 0) goto L32d
            r5 = 0
        L32a:
            r4.f4862i0 = r5
            goto L34d
        L32d:
            java.lang.String r5 = "BOLD"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L338
            r4.f4862i0 = r7
            goto L34d
        L338:
            java.lang.String r5 = "ITALIC"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L342
            r5 = 2
            goto L32a
        L342:
            java.lang.String r5 = "BOLD_ITALIC"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L34d
            r1 = 3
            r4.f4862i0 = r1
        L34d:
            org.json.JSONObject r0 = r0.optJSONObject(r12)
            r4.f4864k0 = r0
            r3.f5379e0 = r4
            goto L359
        L356:
            r0 = 0
            r3.f5379e0 = r0
        L359:
            r44.m2930X(r45)
            org.json.JSONObject r0 = r2.optJSONObject(r12)
            r3.f5390p0 = r0
            java.lang.String r0 = "entity"
            java.lang.String r0 = p123h6.C2487a.m6364c(r2, r0)
            r3.f5383i0 = r0
            java.lang.String r0 = "atvEntity"
            java.lang.String r0 = p123h6.C2487a.m6364c(r2, r0)
            r3.f5386l0 = r0
            java.lang.String r0 = "vmapAdsRequest"
            org.json.JSONObject r0 = r2.optJSONObject(r0)
            c6.s r0 = p036c6.C0909s.m2633X(r0)
            r3.f5384j0 = r0
            java.lang.String r0 = "startAbsoluteTime"
            boolean r1 = r2.has(r0)
            if (r1 == 0) goto L3a8
            boolean r1 = r2.isNull(r0)
            if (r1 != 0) goto L3a8
            double r0 = r2.optDouble(r0)
            boolean r4 = java.lang.Double.isNaN(r0)
            if (r4 != 0) goto L3a8
            boolean r4 = java.lang.Double.isInfinite(r0)
            if (r4 != 0) goto L3a8
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L3a8
            long r0 = p123h6.C2487a.m6365d(r0)
            r3.f5385k0 = r0
        L3a8:
            java.lang.String r0 = "contentUrl"
            boolean r1 = r2.has(r0)
            if (r1 == 0) goto L3b6
            java.lang.String r0 = r2.optString(r0)
            r3.f5387m0 = r0
        L3b6:
            java.lang.String r0 = "hlsSegmentFormat"
            java.lang.String r0 = p123h6.C2487a.m6364c(r2, r0)
            r3.f5388n0 = r0
            java.lang.String r0 = "hlsVideoSegmentFormat"
            java.lang.String r0 = p123h6.C2487a.m6364c(r2, r0)
            r3.f5389o0 = r0
            return
    }

    /* renamed from: X */
    public final void m2930X(org.json.JSONObject r42) {
            r41 = this;
            r1 = r41
            r2 = r42
            java.lang.String r3 = "whenSkippable"
            java.lang.String r0 = "breaks"
            boolean r4 = r2.has(r0)
            r5 = 1000(0x3e8, double:4.94E-321)
            r8 = 0
            r9 = 1
            java.lang.String r10 = "duration"
            java.lang.String r11 = "id"
            if (r4 == 0) goto Lbb
            org.json.JSONArray r4 = r2.getJSONArray(r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r4.length()
            r12.<init>(r0)
            r13 = 0
        L24:
            int r0 = r4.length()
            if (r13 >= r0) goto Lb4
            org.json.JSONObject r0 = r4.getJSONObject(r13)
            if (r0 != 0) goto L32
            goto La5
        L32:
            boolean r14 = r0.has(r11)
            if (r14 == 0) goto La5
            java.lang.String r14 = "position"
            boolean r15 = r0.has(r14)
            if (r15 != 0) goto L41
            goto La5
        L41:
            java.lang.String r19 = r0.getString(r11)     // Catch: org.json.JSONException -> L8f
            long r14 = r0.getLong(r14)     // Catch: org.json.JSONException -> L8f
            java.util.regex.Pattern r16 = p123h6.C2487a.f11248a     // Catch: org.json.JSONException -> L8f
            long r17 = r14 * r5
            java.lang.String r14 = "isWatched"
            boolean r22 = r0.optBoolean(r14)     // Catch: org.json.JSONException -> L8f
            long r14 = r0.optLong(r10)     // Catch: org.json.JSONException -> L8f
            long r20 = r14 * r5
            java.lang.String r14 = "breakClipIds"
            org.json.JSONArray r14 = r0.optJSONArray(r14)     // Catch: org.json.JSONException -> L8f
            java.lang.String[] r15 = new java.lang.String[r8]     // Catch: org.json.JSONException -> L8f
            if (r14 == 0) goto L79
            int r15 = r14.length()     // Catch: org.json.JSONException -> L8f
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch: org.json.JSONException -> L8f
            r7 = 0
        L6a:
            int r5 = r14.length()     // Catch: org.json.JSONException -> L8f
            if (r7 >= r5) goto L79
            java.lang.String r5 = r14.getString(r7)     // Catch: org.json.JSONException -> L8f
            r15[r7] = r5     // Catch: org.json.JSONException -> L8f
            int r7 = r7 + 1
            goto L6a
        L79:
            r23 = r15
            java.lang.String r5 = "isEmbedded"
            boolean r24 = r0.optBoolean(r5)     // Catch: org.json.JSONException -> L8f
            java.lang.String r5 = "expanded"
            boolean r25 = r0.optBoolean(r5)     // Catch: org.json.JSONException -> L8f
            c6.b r0 = new c6.b     // Catch: org.json.JSONException -> L8f
            r16 = r0
            r16.<init>(r17, r19, r20, r22, r23, r24, r25)     // Catch: org.json.JSONException -> L8f
            goto La6
        L8f:
            r0 = move-exception
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r0 = r0.getMessage()
            r6[r8] = r0
            java.lang.String r0 = "Error while creating an AdBreakInfo from JSON: %s"
            java.lang.String r0 = java.lang.String.format(r5, r0, r6)
            java.lang.String r5 = "AdBreakInfo"
            android.util.Log.d(r5, r0)
        La5:
            r0 = 0
        La6:
            if (r0 == 0) goto Lb1
            r12.add(r0)
            int r13 = r13 + 1
            r5 = 1000(0x3e8, double:4.94E-321)
            goto L24
        Lb1:
            r12.clear()
        Lb4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            r1.f5381g0 = r0
        Lbb:
            java.lang.String r0 = "breakClips"
            boolean r4 = r2.has(r0)
            if (r4 == 0) goto L19f
            org.json.JSONArray r2 = r2.getJSONArray(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r2.length()
            r4.<init>(r0)
            r5 = 0
        Ld1:
            int r0 = r2.length()
            if (r5 >= r0) goto L198
            org.json.JSONObject r0 = r2.getJSONObject(r5)
            if (r0 != 0) goto Lde
            goto Le4
        Lde:
            boolean r6 = r0.has(r11)
            if (r6 != 0) goto Le9
        Le4:
            r0 = 0
            r14 = 1000(0x3e8, double:4.94E-321)
            goto L18c
        Le9:
            java.lang.String r27 = r0.getString(r11)     // Catch: org.json.JSONException -> L173
            long r6 = r0.optLong(r10)     // Catch: org.json.JSONException -> L173
            java.util.regex.Pattern r12 = p123h6.C2487a.f11248a     // Catch: org.json.JSONException -> L173
            r12 = 1000(0x3e8, double:4.94E-321)
            long r29 = r6 * r12
            java.lang.String r6 = "clickThroughUrl"
            java.lang.String r33 = p123h6.C2487a.m6364c(r0, r6)     // Catch: org.json.JSONException -> L173
            java.lang.String r6 = "contentUrl"
            java.lang.String r31 = p123h6.C2487a.m6364c(r0, r6)     // Catch: org.json.JSONException -> L173
            java.lang.String r6 = "mimeType"
            java.lang.String r6 = p123h6.C2487a.m6364c(r0, r6)     // Catch: org.json.JSONException -> L173
            if (r6 != 0) goto L111
            java.lang.String r6 = "contentType"
            java.lang.String r6 = p123h6.C2487a.m6364c(r0, r6)     // Catch: org.json.JSONException -> L173
        L111:
            r32 = r6
            java.lang.String r6 = "title"
            java.lang.String r28 = p123h6.C2487a.m6364c(r0, r6)     // Catch: org.json.JSONException -> L173
            java.lang.String r6 = "customData"
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch: org.json.JSONException -> L173
            java.lang.String r7 = "contentId"
            java.lang.String r35 = p123h6.C2487a.m6364c(r0, r7)     // Catch: org.json.JSONException -> L173
            java.lang.String r7 = "posterUrl"
            java.lang.String r36 = p123h6.C2487a.m6364c(r0, r7)     // Catch: org.json.JSONException -> L173
            boolean r7 = r0.has(r3)     // Catch: org.json.JSONException -> L173
            if (r7 == 0) goto L141
            java.lang.Object r7 = r0.get(r3)     // Catch: org.json.JSONException -> L173
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: org.json.JSONException -> L173
            int r7 = r7.intValue()     // Catch: org.json.JSONException -> L173
            long r12 = (long) r7
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            goto L145
        L141:
            r14 = 1000(0x3e8, double:4.94E-321)
            r12 = -1
        L145:
            r37 = r12
            java.lang.String r7 = "hlsSegmentFormat"
            java.lang.String r39 = p123h6.C2487a.m6364c(r0, r7)     // Catch: org.json.JSONException -> L171
            java.lang.String r7 = "vastAdsRequest"
            org.json.JSONObject r0 = r0.optJSONObject(r7)     // Catch: org.json.JSONException -> L171
            c6.s r40 = p036c6.C0909s.m2633X(r0)     // Catch: org.json.JSONException -> L171
            c6.a r0 = new c6.a     // Catch: org.json.JSONException -> L171
            if (r6 == 0) goto L169
            int r7 = r6.length()     // Catch: org.json.JSONException -> L171
            if (r7 != 0) goto L162
            goto L169
        L162:
            java.lang.String r6 = r6.toString()     // Catch: org.json.JSONException -> L171
            r34 = r6
            goto L16b
        L169:
            r34 = 0
        L16b:
            r26 = r0
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r39, r40)     // Catch: org.json.JSONException -> L171
            goto L18c
        L171:
            r0 = move-exception
            goto L176
        L173:
            r0 = move-exception
            r14 = 1000(0x3e8, double:4.94E-321)
        L176:
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.String r0 = r0.getMessage()
            r7[r8] = r0
            java.lang.String r0 = "Error while creating an AdBreakClipInfo from JSON: %s"
            java.lang.String r0 = java.lang.String.format(r6, r0, r7)
            java.lang.String r6 = "AdBreakClipInfo"
            android.util.Log.d(r6, r0)
            r0 = 0
        L18c:
            if (r0 == 0) goto L195
            r4.add(r0)
            int r5 = r5 + 1
            goto Ld1
        L195:
            r4.clear()
        L198:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            r1.f5382h0 = r0
        L19f:
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.cast.MediaInfo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.cast.MediaInfo r8 = (com.google.android.gms.cast.MediaInfo) r8
            org.json.JSONObject r1 = r7.f5390p0
            if (r1 == 0) goto L12
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            org.json.JSONObject r4 = r8.f5390p0
            if (r4 == 0) goto L19
            r5 = 0
            goto L1a
        L19:
            r5 = 1
        L1a:
            if (r3 == r5) goto L1d
            return r2
        L1d:
            if (r1 == 0) goto L29
            if (r4 == 0) goto L29
            boolean r1 = p353u6.C6344g.m12994a(r1, r4)
            if (r1 == 0) goto L28
            goto L29
        L28:
            return r2
        L29:
            java.lang.String r1 = r7.f5373Y
            java.lang.String r3 = r8.f5373Y
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            int r1 = r7.f5374Z
            int r3 = r8.f5374Z
            if (r1 != r3) goto Lc2
            java.lang.String r1 = r7.f5375a0
            java.lang.String r3 = r8.f5375a0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            c6.k r1 = r7.f5376b0
            c6.k r3 = r8.f5376b0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            long r3 = r7.f5377c0
            long r5 = r8.f5377c0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Lc2
            java.util.List<com.google.android.gms.cast.MediaTrack> r1 = r7.f5378d0
            java.util.List<com.google.android.gms.cast.MediaTrack> r3 = r8.f5378d0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            c6.r r1 = r7.f5379e0
            c6.r r3 = r8.f5379e0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            java.util.List<c6.b> r1 = r7.f5381g0
            java.util.List<c6.b> r3 = r8.f5381g0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            java.util.List<c6.a> r1 = r7.f5382h0
            java.util.List<c6.a> r3 = r8.f5382h0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            java.lang.String r1 = r7.f5383i0
            java.lang.String r3 = r8.f5383i0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            c6.s r1 = r7.f5384j0
            c6.s r3 = r8.f5384j0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            long r3 = r7.f5385k0
            long r5 = r8.f5385k0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Lc2
            java.lang.String r1 = r7.f5386l0
            java.lang.String r3 = r8.f5386l0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            java.lang.String r1 = r7.f5387m0
            java.lang.String r3 = r8.f5387m0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            java.lang.String r1 = r7.f5388n0
            java.lang.String r3 = r8.f5388n0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc2
            java.lang.String r1 = r7.f5389o0
            java.lang.String r8 = r8.f5389o0
            boolean r8 = p123h6.C2487a.m6368g(r1, r8)
            if (r8 == 0) goto Lc2
            return r0
        Lc2:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 16
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f5373Y
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f5374Z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.f5375a0
            r2 = 2
            r0[r2] = r1
            c6.k r1 = r3.f5376b0
            r2 = 3
            r0[r2] = r1
            long r1 = r3.f5377c0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            org.json.JSONObject r1 = r3.f5390p0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            java.util.List<com.google.android.gms.cast.MediaTrack> r1 = r3.f5378d0
            r2 = 6
            r0[r2] = r1
            c6.r r1 = r3.f5379e0
            r2 = 7
            r0[r2] = r1
            java.util.List<c6.b> r1 = r3.f5381g0
            r2 = 8
            r0[r2] = r1
            java.util.List<c6.a> r1 = r3.f5382h0
            r2 = 9
            r0[r2] = r1
            java.lang.String r1 = r3.f5383i0
            r2 = 10
            r0[r2] = r1
            c6.s r1 = r3.f5384j0
            r2 = 11
            r0[r2] = r1
            long r1 = r3.f5385k0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 12
            r0[r2] = r1
            java.lang.String r1 = r3.f5386l0
            r2 = 13
            r0[r2] = r1
            java.lang.String r1 = r3.f5388n0
            r2 = 14
            r0[r2] = r1
            java.lang.String r1 = r3.f5389o0
            r2 = 15
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r8, int r9) {
            r7 = this;
            org.json.JSONObject r0 = r7.f5390p0
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            java.lang.String r0 = r0.toString()
        Lb:
            r7.f5380f0 = r0
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r8, r0)
            r2 = 2
            java.lang.String r3 = r7.f5373Y
            r4 = 0
            p270p6.C5369c.m11719g(r8, r2, r3, r4)
            r2 = 3
            int r3 = r7.f5374Z
            r5 = 4
            p270p6.C5369c.m11724l(r8, r2, r5)
            r8.writeInt(r3)
            java.lang.String r2 = r7.f5375a0
            p270p6.C5369c.m11719g(r8, r5, r2, r4)
            r2 = 5
            c6.k r3 = r7.f5376b0
            p270p6.C5369c.m11718f(r8, r2, r3, r9, r4)
            r2 = 6
            long r5 = r7.f5377c0
            r3 = 8
            p270p6.C5369c.m11724l(r8, r2, r3)
            r8.writeLong(r5)
            r2 = 7
            java.util.List<com.google.android.gms.cast.MediaTrack> r5 = r7.f5378d0
            p270p6.C5369c.m11722j(r8, r2, r5, r4)
            c6.r r2 = r7.f5379e0
            p270p6.C5369c.m11718f(r8, r3, r2, r9, r4)
            r2 = 9
            java.lang.String r5 = r7.f5380f0
            p270p6.C5369c.m11719g(r8, r2, r5, r4)
            r2 = 10
            java.util.List<c6.b> r5 = r7.f5381g0
            if (r5 != 0) goto L54
            r5 = r1
            goto L58
        L54:
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
        L58:
            p270p6.C5369c.m11722j(r8, r2, r5, r4)
            r2 = 11
            java.util.List<c6.a> r5 = r7.f5382h0
            if (r5 != 0) goto L62
            goto L66
        L62:
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
        L66:
            p270p6.C5369c.m11722j(r8, r2, r1, r4)
            r1 = 12
            java.lang.String r2 = r7.f5383i0
            p270p6.C5369c.m11719g(r8, r1, r2, r4)
            r1 = 13
            c6.s r2 = r7.f5384j0
            p270p6.C5369c.m11718f(r8, r1, r2, r9, r4)
            r9 = 14
            long r1 = r7.f5385k0
            p270p6.C5369c.m11724l(r8, r9, r3)
            r8.writeLong(r1)
            r9 = 15
            java.lang.String r1 = r7.f5386l0
            p270p6.C5369c.m11719g(r8, r9, r1, r4)
            r9 = 16
            java.lang.String r1 = r7.f5387m0
            p270p6.C5369c.m11719g(r8, r9, r1, r4)
            r9 = 17
            java.lang.String r1 = r7.f5388n0
            p270p6.C5369c.m11719g(r8, r9, r1, r4)
            r9 = 18
            java.lang.String r1 = r7.f5389o0
            p270p6.C5369c.m11719g(r8, r9, r1, r4)
            p270p6.C5369c.m11726n(r8, r0)
            return
    }
}
