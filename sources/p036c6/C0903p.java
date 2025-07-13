package p036c6;

/* renamed from: c6.p */
/* loaded from: classes.dex */
public class C0903p extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0903p> CREATOR = null;

    /* renamed from: Y */
    public com.google.android.gms.cast.MediaInfo f4824Y;

    /* renamed from: Z */
    public long f4825Z;

    /* renamed from: a0 */
    public int f4826a0;

    /* renamed from: b0 */
    public double f4827b0;

    /* renamed from: c0 */
    public int f4828c0;

    /* renamed from: d0 */
    public int f4829d0;

    /* renamed from: e0 */
    public long f4830e0;

    /* renamed from: f0 */
    public long f4831f0;

    /* renamed from: g0 */
    public double f4832g0;

    /* renamed from: h0 */
    public boolean f4833h0;

    /* renamed from: i0 */
    public long[] f4834i0;

    /* renamed from: j0 */
    public int f4835j0;

    /* renamed from: k0 */
    public int f4836k0;

    /* renamed from: l0 */
    public java.lang.String f4837l0;

    /* renamed from: m0 */
    public org.json.JSONObject f4838m0;

    /* renamed from: n0 */
    public int f4839n0;

    /* renamed from: o0 */
    public final java.util.List<p036c6.C0899n> f4840o0;

    /* renamed from: p0 */
    public boolean f4841p0;

    /* renamed from: q0 */
    public p036c6.C0877c f4842q0;

    /* renamed from: r0 */
    public p036c6.C0911t f4843r0;

    /* renamed from: s0 */
    public p036c6.C0889i f4844s0;

    /* renamed from: t0 */
    public p036c6.C0897m f4845t0;

    /* renamed from: u0 */
    public final android.util.SparseArray<java.lang.Integer> f4846u0;

    /* renamed from: v0 */
    public final p036c6.C0903p.a f4847v0;

    /* renamed from: c6.p$a */
    public class a {

        /* renamed from: a */
        public final /* synthetic */ p036c6.C0903p f4848a;

        public a(p036c6.C0903p r1) {
                r0 = this;
                r0.f4848a = r1
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "MediaStatus"
            java.lang.String r1 = "The log tag cannot be null or empty."
            com.google.android.gms.common.internal.C1101a.m3101f(r0, r1)
            c6.t0 r0 = new c6.t0
            r0.<init>()
            p036c6.C0903p.CREATOR = r0
            return
    }

    public C0903p(com.google.android.gms.cast.MediaInfo r6, long r7, int r9, double r10, int r12, int r13, long r14, long r16, double r18, boolean r20, long[] r21, int r22, int r23, java.lang.String r24, int r25, java.util.List<p036c6.C0899n> r26, boolean r27, p036c6.C0877c r28, p036c6.C0911t r29, p036c6.C0889i r30, p036c6.C0897m r31) {
            r5 = this;
            r0 = r5
            r1 = r24
            r2 = r26
            r5.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f4840o0 = r3
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r0.f4846u0 = r3
            c6.p$a r3 = new c6.p$a
            r3.<init>(r5)
            r0.f4847v0 = r3
            r3 = r6
            r0.f4824Y = r3
            r3 = r7
            r0.f4825Z = r3
            r3 = r9
            r0.f4826a0 = r3
            r3 = r10
            r0.f4827b0 = r3
            r3 = r12
            r0.f4828c0 = r3
            r3 = r13
            r0.f4829d0 = r3
            r3 = r14
            r0.f4830e0 = r3
            r3 = r16
            r0.f4831f0 = r3
            r3 = r18
            r0.f4832g0 = r3
            r3 = r20
            r0.f4833h0 = r3
            r3 = r21
            r0.f4834i0 = r3
            r3 = r22
            r0.f4835j0 = r3
            r3 = r23
            r0.f4836k0 = r3
            r0.f4837l0 = r1
            r3 = 0
            if (r1 == 0) goto L5c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L57
            r4.<init>(r1)     // Catch: org.json.JSONException -> L57
            r0.f4838m0 = r4     // Catch: org.json.JSONException -> L57
            goto L5e
        L57:
            r0.f4838m0 = r3
            r0.f4837l0 = r3
            goto L5e
        L5c:
            r0.f4838m0 = r3
        L5e:
            r1 = r25
            r0.f4839n0 = r1
            if (r2 == 0) goto L6d
            boolean r1 = r26.isEmpty()
            if (r1 != 0) goto L6d
            r5.m2611Z(r2)
        L6d:
            r1 = r27
            r0.f4841p0 = r1
            r1 = r28
            r0.f4842q0 = r1
            r1 = r29
            r0.f4843r0 = r1
            r1 = r30
            r0.f4844s0 = r1
            r1 = r31
            r0.f4845t0 = r1
            return
    }

    /* renamed from: a0 */
    public static final boolean m2608a0(int r2, int r3, int r4, int r5) {
            r0 = 0
            r1 = 1
            if (r2 == r1) goto L5
            return r0
        L5:
            if (r3 == r1) goto L12
            r2 = 2
            if (r3 == r2) goto Le
            r2 = 3
            if (r3 == r2) goto L12
            return r1
        Le:
            if (r5 == r2) goto L11
            return r1
        L11:
            return r0
        L12:
            if (r4 != 0) goto L15
            return r1
        L15:
            return r0
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: X */
    public p036c6.C0899n m2609X(int r2) {
            r1 = this;
            android.util.SparseArray<java.lang.Integer> r0 = r1.f4846u0
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.util.List<c6.n> r0 = r1.f4840o0
            int r2 = r2.intValue()
            java.lang.Object r2 = r0.get(r2)
            c6.n r2 = (p036c6.C0899n) r2
            return r2
    }

    /* renamed from: Y */
    public final int m2610Y(@androidx.annotation.RecentlyNonNull org.json.JSONObject r29, int r30) {
            r28 = this;
            r1 = r28
            r0 = r29
            java.lang.String r2 = "extendedStatus"
            org.json.JSONObject r3 = r0.optJSONObject(r2)
            r4 = 0
            if (r3 == 0) goto L4f
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: org.json.JSONException -> L4f
            r5.<init>()     // Catch: org.json.JSONException -> L4f
            java.util.Iterator r6 = r29.keys()     // Catch: org.json.JSONException -> L4f
        L16:
            boolean r7 = r6.hasNext()     // Catch: org.json.JSONException -> L4f
            if (r7 == 0) goto L26
            java.lang.Object r7 = r6.next()     // Catch: org.json.JSONException -> L4f
            java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> L4f
            r5.add(r7)     // Catch: org.json.JSONException -> L4f
            goto L16
        L26:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4f
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch: org.json.JSONException -> L4f
            java.lang.Object[] r5 = r5.toArray(r7)     // Catch: org.json.JSONException -> L4f
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: org.json.JSONException -> L4f
            r6.<init>(r0, r5)     // Catch: org.json.JSONException -> L4f
            java.util.Iterator r5 = r3.keys()     // Catch: org.json.JSONException -> L4f
        L37:
            boolean r7 = r5.hasNext()     // Catch: org.json.JSONException -> L4f
            if (r7 == 0) goto L4b
            java.lang.Object r7 = r5.next()     // Catch: org.json.JSONException -> L4f
            java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> L4f
            java.lang.Object r8 = r3.get(r7)     // Catch: org.json.JSONException -> L4f
            r6.put(r7, r8)     // Catch: org.json.JSONException -> L4f
            goto L37
        L4b:
            r6.remove(r2)     // Catch: org.json.JSONException -> L4f
            goto L50
        L4f:
            r6 = r0
        L50:
            java.lang.String r0 = "mediaSessionId"
            long r2 = r6.getLong(r0)
            long r7 = r1.f4825Z
            r5 = 1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L61
            r1.f4825Z = r2
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            java.lang.String r2 = "playerState"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto Le8
            java.lang.String r2 = r6.getString(r2)
            java.lang.String r3 = "IDLE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L78
            r2 = 1
            goto La1
        L78:
            java.lang.String r3 = "PLAYING"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L82
            r2 = 2
            goto La1
        L82:
            java.lang.String r3 = "PAUSED"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L8c
            r2 = 3
            goto La1
        L8c:
            java.lang.String r3 = "BUFFERING"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L96
            r2 = 4
            goto La1
        L96:
            java.lang.String r3 = "LOADING"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto La0
            r2 = 5
            goto La1
        La0:
            r2 = 0
        La1:
            int r3 = r1.f4828c0
            if (r2 == r3) goto La9
            r1.f4828c0 = r2
            r0 = r0 | 2
        La9:
            if (r2 != r5) goto Le8
            java.lang.String r2 = "idleReason"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto Le8
            java.lang.String r2 = r6.getString(r2)
            java.lang.String r3 = "CANCELLED"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Lc1
            r2 = 2
            goto Le0
        Lc1:
            java.lang.String r3 = "INTERRUPTED"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Lcb
            r2 = 3
            goto Le0
        Lcb:
            java.lang.String r3 = "FINISHED"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Ld5
            r2 = 1
            goto Le0
        Ld5:
            java.lang.String r3 = "ERROR"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ldf
            r2 = 4
            goto Le0
        Ldf:
            r2 = 0
        Le0:
            int r3 = r1.f4829d0
            if (r2 == r3) goto Le8
            r1.f4829d0 = r2
            r0 = r0 | 2
        Le8:
            java.lang.String r2 = "playbackRate"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto Lfe
            double r2 = r6.getDouble(r2)
            double r10 = r1.f4827b0
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 == 0) goto Lfe
            r1.f4827b0 = r2
            r0 = r0 | 2
        Lfe:
            java.lang.String r2 = "currentTime"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto L11a
            double r2 = r6.getDouble(r2)
            long r2 = p123h6.C2487a.m6365d(r2)
            long r10 = r1.f4830e0
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 == 0) goto L118
            r1.f4830e0 = r2
            r0 = r0 | 2
        L118:
            r0 = r0 | 128(0x80, float:1.8E-43)
        L11a:
            java.lang.String r2 = "supportedMediaCommands"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto L130
            long r2 = r6.getLong(r2)
            long r10 = r1.f4831f0
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 == 0) goto L130
            r1.f4831f0 = r2
            r0 = r0 | 2
        L130:
            java.lang.String r2 = "volume"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto L15c
            if (r30 != 0) goto L15c
            org.json.JSONObject r2 = r6.getJSONObject(r2)
            java.lang.String r3 = "level"
            double r10 = r2.getDouble(r3)
            double r12 = r1.f4832g0
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L14e
            r1.f4832g0 = r10
            r0 = r0 | 2
        L14e:
            java.lang.String r3 = "muted"
            boolean r2 = r2.getBoolean(r3)
            boolean r3 = r1.f4833h0
            if (r2 == r3) goto L15c
            r1.f4833h0 = r2
            r0 = r0 | 2
        L15c:
            java.lang.String r2 = "activeTrackIds"
            boolean r3 = r6.has(r2)
            r10 = 0
            if (r3 == 0) goto L16a
            org.json.JSONArray r2 = r6.getJSONArray(r2)
            goto L16b
        L16a:
            r2 = r10
        L16b:
            java.util.regex.Pattern r3 = p123h6.C2487a.f11248a
            if (r2 != 0) goto L171
            r3 = r10
            goto L187
        L171:
            int r3 = r2.length()
            long[] r3 = new long[r3]
            r11 = 0
        L178:
            int r12 = r2.length()
            if (r11 >= r12) goto L187
            long r12 = r2.getLong(r11)
            r3[r11] = r12
            int r11 = r11 + 1
            goto L178
        L187:
            long[] r2 = r1.f4834i0
            if (r3 == 0) goto L1a3
            if (r2 != 0) goto L18e
            goto L1a5
        L18e:
            int r2 = r2.length
            int r11 = r3.length
            if (r2 != r11) goto L1a5
            r2 = 0
        L193:
            int r11 = r3.length
            if (r2 >= r11) goto L1a9
            long[] r11 = r1.f4834i0
            r12 = r11[r2]
            r14 = r3[r2]
            int r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r11 != 0) goto L1a5
            int r2 = r2 + 1
            goto L193
        L1a3:
            if (r2 == 0) goto L1a9
        L1a5:
            r1.f4834i0 = r3
            r0 = r0 | 2
        L1a9:
            java.lang.String r2 = "customData"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto L1bb
            org.json.JSONObject r2 = r6.getJSONObject(r2)
            r1.f4838m0 = r2
            r1.f4837l0 = r10
            r0 = r0 | 2
        L1bb:
            java.lang.String r2 = "media"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto L1e4
            org.json.JSONObject r2 = r6.getJSONObject(r2)
            com.google.android.gms.cast.MediaInfo r3 = new com.google.android.gms.cast.MediaInfo
            r3.<init>(r2)
            com.google.android.gms.cast.MediaInfo r11 = r1.f4824Y
            if (r11 == 0) goto L1d6
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L1da
        L1d6:
            r1.f4824Y = r3
            r0 = r0 | 2
        L1da:
            java.lang.String r3 = "metadata"
            boolean r2 = r2.has(r3)
            if (r2 == 0) goto L1e4
            r0 = r0 | 4
        L1e4:
            java.lang.String r2 = "currentItemId"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto L1f8
            int r2 = r6.getInt(r2)
            int r3 = r1.f4826a0
            if (r3 == r2) goto L1f8
            r1.f4826a0 = r2
            r0 = r0 | 2
        L1f8:
            java.lang.String r2 = "preloadedItemId"
            int r2 = r6.optInt(r2, r4)
            int r3 = r1.f4836k0
            if (r3 == r2) goto L206
            r1.f4836k0 = r2
            r0 = r0 | 16
        L206:
            java.lang.String r2 = "loadingItemId"
            int r2 = r6.optInt(r2, r4)
            int r3 = r1.f4835j0
            if (r3 == r2) goto L214
            r1.f4835j0 = r2
            r0 = r0 | 2
        L214:
            com.google.android.gms.cast.MediaInfo r2 = r1.f4824Y
            if (r2 != 0) goto L21a
            r2 = -1
            goto L21c
        L21a:
            int r2 = r2.f5374Z
        L21c:
            int r11 = r1.f4828c0
            int r12 = r1.f4829d0
            int r13 = r1.f4835j0
            boolean r2 = m2608a0(r11, r12, r13, r2)
            if (r2 != 0) goto L357
            java.lang.String r2 = "repeatMode"
            boolean r11 = r6.has(r2)
            if (r11 == 0) goto L255
            java.lang.String r2 = r6.getString(r2)
            java.lang.Integer r2 = p144i6.C3090a.m7550a(r2)
            if (r2 != 0) goto L23d
            int r2 = r1.f4839n0
            goto L241
        L23d:
            int r2 = r2.intValue()
        L241:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r11 = r1.f4839n0
            int r12 = r2.intValue()
            if (r11 == r12) goto L255
            int r2 = r2.intValue()
            r1.f4839n0 = r2
            r2 = 1
            goto L256
        L255:
            r2 = 0
        L256:
            java.lang.String r11 = "items"
            boolean r12 = r6.has(r11)
            if (r12 == 0) goto L354
            org.json.JSONArray r11 = r6.getJSONArray(r11)
            int r12 = r11.length()
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>()
            r14 = 0
        L26c:
            if (r14 >= r12) goto L282
            org.json.JSONObject r15 = r11.getJSONObject(r14)
            java.lang.String r3 = "itemId"
            int r3 = r15.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13.put(r14, r3)
            int r14 = r14 + 1
            goto L26c
        L282:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r14 = 0
        L288:
            if (r14 >= r12) goto L33f
            java.lang.Object r15 = r13.get(r14)
            java.lang.Integer r15 = (java.lang.Integer) r15
            org.json.JSONObject r7 = r11.getJSONObject(r14)
            int r10 = r15.intValue()
            c6.n r10 = r1.m2609X(r10)
            if (r10 == 0) goto L2ba
            boolean r7 = r10.m2607X(r7)
            r2 = r2 | r7
            r3.add(r10)
            int r7 = r15.intValue()
            android.util.SparseArray<java.lang.Integer> r10 = r1.f4846u0
            java.lang.Object r7 = r10.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r14 == r7) goto L338
            goto L337
        L2ba:
            int r2 = r15.intValue()
            int r10 = r1.f4826a0
            if (r2 != r10) goto L32f
            com.google.android.gms.cast.MediaInfo r2 = r1.f4824Y
            if (r2 == 0) goto L32f
            c6.n r10 = new c6.n
            r18 = 0
            r19 = 1
            r20 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r22 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r24 = 0
            r26 = 0
            r27 = 0
            r16 = r10
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r22, r24, r26, r27)
            com.google.android.gms.cast.MediaInfo r2 = r10.f4811Y
            if (r2 == 0) goto L327
            double r8 = r10.f4814b0
            boolean r2 = java.lang.Double.isNaN(r8)
            r8 = 0
            if (r2 != 0) goto L2fa
            double r4 = r10.f4814b0
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 < 0) goto L2f2
            goto L2fa
        L2f2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "startTime cannot be negative or NaN."
            r0.<init>(r2)
            throw r0
        L2fa:
            double r4 = r10.f4815c0
            boolean r2 = java.lang.Double.isNaN(r4)
            if (r2 != 0) goto L31f
            double r4 = r10.f4816d0
            boolean r2 = java.lang.Double.isNaN(r4)
            if (r2 != 0) goto L317
            double r4 = r10.f4816d0
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 < 0) goto L317
            r10.m2607X(r7)
            r3.add(r10)
            goto L337
        L317:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "preloadTime cannot be negative or Nan."
            r0.<init>(r2)
            throw r0
        L31f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "playbackDuration cannot be NaN."
            r0.<init>(r2)
            throw r0
        L327:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "media cannot be null."
            r0.<init>(r2)
            throw r0
        L32f:
            c6.n r2 = new c6.n
            r2.<init>(r7)
            r3.add(r2)
        L337:
            r2 = 1
        L338:
            int r14 = r14 + 1
            r4 = 0
            r5 = 1
            r10 = 0
            goto L288
        L33f:
            java.util.List<c6.n> r4 = r1.f4840o0
            int r4 = r4.size()
            if (r4 == r12) goto L34b
            r4 = 1
            r18 = 0
            goto L34e
        L34b:
            r4 = 1
            r18 = 1
        L34e:
            r5 = r18 ^ 1
            r2 = r2 | r5
            r1.m2611Z(r3)
        L354:
            if (r2 == 0) goto L374
            goto L372
        L357:
            r2 = 0
            r1.f4826a0 = r2
            r1.f4835j0 = r2
            r1.f4836k0 = r2
            java.util.List<c6.n> r3 = r1.f4840o0
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L374
            r1.f4839n0 = r2
            java.util.List<c6.n> r2 = r1.f4840o0
            r2.clear()
            android.util.SparseArray<java.lang.Integer> r2 = r1.f4846u0
            r2.clear()
        L372:
            r0 = r0 | 8
        L374:
            r2 = r0
            java.lang.String r0 = "breakStatus"
            org.json.JSONObject r0 = r6.optJSONObject(r0)
            android.os.Parcelable$Creator<c6.c> r3 = p036c6.C0877c.CREATOR
            if (r0 != 0) goto L380
            goto L3d6
        L380:
            java.lang.String r3 = "currentBreakTime"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L3d6
            java.lang.String r4 = "currentBreakClipTime"
            boolean r5 = r0.has(r4)
            if (r5 != 0) goto L391
            goto L3d6
        L391:
            long r7 = r0.getLong(r3)     // Catch: org.json.JSONException -> L3c5
            java.util.regex.Pattern r3 = p123h6.C2487a.f11248a     // Catch: org.json.JSONException -> L3c5
            r9 = 1000(0x3e8, double:4.94E-321)
            long r20 = r7 * r9
            long r3 = r0.getLong(r4)     // Catch: org.json.JSONException -> L3c5
            long r22 = r3 * r9
            java.lang.String r3 = "breakId"
            java.lang.String r24 = p123h6.C2487a.m6364c(r0, r3)     // Catch: org.json.JSONException -> L3c5
            java.lang.String r3 = "breakClipId"
            java.lang.String r25 = p123h6.C2487a.m6364c(r0, r3)     // Catch: org.json.JSONException -> L3c5
            java.lang.String r3 = "whenSkippable"
            r4 = -1
            long r7 = r0.optLong(r3, r4)     // Catch: org.json.JSONException -> L3c5
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L3bb
            long r7 = r7 * r9
        L3bb:
            r26 = r7
            c6.c r0 = new c6.c     // Catch: org.json.JSONException -> L3c5
            r19 = r0
            r19.<init>(r20, r22, r24, r25, r26)     // Catch: org.json.JSONException -> L3c5
            goto L3d7
        L3c5:
            r0 = move-exception
            h6.b r3 = p036c6.C0877c.f4738d0
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = r3.f11253a
            java.lang.String r7 = "Error while creating an AdBreakClipInfo from JSON"
            java.lang.String r3 = r3.m6380e(r7, r5)
            android.util.Log.e(r4, r3, r0)
        L3d6:
            r0 = 0
        L3d7:
            c6.c r3 = r1.f4842q0
            if (r3 != 0) goto L3dd
            if (r0 != 0) goto L3e5
        L3dd:
            if (r3 == 0) goto L3f8
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3f8
        L3e5:
            if (r0 == 0) goto L3f1
            java.lang.String r3 = r0.f4741a0
            if (r3 != 0) goto L3ef
            java.lang.String r3 = r0.f4742b0
            if (r3 == 0) goto L3f1
        L3ef:
            r3 = 1
            goto L3f2
        L3f1:
            r3 = 0
        L3f2:
            r1.f4841p0 = r3
            r1.f4842q0 = r0
            r2 = r2 | 32
        L3f8:
            java.lang.String r0 = "videoInfo"
            org.json.JSONObject r0 = r6.optJSONObject(r0)
            android.os.Parcelable$Creator<c6.t> r3 = p036c6.C0911t.CREATOR
            if (r0 != 0) goto L404
            goto L487
        L404:
            java.lang.String r3 = "hdrType"
            java.lang.String r3 = r0.getString(r3)     // Catch: org.json.JSONException -> L47c
            int r4 = r3.hashCode()     // Catch: org.json.JSONException -> L47c
            r5 = 3218(0xc92, float:4.51E-42)
            if (r4 == r5) goto L440
            r5 = 103158(0x192f6, float:1.44555E-40)
            if (r4 == r5) goto L436
            r5 = 113729(0x1bc41, float:1.59368E-40)
            if (r4 == r5) goto L42c
            r5 = 99136405(0x5e8b395, float:2.1883143E-35)
            if (r4 == r5) goto L422
            goto L44a
        L422:
            java.lang.String r4 = "hdr10"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L44a
            r4 = 1
            goto L44b
        L42c:
            java.lang.String r4 = "sdr"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L44a
            r4 = 3
            goto L44b
        L436:
            java.lang.String r4 = "hdr"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L44a
            r4 = 2
            goto L44b
        L440:
            java.lang.String r4 = "dv"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L44a
            r4 = 0
            goto L44b
        L44a:
            r4 = -1
        L44b:
            if (r4 == 0) goto L468
            r5 = 1
            if (r4 == r5) goto L466
            r7 = 2
            if (r4 == r7) goto L464
            r7 = 3
            if (r4 == r7) goto L46a
            h6.b r4 = p036c6.C0911t.f4867b0     // Catch: org.json.JSONException -> L47c
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: org.json.JSONException -> L47c
            r7 = 0
            r5[r7] = r3     // Catch: org.json.JSONException -> L47c
            java.lang.String r3 = "Unknown HDR type: %s"
            r4.m6376a(r3, r5)     // Catch: org.json.JSONException -> L47c
            r5 = 0
            goto L46a
        L464:
            r5 = 4
            goto L46a
        L466:
            r5 = 2
            goto L46a
        L468:
            r7 = 3
            r5 = 3
        L46a:
            c6.t r3 = new c6.t     // Catch: org.json.JSONException -> L47c
            java.lang.String r4 = "width"
            int r4 = r0.getInt(r4)     // Catch: org.json.JSONException -> L47c
            java.lang.String r7 = "height"
            int r0 = r0.getInt(r7)     // Catch: org.json.JSONException -> L47c
            r3.<init>(r4, r0, r5)     // Catch: org.json.JSONException -> L47c
            goto L488
        L47c:
            r0 = move-exception
            h6.b r3 = p036c6.C0911t.f4867b0
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = "Error while creating a VideoInfo instance from JSON"
            r3.m6377b(r0, r4, r5)
        L487:
            r3 = 0
        L488:
            c6.t r0 = r1.f4843r0
            if (r0 != 0) goto L48e
            if (r3 != 0) goto L496
        L48e:
            if (r0 == 0) goto L49a
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L49a
        L496:
            r1.f4843r0 = r3
            r2 = r2 | 64
        L49a:
            java.lang.String r0 = "breakInfo"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto L4af
            com.google.android.gms.cast.MediaInfo r3 = r1.f4824Y
            if (r3 == 0) goto L4af
            org.json.JSONObject r0 = r6.getJSONObject(r0)
            r3.m2930X(r0)
            r2 = r2 | 2
        L4af:
            java.lang.String r0 = "queueData"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto L4cc
            c6.m$a r3 = new c6.m$a
            r3.<init>()
            org.json.JSONObject r0 = r6.getJSONObject(r0)
            r3.m2606a(r0)
            c6.m r0 = new c6.m
            c6.m r3 = r3.f4810a
            r0.<init>(r3)
            r1.f4845t0 = r0
        L4cc:
            java.lang.String r0 = "liveSeekableRange"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto L52b
            org.json.JSONObject r0 = r6.optJSONObject(r0)
            android.os.Parcelable$Creator<c6.i> r3 = p036c6.C0889i.CREATOR
            if (r0 != 0) goto L4dd
            goto L524
        L4dd:
            java.lang.String r3 = "start"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L524
            java.lang.String r4 = "end"
            boolean r5 = r0.has(r4)
            if (r5 != 0) goto L4ee
            goto L524
        L4ee:
            double r5 = r0.getDouble(r3)     // Catch: org.json.JSONException -> L512
            long r8 = p123h6.C2487a.m6365d(r5)     // Catch: org.json.JSONException -> L512
            double r3 = r0.getDouble(r4)     // Catch: org.json.JSONException -> L512
            java.lang.String r5 = "isMovingWindow"
            boolean r12 = r0.optBoolean(r5)     // Catch: org.json.JSONException -> L512
            java.lang.String r5 = "isLiveDone"
            boolean r13 = r0.optBoolean(r5)     // Catch: org.json.JSONException -> L512
            c6.i r5 = new c6.i     // Catch: org.json.JSONException -> L512
            long r10 = p123h6.C2487a.m6365d(r3)     // Catch: org.json.JSONException -> L512
            r7 = r5
            r7.<init>(r8, r10, r12, r13)     // Catch: org.json.JSONException -> L512
            r10 = r5
            goto L525
        L512:
            h6.b r3 = p036c6.C0889i.f4773c0
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "Ignoring Malformed MediaLiveSeekableRange: "
            java.lang.String r0 = r4.concat(r0)
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r3.m6378c(r0, r4)
        L524:
            r10 = 0
        L525:
            r1.f4844s0 = r10
            r3 = 2
            r0 = r2 | 2
            goto L535
        L52b:
            c6.i r0 = r1.f4844s0
            if (r0 == 0) goto L531
            r2 = r2 | 2
        L531:
            r3 = 0
            r1.f4844s0 = r3
            r0 = r2
        L535:
            return r0
    }

    /* renamed from: Z */
    public final void m2611Z(java.util.List<p036c6.C0899n> r5) {
            r4 = this;
            java.util.List<c6.n> r0 = r4.f4840o0
            r0.clear()
            android.util.SparseArray<java.lang.Integer> r0 = r4.f4846u0
            r0.clear()
            r0 = 0
        Lb:
            int r1 = r5.size()
            if (r0 >= r1) goto L2a
            java.lang.Object r1 = r5.get(r0)
            c6.n r1 = (p036c6.C0899n) r1
            java.util.List<c6.n> r2 = r4.f4840o0
            r2.add(r1)
            android.util.SparseArray<java.lang.Integer> r2 = r4.f4846u0
            int r1 = r1.f4812Z
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r3)
            int r0 = r0 + 1
            goto Lb
        L2a:
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p036c6.C0903p
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.p r8 = (p036c6.C0903p) r8
            org.json.JSONObject r1 = r7.f4838m0
            if (r1 == 0) goto L12
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            org.json.JSONObject r3 = r8.f4838m0
            if (r3 == 0) goto L19
            r3 = 0
            goto L1a
        L19:
            r3 = 1
        L1a:
            if (r1 == r3) goto L1d
            return r2
        L1d:
            long r3 = r7.f4825Z
            long r5 = r8.f4825Z
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Ld4
            int r1 = r7.f4826a0
            int r3 = r8.f4826a0
            if (r1 != r3) goto Ld4
            double r3 = r7.f4827b0
            double r5 = r8.f4827b0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Ld4
            int r1 = r7.f4828c0
            int r3 = r8.f4828c0
            if (r1 != r3) goto Ld4
            int r1 = r7.f4829d0
            int r3 = r8.f4829d0
            if (r1 != r3) goto Ld4
            long r3 = r7.f4830e0
            long r5 = r8.f4830e0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Ld4
            double r3 = r7.f4832g0
            double r5 = r8.f4832g0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Ld4
            boolean r1 = r7.f4833h0
            boolean r3 = r8.f4833h0
            if (r1 != r3) goto Ld4
            int r1 = r7.f4835j0
            int r3 = r8.f4835j0
            if (r1 != r3) goto Ld4
            int r1 = r7.f4836k0
            int r3 = r8.f4836k0
            if (r1 != r3) goto Ld4
            int r1 = r7.f4839n0
            int r3 = r8.f4839n0
            if (r1 != r3) goto Ld4
            long[] r1 = r7.f4834i0
            long[] r3 = r8.f4834i0
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto Ld4
            long r3 = r7.f4831f0
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            long r3 = r8.f4831f0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Ld4
            java.util.List<c6.n> r1 = r7.f4840o0
            java.util.List<c6.n> r3 = r8.f4840o0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Ld4
            com.google.android.gms.cast.MediaInfo r1 = r7.f4824Y
            com.google.android.gms.cast.MediaInfo r3 = r8.f4824Y
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Ld4
            org.json.JSONObject r1 = r7.f4838m0
            if (r1 == 0) goto La5
            org.json.JSONObject r3 = r8.f4838m0
            if (r3 == 0) goto La5
            boolean r1 = p353u6.C6344g.m12994a(r1, r3)
            if (r1 == 0) goto Ld4
        La5:
            boolean r1 = r7.f4841p0
            boolean r3 = r8.f4841p0
            if (r1 != r3) goto Ld4
            c6.c r1 = r7.f4842q0
            c6.c r3 = r8.f4842q0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Ld4
            c6.t r1 = r7.f4843r0
            c6.t r3 = r8.f4843r0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Ld4
            c6.i r1 = r7.f4844s0
            c6.i r3 = r8.f4844s0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Ld4
            c6.m r1 = r7.f4845t0
            c6.m r8 = r8.f4845t0
            boolean r8 = p248o6.C4924o.m11074a(r1, r8)
            if (r8 == 0) goto Ld4
            return r0
        Ld4:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 21
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.cast.MediaInfo r1 = r3.f4824Y
            r2 = 0
            r0[r2] = r1
            long r1 = r3.f4825Z
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.f4826a0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            double r1 = r3.f4827b0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r1 = r3.f4828c0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r1 = r3.f4829d0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            long r1 = r3.f4830e0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            long r1 = r3.f4831f0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            double r1 = r3.f4832g0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            boolean r1 = r3.f4833h0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 9
            r0[r2] = r1
            long[] r1 = r3.f4834i0
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 10
            r0[r2] = r1
            int r1 = r3.f4835j0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 11
            r0[r2] = r1
            int r1 = r3.f4836k0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 12
            r0[r2] = r1
            org.json.JSONObject r1 = r3.f4838m0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 13
            r0[r2] = r1
            int r1 = r3.f4839n0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 14
            r0[r2] = r1
            java.util.List<c6.n> r1 = r3.f4840o0
            r2 = 15
            r0[r2] = r1
            boolean r1 = r3.f4841p0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 16
            r0[r2] = r1
            c6.c r1 = r3.f4842q0
            r2 = 17
            r0[r2] = r1
            c6.t r1 = r3.f4843r0
            r2 = 18
            r0[r2] = r1
            c6.i r1 = r3.f4844s0
            r2 = 19
            r0[r2] = r1
            c6.m r1 = r3.f4845t0
            r2 = 20
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r8, int r9) {
            r7 = this;
            org.json.JSONObject r0 = r7.f4838m0
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r0.toString()
        La:
            r7.f4837l0 = r0
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r8, r0)
            r1 = 2
            com.google.android.gms.cast.MediaInfo r2 = r7.f4824Y
            r3 = 0
            p270p6.C5369c.m11718f(r8, r1, r2, r9, r3)
            r1 = 3
            long r4 = r7.f4825Z
            r2 = 8
            p270p6.C5369c.m11724l(r8, r1, r2)
            r8.writeLong(r4)
            int r1 = r7.f4826a0
            r4 = 4
            p270p6.C5369c.m11724l(r8, r4, r4)
            r8.writeInt(r1)
            r1 = 5
            double r5 = r7.f4827b0
            p270p6.C5369c.m11724l(r8, r1, r2)
            r8.writeDouble(r5)
            r1 = 6
            int r5 = r7.f4828c0
            p270p6.C5369c.m11724l(r8, r1, r4)
            r8.writeInt(r5)
            r1 = 7
            int r5 = r7.f4829d0
            p270p6.C5369c.m11724l(r8, r1, r4)
            r8.writeInt(r5)
            long r5 = r7.f4830e0
            p270p6.C5369c.m11724l(r8, r2, r2)
            r8.writeLong(r5)
            r1 = 9
            long r5 = r7.f4831f0
            p270p6.C5369c.m11724l(r8, r1, r2)
            r8.writeLong(r5)
            r1 = 10
            double r5 = r7.f4832g0
            p270p6.C5369c.m11724l(r8, r1, r2)
            r8.writeDouble(r5)
            r1 = 11
            boolean r2 = r7.f4833h0
            p270p6.C5369c.m11724l(r8, r1, r4)
            r8.writeInt(r2)
            r1 = 12
            long[] r2 = r7.f4834i0
            p270p6.C5369c.m11716d(r8, r1, r2, r3)
            r1 = 13
            int r2 = r7.f4835j0
            p270p6.C5369c.m11724l(r8, r1, r4)
            r8.writeInt(r2)
            r1 = 14
            int r2 = r7.f4836k0
            p270p6.C5369c.m11724l(r8, r1, r4)
            r8.writeInt(r2)
            r1 = 15
            java.lang.String r2 = r7.f4837l0
            p270p6.C5369c.m11719g(r8, r1, r2, r3)
            r1 = 16
            int r2 = r7.f4839n0
            p270p6.C5369c.m11724l(r8, r1, r4)
            r8.writeInt(r2)
            r1 = 17
            java.util.List<c6.n> r2 = r7.f4840o0
            p270p6.C5369c.m11722j(r8, r1, r2, r3)
            r1 = 18
            boolean r2 = r7.f4841p0
            p270p6.C5369c.m11724l(r8, r1, r4)
            r8.writeInt(r2)
            r1 = 19
            c6.c r2 = r7.f4842q0
            p270p6.C5369c.m11718f(r8, r1, r2, r9, r3)
            r1 = 20
            c6.t r2 = r7.f4843r0
            p270p6.C5369c.m11718f(r8, r1, r2, r9, r3)
            r1 = 21
            c6.i r2 = r7.f4844s0
            p270p6.C5369c.m11718f(r8, r1, r2, r9, r3)
            r1 = 22
            c6.m r2 = r7.f4845t0
            p270p6.C5369c.m11718f(r8, r1, r2, r9, r3)
            p270p6.C5369c.m11726n(r8, r0)
            return
    }
}
