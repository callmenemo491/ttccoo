package p116h;

@android.annotation.SuppressLint({"RestrictedAPI"})
/* renamed from: h.b */
/* loaded from: classes.dex */
public class C2431b extends p116h.C2434e implements p103g0.InterfaceC2201b {

    /* renamed from: n0 */
    public p116h.C2431b.c f10801n0;

    /* renamed from: o0 */
    public p116h.C2431b.g f10802o0;

    /* renamed from: p0 */
    public int f10803p0;

    /* renamed from: q0 */
    public int f10804q0;

    /* renamed from: r0 */
    public boolean f10805r0;

    /* renamed from: h.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: h.b$b */
    public static class b extends p116h.C2431b.g {

        /* renamed from: a */
        public final android.graphics.drawable.Animatable f10806a;

        public b(android.graphics.drawable.Animatable r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f10806a = r2
                return
        }

        @Override // p116h.C2431b.g
        /* renamed from: c */
        public void mo6160c() {
                r1 = this;
                android.graphics.drawable.Animatable r0 = r1.f10806a
                r0.start()
                return
        }

        @Override // p116h.C2431b.g
        /* renamed from: d */
        public void mo6161d() {
                r1 = this;
                android.graphics.drawable.Animatable r0 = r1.f10806a
                r0.stop()
                return
        }
    }

    /* renamed from: h.b$c */
    public static class c extends p116h.C2434e.a {

        /* renamed from: K */
        public p319s.C5938e<java.lang.Long> f10807K;

        /* renamed from: L */
        public p319s.C5942i<java.lang.Integer> f10808L;

        public c(p116h.C2431b.c r1, p116h.C2431b r2, android.content.res.Resources r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                if (r1 == 0) goto Lc
                s.e<java.lang.Long> r2 = r1.f10807K
                r0.f10807K = r2
                s.i<java.lang.Integer> r1 = r1.f10808L
                goto L18
            Lc:
                s.e r1 = new s.e
                r1.<init>()
                r0.f10807K = r1
                s.i r1 = new s.i
                r1.<init>()
            L18:
                r0.f10808L = r1
                return
        }

        /* renamed from: h */
        public static long m6162h(int r2, int r3) {
                long r0 = (long) r2
                r2 = 32
                long r0 = r0 << r2
                long r2 = (long) r3
                long r2 = r2 | r0
                return r2
        }

        @Override // p116h.C2434e.a, p116h.C2432c.c
        /* renamed from: e */
        public void mo6163e() {
                r1 = this;
                s.e<java.lang.Long> r0 = r1.f10807K
                s.e r0 = r0.m12322c()
                r1.f10807K = r0
                s.i<java.lang.Integer> r0 = r1.f10808L
                s.i r0 = r0.m12346b()
                r1.f10808L = r0
                return
        }

        /* renamed from: i */
        public int m6164i(int r3) {
                r2 = this;
                r0 = 0
                if (r3 >= 0) goto L4
                goto L14
            L4:
                s.i<java.lang.Integer> r1 = r2.f10808L
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r3 = r1.m12349e(r3, r0)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r0 = r3.intValue()
            L14:
                return r0
        }

        @Override // p116h.C2434e.a, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                h.b r0 = new h.b
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // p116h.C2434e.a, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                h.b r0 = new h.b
                r0.<init>(r1, r2)
                return r0
        }
    }

    /* renamed from: h.b$d */
    public static class d extends p116h.C2431b.g {

        /* renamed from: a */
        public final p348u1.C6285c f10809a;

        public d(p348u1.C6285c r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f10809a = r2
                return
        }

        @Override // p116h.C2431b.g
        /* renamed from: c */
        public void mo6160c() {
                r1 = this;
                u1.c r0 = r1.f10809a
                r0.start()
                return
        }

        @Override // p116h.C2431b.g
        /* renamed from: d */
        public void mo6161d() {
                r1 = this;
                u1.c r0 = r1.f10809a
                r0.stop()
                return
        }
    }

    /* renamed from: h.b$e */
    public static class e extends p116h.C2431b.g {

        /* renamed from: a */
        public final android.animation.ObjectAnimator f10810a;

        /* renamed from: b */
        public final boolean f10811b;

        public e(android.graphics.drawable.AnimationDrawable r6, boolean r7, boolean r8) {
                r5 = this;
                r0 = 0
                r5.<init>(r0)
                int r0 = r6.getNumberOfFrames()
                r1 = 0
                if (r7 == 0) goto Le
                int r2 = r0 + (-1)
                goto Lf
            Le:
                r2 = 0
            Lf:
                r3 = 1
                if (r7 == 0) goto L14
                r0 = 0
                goto L15
            L14:
                int r0 = r0 - r3
            L15:
                h.b$f r4 = new h.b$f
                r4.<init>(r6, r7)
                r7 = 2
                int[] r7 = new int[r7]
                r7[r1] = r2
                r7[r3] = r0
                java.lang.String r0 = "currentIndex"
                android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofInt(r6, r0, r7)
                r6.setAutoCancel(r3)
                int r7 = r4.f10814c
                long r0 = (long) r7
                r6.setDuration(r0)
                r6.setInterpolator(r4)
                r5.f10811b = r8
                r5.f10810a = r6
                return
        }

        @Override // p116h.C2431b.g
        /* renamed from: a */
        public boolean mo6165a() {
                r1 = this;
                boolean r0 = r1.f10811b
                return r0
        }

        @Override // p116h.C2431b.g
        /* renamed from: b */
        public void mo6166b() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.f10810a
                r0.reverse()
                return
        }

        @Override // p116h.C2431b.g
        /* renamed from: c */
        public void mo6160c() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.f10810a
                r0.start()
                return
        }

        @Override // p116h.C2431b.g
        /* renamed from: d */
        public void mo6161d() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.f10810a
                r0.cancel()
                return
        }
    }

    /* renamed from: h.b$f */
    public static class f implements android.animation.TimeInterpolator {

        /* renamed from: a */
        public int[] f10812a;

        /* renamed from: b */
        public int f10813b;

        /* renamed from: c */
        public int f10814c;

        public f(android.graphics.drawable.AnimationDrawable r6, boolean r7) {
                r5 = this;
                r5.<init>()
                int r0 = r6.getNumberOfFrames()
                r5.f10813b = r0
                int[] r1 = r5.f10812a
                if (r1 == 0) goto L10
                int r1 = r1.length
                if (r1 >= r0) goto L14
            L10:
                int[] r1 = new int[r0]
                r5.f10812a = r1
            L14:
                int[] r1 = r5.f10812a
                r2 = 0
                r3 = 0
            L18:
                if (r2 >= r0) goto L2c
                if (r7 == 0) goto L21
                int r4 = r0 - r2
                int r4 = r4 + (-1)
                goto L22
            L21:
                r4 = r2
            L22:
                int r4 = r6.getDuration(r4)
                r1[r2] = r4
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L18
            L2c:
                r5.f10814c = r3
                return
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r5) {
                r4 = this;
                int r0 = r4.f10814c
                float r0 = (float) r0
                float r5 = r5 * r0
                r0 = 1056964608(0x3f000000, float:0.5)
                float r5 = r5 + r0
                int r5 = (int) r5
                int r0 = r4.f10813b
                int[] r1 = r4.f10812a
                r2 = 0
            Le:
                if (r2 >= r0) goto L1a
                r3 = r1[r2]
                if (r5 < r3) goto L1a
                r3 = r1[r2]
                int r5 = r5 - r3
                int r2 = r2 + 1
                goto Le
            L1a:
                if (r2 >= r0) goto L22
                float r5 = (float) r5
                int r1 = r4.f10814c
                float r1 = (float) r1
                float r5 = r5 / r1
                goto L23
            L22:
                r5 = 0
            L23:
                float r1 = (float) r2
                float r0 = (float) r0
                float r1 = r1 / r0
                float r1 = r1 + r5
                return r1
        }
    }

    /* renamed from: h.b$g */
    public static abstract class g {
        public g(p116h.C2431b.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public boolean mo6165a() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: b */
        public void mo6166b() {
                r0 = this;
                return
        }

        /* renamed from: c */
        public abstract void mo6160c();

        /* renamed from: d */
        public abstract void mo6161d();
    }

    static {
            java.lang.Class<h.b> r0 = p116h.C2431b.class
            return
    }

    public C2431b() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    public C2431b(p116h.C2431b.c r2, android.content.res.Resources r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = -1
            r1.f10803p0 = r0
            r1.f10804q0 = r0
            h.b$c r0 = new h.b$c
            r0.<init>(r2, r1, r3)
            super.mo6158e(r0)
            r1.f10801n0 = r0
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            r1.jumpToCurrentState()
            return
    }

    /* renamed from: g */
    public static p116h.C2431b m6156g(android.content.Context r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) {
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.String r5 = r21.getName()
            java.lang.String r6 = "animated-selector"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L21e
            h.b r5 = new h.b
            r6 = 0
            r5.<init>(r6, r6)
            int[] r7 = p137i.C3054a.f12284a
            android.content.res.TypedArray r7 = p065e0.C1505j.m4095i(r1, r4, r3, r7)
            r8 = 1
            boolean r9 = r7.getBoolean(r8, r8)
            r5.setVisible(r9, r8)
            h.b$c r9 = r5.f10801n0
            int r10 = r9.f10842d
            int r11 = r7.getChangingConfigurations()
            r10 = r10 | r11
            r9.f10842d = r10
            boolean r10 = r9.f10847i
            r11 = 2
            boolean r10 = r7.getBoolean(r11, r10)
            r9.f10847i = r10
            boolean r10 = r9.f10850l
            r12 = 3
            boolean r10 = r7.getBoolean(r12, r10)
            r9.f10850l = r10
            int r10 = r9.f10830A
            r13 = 4
            int r10 = r7.getInt(r13, r10)
            r9.f10830A = r10
            r10 = 5
            int r14 = r9.f10831B
            int r10 = r7.getInt(r10, r14)
            r9.f10831B = r10
            boolean r9 = r9.f10862x
            r10 = 0
            boolean r9 = r7.getBoolean(r10, r9)
            r5.setDither(r9)
            h.c$c r9 = r5.f10816Y
            r9.m6174f(r1)
            r7.recycle()
            int r7 = r21.getDepth()
            int r7 = r7 + r8
        L70:
            int r9 = r21.next()
            if (r9 == r8) goto L216
            int r14 = r21.getDepth()
            if (r14 >= r7) goto L7e
            if (r9 == r12) goto L216
        L7e:
            if (r9 == r11) goto L81
            goto L70
        L81:
            if (r14 <= r7) goto L84
            goto L70
        L84:
            java.lang.String r9 = r21.getName()
            java.lang.String r11 = "item"
            boolean r9 = r9.equals(r11)
            r11 = -1
            if (r9 == 0) goto L13d
            int[] r9 = p137i.C3054a.f12285b
            android.content.res.TypedArray r9 = p065e0.C1505j.m4095i(r1, r4, r3, r9)
            int r12 = r9.getResourceId(r10, r10)
            int r8 = r9.getResourceId(r8, r11)
            if (r8 <= 0) goto La9
            androidx.appcompat.widget.m0 r6 = androidx.appcompat.widget.C0290m0.m754d()
            android.graphics.drawable.Drawable r6 = r6.m761f(r0, r8)
        La9:
            r9.recycle()
            int r8 = r22.getAttributeCount()
            int[] r9 = new int[r8]
            r11 = 0
            r14 = 0
        Lb4:
            if (r11 >= r8) goto Lda
            int r15 = r3.getAttributeNameResource(r11)
            r16 = r7
            if (r15 == 0) goto Ld5
            r7 = 16842960(0x10100d0, float:2.369414E-38)
            if (r15 == r7) goto Ld5
            r7 = 16843161(0x1010199, float:2.3694704E-38)
            if (r15 == r7) goto Ld5
            int r7 = r14 + 1
            boolean r17 = r3.getAttributeBooleanValue(r11, r10)
            if (r17 == 0) goto Ld1
            goto Ld2
        Ld1:
            int r15 = -r15
        Ld2:
            r9[r14] = r15
            r14 = r7
        Ld5:
            int r11 = r11 + 1
            r7 = r16
            goto Lb4
        Lda:
            r16 = r7
            int[] r7 = android.util.StateSet.trimStateSet(r9, r14)
            java.lang.String r8 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r6 != 0) goto L113
        Le4:
            int r6 = r21.next()
            if (r6 != r13) goto Leb
            goto Le4
        Leb:
            r9 = 2
            if (r6 != r9) goto L104
            java.lang.String r6 = r21.getName()
            java.lang.String r9 = "vector"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto Lff
            u1.g r6 = p348u1.C6289g.m12916a(r20, r21, r22, r23)
            goto L113
        Lff:
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22, r23)
            goto L113
        L104:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p116h.C2430a.m6155a(r2, r1, r8)
            r0.<init>(r1)
            throw r0
        L113:
            if (r6 == 0) goto L12e
            h.b$c r8 = r5.f10801n0
            int r6 = r8.m6170a(r6)
            int[][] r9 = r8.f10868J
            r9[r6] = r7
            s.i<java.lang.Integer> r7 = r8.f10808L
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r7.m12351g(r6, r8)
            r6 = 0
            r8 = 1
            r11 = 2
            r12 = 3
            goto L212
        L12e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p116h.C2430a.m6155a(r2, r1, r8)
            r0.<init>(r1)
            throw r0
        L13d:
            r16 = r7
            java.lang.String r6 = r21.getName()
            java.lang.String r7 = "transition"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L208
            int[] r6 = p137i.C3054a.f12286c
            android.content.res.TypedArray r6 = p065e0.C1505j.m4095i(r1, r4, r3, r6)
            r7 = 2
            int r7 = r6.getResourceId(r7, r11)
            r8 = 1
            int r8 = r6.getResourceId(r8, r11)
            int r9 = r6.getResourceId(r10, r11)
            if (r9 <= 0) goto L16a
            androidx.appcompat.widget.m0 r12 = androidx.appcompat.widget.C0290m0.m754d()
            android.graphics.drawable.Drawable r9 = r12.m761f(r0, r9)
            goto L16b
        L16a:
            r9 = 0
        L16b:
            r12 = 3
            boolean r10 = r6.getBoolean(r12, r10)
            r6.recycle()
            java.lang.String r6 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r9 != 0) goto L1ab
        L177:
            int r9 = r21.next()
            if (r9 != r13) goto L17e
            goto L177
        L17e:
            r12 = 2
            if (r9 != r12) goto L19c
            java.lang.String r9 = r21.getName()
            java.lang.String r12 = "animated-vector"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L197
            u1.c r9 = new u1.c
            r12 = 0
            r9.<init>(r0, r12, r12)
            r9.inflate(r1, r2, r3, r4)
            goto L1ab
        L197:
            android.graphics.drawable.Drawable r9 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22, r23)
            goto L1ab
        L19c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p116h.C2430a.m6155a(r2, r1, r6)
            r0.<init>(r1)
            throw r0
        L1ab:
            if (r9 == 0) goto L1f9
            if (r7 == r11) goto L1e8
            if (r8 == r11) goto L1e8
            h.b$c r6 = r5.f10801n0
            int r9 = r6.m6170a(r9)
            long r11 = p116h.C2431b.c.m6162h(r7, r8)
            if (r10 == 0) goto L1c3
            r13 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L1c5
        L1c3:
            r13 = 0
        L1c5:
            s.e<java.lang.Long> r15 = r6.f10807K
            long r0 = (long) r9
            long r17 = r0 | r13
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r15.m12320a(r11, r9)
            if (r10 == 0) goto L208
            long r7 = p116h.C2431b.c.m6162h(r8, r7)
            s.e<java.lang.Long> r6 = r6.f10807K
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 | r9
            long r0 = r0 | r13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.m12320a(r7, r0)
            goto L208
        L1e8:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.String r1 = p116h.C2430a.m6155a(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L1f9:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p116h.C2430a.m6155a(r2, r1, r6)
            r0.<init>(r1)
            throw r0
        L208:
            r6 = 0
            r8 = 1
            r10 = 0
            r11 = 2
            r12 = 3
            r13 = 4
            r0 = r19
            r1 = r20
        L212:
            r7 = r16
            goto L70
        L216:
            int[] r0 = r5.getState()
            r5.onStateChange(r0)
            return r5
        L21e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r21.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // p116h.C2434e, p116h.C2432c
    /* renamed from: b */
    public p116h.C2432c.c mo6157b() {
            r3 = this;
            h.b$c r0 = new h.b$c
            h.b$c r1 = r3.f10801n0
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // p116h.C2434e, p116h.C2432c
    /* renamed from: e */
    public void mo6158e(p116h.C2432c.c r2) {
            r1 = this;
            super.mo6158e(r2)
            boolean r0 = r2 instanceof p116h.C2431b.c
            if (r0 == 0) goto Lb
            h.b$c r2 = (p116h.C2431b.c) r2
            r1.f10801n0 = r2
        Lb:
            return
    }

    @Override // p116h.C2434e
    /* renamed from: f */
    public p116h.C2434e.a mo6159f() {
            r3 = this;
            h.b$c r0 = new h.b$c
            h.b$c r1 = r3.f10801n0
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // p116h.C2432c, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            super.jumpToCurrentState()
            h.b$g r0 = r1.f10802o0
            if (r0 == 0) goto L17
            r0.mo6161d()
            r0 = 0
            r1.f10802o0 = r0
            int r0 = r1.f10803p0
            r1.m6169d(r0)
            r0 = -1
            r1.f10803p0 = r0
            r1.f10804q0 = r0
        L17:
            return
    }

    @Override // p116h.C2434e, p116h.C2432c, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.f10805r0
            if (r0 != 0) goto Lf
            super.mutate()
            h.b$c r0 = r1.f10801n0
            r0.mo6163e()
            r0 = 1
            r1.f10805r0 = r0
        Lf:
            return r1
    }

    @Override // p116h.C2434e, p116h.C2432c, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            h.b$c r2 = r0.f10801n0
            int r3 = r2.m6175g(r1)
            if (r3 < 0) goto Ld
            goto L13
        Ld:
            int[] r3 = android.util.StateSet.WILD_CARD
            int r3 = r2.m6175g(r3)
        L13:
            int r2 = r0.f10822e0
            r4 = 0
            r5 = 1
            if (r3 == r2) goto Lf2
            h.b$g r6 = r0.f10802o0
            if (r6 == 0) goto L3d
            int r2 = r0.f10803p0
            if (r3 != r2) goto L24
        L21:
            r2 = 1
            goto Le9
        L24:
            int r2 = r0.f10804q0
            if (r3 != r2) goto L38
            boolean r2 = r6.mo6165a()
            if (r2 == 0) goto L38
            r6.mo6166b()
            int r2 = r0.f10804q0
            r0.f10803p0 = r2
            r0.f10804q0 = r3
            goto L21
        L38:
            int r2 = r0.f10803p0
            r6.mo6161d()
        L3d:
            r6 = 0
            r0.f10802o0 = r6
            r6 = -1
            r0.f10804q0 = r6
            r0.f10803p0 = r6
            h.b$c r6 = r0.f10801n0
            int r7 = r6.m6164i(r2)
            int r8 = r6.m6164i(r3)
            if (r8 == 0) goto Le8
            if (r7 != 0) goto L55
            goto Le8
        L55:
            long r9 = p116h.C2431b.c.m6162h(r7, r8)
            s.e<java.lang.Long> r11 = r6.f10807K
            r12 = -1
            java.lang.Long r14 = java.lang.Long.valueOf(r12)
            java.lang.Object r9 = r11.m12325f(r9, r14)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            int r10 = (int) r9
            if (r10 >= 0) goto L70
            goto Le8
        L70:
            long r14 = p116h.C2431b.c.m6162h(r7, r8)
            s.e<java.lang.Long> r9 = r6.f10807K
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            java.lang.Object r9 = r9.m12325f(r14, r11)
            java.lang.Long r9 = (java.lang.Long) r9
            long r14 = r9.longValue()
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
            long r14 = r14 & r16
            r16 = 0
            int r9 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r9 == 0) goto L93
            r9 = 1
            goto L94
        L93:
            r9 = 0
        L94:
            r0.m6169d(r10)
            android.graphics.drawable.Drawable r10 = r0.f10818a0
            boolean r11 = r10 instanceof android.graphics.drawable.AnimationDrawable
            if (r11 == 0) goto Lc6
            long r7 = p116h.C2431b.c.m6162h(r7, r8)
            s.e<java.lang.Long> r6 = r6.f10807K
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            java.lang.Object r6 = r6.m12325f(r7, r11)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            long r6 = r6 & r11
            int r8 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r8 == 0) goto Lbd
            r6 = 1
            goto Lbe
        Lbd:
            r6 = 0
        Lbe:
            h.b$e r7 = new h.b$e
            android.graphics.drawable.AnimationDrawable r10 = (android.graphics.drawable.AnimationDrawable) r10
            r7.<init>(r10, r6, r9)
            goto Ldd
        Lc6:
            boolean r6 = r10 instanceof p348u1.C6285c
            if (r6 == 0) goto Ld2
            h.b$d r7 = new h.b$d
            u1.c r10 = (p348u1.C6285c) r10
            r7.<init>(r10)
            goto Ldd
        Ld2:
            boolean r6 = r10 instanceof android.graphics.drawable.Animatable
            if (r6 == 0) goto Le8
            h.b$b r7 = new h.b$b
            android.graphics.drawable.Animatable r10 = (android.graphics.drawable.Animatable) r10
            r7.<init>(r10)
        Ldd:
            r7.mo6160c()
            r0.f10802o0 = r7
            r0.f10804q0 = r2
            r0.f10803p0 = r3
            goto L21
        Le8:
            r2 = 0
        Le9:
            if (r2 != 0) goto Lf1
            boolean r2 = r0.m6169d(r3)
            if (r2 == 0) goto Lf2
        Lf1:
            r4 = 1
        Lf2:
            android.graphics.drawable.Drawable r2 = r0.f10818a0
            if (r2 == 0) goto Lfb
            boolean r1 = r2.setState(r1)
            r4 = r4 | r1
        Lfb:
            return r4
    }

    @Override // p116h.C2432c, android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            h.b$g r1 = r2.f10802o0
            if (r1 == 0) goto L15
            if (r0 != 0) goto Lc
            if (r4 == 0) goto L15
        Lc:
            if (r3 == 0) goto L12
            r1.mo6160c()
            goto L15
        L12:
            r2.jumpToCurrentState()
        L15:
            return r0
    }
}
