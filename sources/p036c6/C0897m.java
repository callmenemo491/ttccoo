package p036c6;

/* renamed from: c6.m */
/* loaded from: classes.dex */
public class C0897m extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0897m> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f4801Y;

    /* renamed from: Z */
    public java.lang.String f4802Z;

    /* renamed from: a0 */
    public int f4803a0;

    /* renamed from: b0 */
    public java.lang.String f4804b0;

    /* renamed from: c0 */
    public p036c6.C0895l f4805c0;

    /* renamed from: d0 */
    public int f4806d0;

    /* renamed from: e0 */
    public java.util.List<p036c6.C0899n> f4807e0;

    /* renamed from: f0 */
    public int f4808f0;

    /* renamed from: g0 */
    public long f4809g0;

    /* renamed from: c6.m$a */
    public static class a {

        /* renamed from: a */
        public final p036c6.C0897m f4810a;

        public a() {
                r2 = this;
                r2.<init>()
                c6.m r0 = new c6.m
                r1 = 0
                r0.<init>(r1)
                r2.f4810a = r0
                return
        }

        @androidx.annotation.RecentlyNonNull
        /* renamed from: a */
        public final p036c6.C0897m.a m2606a(@androidx.annotation.RecentlyNonNull org.json.JSONObject r13) {
                r12 = this;
                c6.m r0 = r12.f4810a
                r0.m2605X()
                if (r13 != 0) goto L9
                goto L19b
            L9:
                java.lang.String r1 = "id"
                java.lang.String r1 = p123h6.C2487a.m6364c(r13, r1)
                r0.f4801Y = r1
                java.lang.String r1 = "entity"
                java.lang.String r1 = p123h6.C2487a.m6364c(r13, r1)
                r0.f4802Z = r1
                java.lang.String r1 = "queueType"
                java.lang.String r1 = r13.optString(r1)
                int r2 = r1.hashCode()
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 5
                r7 = 8
                r8 = 6
                r9 = 7
                r10 = 0
                r11 = 1
                switch(r2) {
                    case -1803151310: goto L82;
                    case -1758903120: goto L78;
                    case -1632865838: goto L6e;
                    case -1319760993: goto L64;
                    case -1088524588: goto L5a;
                    case 62359119: goto L50;
                    case 73549584: goto L45;
                    case 393100598: goto L3b;
                    case 902303413: goto L31;
                    default: goto L30;
                }
            L30:
                goto L8c
            L31:
                java.lang.String r2 = "LIVE_TV"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L8c
                r1 = 7
                goto L8d
            L3b:
                java.lang.String r2 = "VIDEO_PLAYLIST"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L8c
                r1 = 6
                goto L8d
            L45:
                java.lang.String r2 = "MOVIE"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L8c
                r1 = 8
                goto L8d
            L50:
                java.lang.String r2 = "ALBUM"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L8c
                r1 = 0
                goto L8d
            L5a:
                java.lang.String r2 = "TV_SERIES"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L8c
                r1 = 5
                goto L8d
            L64:
                java.lang.String r2 = "AUDIOBOOK"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L8c
                r1 = 2
                goto L8d
            L6e:
                java.lang.String r2 = "PLAYLIST"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L8c
                r1 = 1
                goto L8d
            L78:
                java.lang.String r2 = "RADIO_STATION"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L8c
                r1 = 3
                goto L8d
            L82:
                java.lang.String r2 = "PODCAST_SERIES"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L8c
                r1 = 4
                goto L8d
            L8c:
                r1 = -1
            L8d:
                switch(r1) {
                    case 0: goto Lab;
                    case 1: goto La8;
                    case 2: goto La5;
                    case 3: goto La2;
                    case 4: goto L9f;
                    case 5: goto L9c;
                    case 6: goto L99;
                    case 7: goto L96;
                    case 8: goto L91;
                    default: goto L90;
                }
            L90:
                goto Lad
            L91:
                r1 = 9
                r0.f4803a0 = r1
                goto Lad
            L96:
                r0.f4803a0 = r7
                goto Lad
            L99:
                r0.f4803a0 = r9
                goto Lad
            L9c:
                r0.f4803a0 = r8
                goto Lad
            L9f:
                r0.f4803a0 = r6
                goto Lad
            La2:
                r0.f4803a0 = r3
                goto Lad
            La5:
                r0.f4803a0 = r4
                goto Lad
            La8:
                r0.f4803a0 = r5
                goto Lad
            Lab:
                r0.f4803a0 = r11
            Lad:
                java.lang.String r1 = "name"
                java.lang.String r1 = p123h6.C2487a.m6364c(r13, r1)
                r0.f4804b0 = r1
                java.lang.String r1 = "containerMetadata"
                boolean r2 = r13.has(r1)
                r3 = 0
                if (r2 == 0) goto Lc3
                org.json.JSONObject r1 = r13.optJSONObject(r1)
                goto Lc4
            Lc3:
                r1 = r3
            Lc4:
                if (r1 == 0) goto L144
                c6.l r2 = new c6.l
                r2.<init>(r3)
                r2.m2604X()
                java.lang.String r3 = "containerType"
                java.lang.String r4 = ""
                java.lang.String r3 = r1.optString(r3, r4)
                r3.hashCode()
                java.lang.String r4 = "GENERIC_CONTAINER"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto Led
                java.lang.String r4 = "AUDIOBOOK_CONTAINER"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto Lea
                goto Lef
            Lea:
                r2.f4796Y = r11
                goto Lef
            Led:
                r2.f4796Y = r10
            Lef:
                java.lang.String r3 = "title"
                java.lang.String r3 = p123h6.C2487a.m6364c(r1, r3)
                r2.f4797Z = r3
                java.lang.String r3 = "sections"
                org.json.JSONArray r3 = r1.optJSONArray(r3)
                if (r3 == 0) goto L121
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r2.f4798a0 = r4
                r5 = 0
            L107:
                int r6 = r3.length()
                if (r5 >= r6) goto L121
                org.json.JSONObject r6 = r3.optJSONObject(r5)
                if (r6 == 0) goto L11e
                c6.k r7 = new c6.k
                r7.<init>(r10)
                r7.m2602b0(r6)
                r4.add(r7)
            L11e:
                int r5 = r5 + 1
                goto L107
            L121:
                java.lang.String r3 = "containerImages"
                org.json.JSONArray r3 = r1.optJSONArray(r3)
                if (r3 == 0) goto L133
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r2.f4799b0 = r4
                p144i6.C3091b.m7552b(r4, r3)
            L133:
                double r3 = r2.f4800c0
                java.lang.String r5 = "containerDuration"
                double r3 = r1.optDouble(r5, r3)
                r2.f4800c0 = r3
                c6.l r1 = new c6.l
                r1.<init>(r2)
                r0.f4805c0 = r1
            L144:
                java.lang.String r1 = "repeatMode"
                java.lang.String r1 = r13.optString(r1)
                java.lang.Integer r1 = p144i6.C3090a.m7550a(r1)
                if (r1 == 0) goto L156
                int r1 = r1.intValue()
                r0.f4806d0 = r1
            L156:
                java.lang.String r1 = "items"
                org.json.JSONArray r1 = r13.optJSONArray(r1)
                if (r1 == 0) goto L17c
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r0.f4807e0 = r2
            L165:
                int r3 = r1.length()
                if (r10 >= r3) goto L17c
                org.json.JSONObject r3 = r1.optJSONObject(r10)
                if (r3 == 0) goto L179
                c6.n r4 = new c6.n     // Catch: org.json.JSONException -> L179
                r4.<init>(r3)     // Catch: org.json.JSONException -> L179
                r2.add(r4)     // Catch: org.json.JSONException -> L179
            L179:
                int r10 = r10 + 1
                goto L165
            L17c:
                int r1 = r0.f4808f0
                java.lang.String r2 = "startIndex"
                int r1 = r13.optInt(r2, r1)
                r0.f4808f0 = r1
                java.lang.String r1 = "startTime"
                boolean r2 = r13.has(r1)
                if (r2 == 0) goto L19b
                long r2 = r0.f4809g0
                double r2 = (double) r2
                double r1 = r13.optDouble(r1, r2)
                long r1 = p123h6.C2487a.m6365d(r1)
                r0.f4809g0 = r1
            L19b:
                return r12
        }
    }

    static {
            c6.r0 r0 = new c6.r0
            r0.<init>()
            p036c6.C0897m.CREATOR = r0
            return
    }

    public C0897m() {
            r0 = this;
            r0.<init>()
            r0.m2605X()
            return
    }

    public /* synthetic */ C0897m(p036c6.C0897m r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.f4801Y
            r2.f4801Y = r0
            java.lang.String r0 = r3.f4802Z
            r2.f4802Z = r0
            int r0 = r3.f4803a0
            r2.f4803a0 = r0
            java.lang.String r0 = r3.f4804b0
            r2.f4804b0 = r0
            c6.l r0 = r3.f4805c0
            r2.f4805c0 = r0
            int r0 = r3.f4806d0
            r2.f4806d0 = r0
            java.util.List<c6.n> r0 = r3.f4807e0
            r2.f4807e0 = r0
            int r0 = r3.f4808f0
            r2.f4808f0 = r0
            long r0 = r3.f4809g0
            r2.f4809g0 = r0
            return
    }

    public /* synthetic */ C0897m(p036c6.C0906q0 r1) {
            r0 = this;
            r0.<init>()
            r0.m2605X()
            return
    }

    public C0897m(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, p036c6.C0895l r5, int r6, java.util.List<p036c6.C0899n> r7, int r8, long r9) {
            r0 = this;
            r0.<init>()
            r0.f4801Y = r1
            r0.f4802Z = r2
            r0.f4803a0 = r3
            r0.f4804b0 = r4
            r0.f4805c0 = r5
            r0.f4806d0 = r6
            r0.f4807e0 = r7
            r0.f4808f0 = r8
            r0.f4809g0 = r9
            return
    }

    /* renamed from: X */
    public final void m2605X() {
            r2 = this;
            r0 = 0
            r2.f4801Y = r0
            r2.f4802Z = r0
            r1 = 0
            r2.f4803a0 = r1
            r2.f4804b0 = r0
            r2.f4806d0 = r1
            r2.f4807e0 = r0
            r2.f4808f0 = r1
            r0 = -1
            r2.f4809g0 = r0
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p036c6.C0897m
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.m r8 = (p036c6.C0897m) r8
            java.lang.String r1 = r7.f4801Y
            java.lang.String r3 = r8.f4801Y
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L59
            java.lang.String r1 = r7.f4802Z
            java.lang.String r3 = r8.f4802Z
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L59
            int r1 = r7.f4803a0
            int r3 = r8.f4803a0
            if (r1 != r3) goto L59
            java.lang.String r1 = r7.f4804b0
            java.lang.String r3 = r8.f4804b0
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L59
            c6.l r1 = r7.f4805c0
            c6.l r3 = r8.f4805c0
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L59
            int r1 = r7.f4806d0
            int r3 = r8.f4806d0
            if (r1 != r3) goto L59
            java.util.List<c6.n> r1 = r7.f4807e0
            java.util.List<c6.n> r3 = r8.f4807e0
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L59
            int r1 = r7.f4808f0
            int r3 = r8.f4808f0
            if (r1 != r3) goto L59
            long r3 = r7.f4809g0
            long r5 = r8.f4809g0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L59
            return r0
        L59:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f4801Y
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f4802Z
            r2 = 1
            r0[r2] = r1
            int r1 = r3.f4803a0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.f4804b0
            r2 = 3
            r0[r2] = r1
            c6.l r1 = r3.f4805c0
            r2 = 4
            r0[r2] = r1
            int r1 = r3.f4806d0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            java.util.List<c6.n> r1 = r3.f4807e0
            r2 = 6
            r0[r2] = r1
            int r1 = r3.f4808f0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            long r1 = r3.f4809g0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 2
            java.lang.String r2 = r5.f4801Y
            r3 = 0
            p270p6.C5369c.m11719g(r6, r1, r2, r3)
            r1 = 3
            java.lang.String r2 = r5.f4802Z
            p270p6.C5369c.m11719g(r6, r1, r2, r3)
            int r1 = r5.f4803a0
            r2 = 4
            p270p6.C5369c.m11724l(r6, r2, r2)
            r6.writeInt(r1)
            r1 = 5
            java.lang.String r4 = r5.f4804b0
            p270p6.C5369c.m11719g(r6, r1, r4, r3)
            r1 = 6
            c6.l r4 = r5.f4805c0
            p270p6.C5369c.m11718f(r6, r1, r4, r7, r3)
            r7 = 7
            int r1 = r5.f4806d0
            p270p6.C5369c.m11724l(r6, r7, r2)
            r6.writeInt(r1)
            java.util.List<c6.n> r7 = r5.f4807e0
            if (r7 != 0) goto L37
            r7 = 0
            goto L3b
        L37:
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
        L3b:
            r1 = 8
            p270p6.C5369c.m11722j(r6, r1, r7, r3)
            r7 = 9
            int r3 = r5.f4808f0
            p270p6.C5369c.m11724l(r6, r7, r2)
            r6.writeInt(r3)
            r7 = 10
            long r2 = r5.f4809g0
            p270p6.C5369c.m11724l(r6, r7, r1)
            r6.writeLong(r2)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
