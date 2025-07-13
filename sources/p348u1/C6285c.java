package p348u1;

/* renamed from: u1.c */
/* loaded from: classes.dex */
public class C6285c extends p348u1.AbstractC6288f implements android.graphics.drawable.Animatable {

    /* renamed from: Z */
    public p348u1.C6285c.b f24454Z;

    /* renamed from: a0 */
    public android.content.Context f24455a0;

    /* renamed from: b0 */
    public android.animation.ArgbEvaluator f24456b0;

    /* renamed from: c0 */
    public final android.graphics.drawable.Drawable.Callback f24457c0;

    /* renamed from: u1.c$a */
    public class a implements android.graphics.drawable.Drawable.Callback {

        /* renamed from: Y */
        public final /* synthetic */ p348u1.C6285c f24458Y;

        public a(p348u1.C6285c r1) {
                r0 = this;
                r0.f24458Y = r1
                r0.<init>()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                u1.c r1 = r0.f24458Y
                r1.invalidateSelf()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
                r0 = this;
                u1.c r1 = r0.f24458Y
                r1.scheduleSelf(r2, r3)
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
                r0 = this;
                u1.c r1 = r0.f24458Y
                r1.unscheduleSelf(r2)
                return
        }
    }

    /* renamed from: u1.c$b */
    public static class b extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: a */
        public int f24459a;

        /* renamed from: b */
        public p348u1.C6289g f24460b;

        /* renamed from: c */
        public android.animation.AnimatorSet f24461c;

        /* renamed from: d */
        public java.util.ArrayList<android.animation.Animator> f24462d;

        /* renamed from: e */
        public p319s.C5934a<android.animation.Animator, java.lang.String> f24463e;

        public b(p348u1.C6285c.b r5, android.graphics.drawable.Drawable.Callback r6, android.content.res.Resources r7) {
                r4 = this;
                r4.<init>()
                if (r5 == 0) goto L93
                int r0 = r5.f24459a
                r4.f24459a = r0
                u1.g r0 = r5.f24460b
                r1 = 0
                if (r0 == 0) goto L38
                android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
                if (r7 == 0) goto L19
                android.graphics.drawable.Drawable r7 = r0.newDrawable(r7)
                goto L1d
            L19:
                android.graphics.drawable.Drawable r7 = r0.newDrawable()
            L1d:
                u1.g r7 = (p348u1.C6289g) r7
                r4.f24460b = r7
                r7.mutate()
                r4.f24460b = r7
                r7.setCallback(r6)
                u1.g r6 = r4.f24460b
                u1.g r7 = r5.f24460b
                android.graphics.Rect r7 = r7.getBounds()
                r6.setBounds(r7)
                u1.g r6 = r4.f24460b
                r6.f24473d0 = r1
            L38:
                java.util.ArrayList<android.animation.Animator> r6 = r5.f24462d
                if (r6 == 0) goto L93
                int r6 = r6.size()
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>(r6)
                r4.f24462d = r7
                s.a r7 = new s.a
                r7.<init>(r6)
                r4.f24463e = r7
            L4e:
                if (r1 >= r6) goto L81
                java.util.ArrayList<android.animation.Animator> r7 = r5.f24462d
                java.lang.Object r7 = r7.get(r1)
                android.animation.Animator r7 = (android.animation.Animator) r7
                android.animation.Animator r0 = r7.clone()
                s.a<android.animation.Animator, java.lang.String> r2 = r5.f24463e
                r3 = 0
                java.lang.Object r7 = r2.getOrDefault(r7, r3)
                java.lang.String r7 = (java.lang.String) r7
                u1.g r2 = r4.f24460b
                u1.g$h r2 = r2.f24469Z
                u1.g$g r2 = r2.f24524b
                s.a<java.lang.String, java.lang.Object> r2 = r2.f24522p
                java.lang.Object r2 = r2.getOrDefault(r7, r3)
                r0.setTarget(r2)
                java.util.ArrayList<android.animation.Animator> r2 = r4.f24462d
                r2.add(r0)
                s.a<android.animation.Animator, java.lang.String> r2 = r4.f24463e
                r2.put(r0, r7)
                int r1 = r1 + 1
                goto L4e
            L81:
                android.animation.AnimatorSet r5 = r4.f24461c
                if (r5 != 0) goto L8c
                android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
                r5.<init>()
                r4.f24461c = r5
            L8c:
                android.animation.AnimatorSet r5 = r4.f24461c
                java.util.ArrayList<android.animation.Animator> r6 = r4.f24462d
                r5.playTogether(r6)
            L93:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.f24459a
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No constant state support for SDK < 24."
                r0.<init>(r1)
                throw r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "No constant state support for SDK < 24."
                r2.<init>(r0)
                throw r2
        }
    }

    /* renamed from: u1.c$c */
    public static class c extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: a */
        public final android.graphics.drawable.Drawable.ConstantState f24464a;

        public c(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.f24464a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f24464a
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f24464a
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r3 = this;
                u1.c r0 = new u1.c
                r1 = 0
                r0.<init>(r1, r1, r1)
                android.graphics.drawable.Drawable$ConstantState r1 = r3.f24464a
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                r0.f24467Y = r1
                android.graphics.drawable.Drawable$Callback r2 = r0.f24457c0
                r1.setCallback(r2)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                u1.c r0 = new u1.c
                r1 = 0
                r0.<init>(r1, r1, r1)
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f24464a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                r0.f24467Y = r3
                android.graphics.drawable.Drawable$Callback r1 = r0.f24457c0
                r3.setCallback(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                u1.c r0 = new u1.c
                r1 = 0
                r0.<init>(r1, r1, r1)
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f24464a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
                r0.f24467Y = r3
                android.graphics.drawable.Drawable$Callback r4 = r0.f24457c0
                r3.setCallback(r4)
                return r0
        }
    }

    public C6285c() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r0)
            return
    }

    public C6285c(android.content.Context r1, p348u1.C6285c.b r2, android.content.res.Resources r3) {
            r0 = this;
            r0.<init>()
            r2 = 0
            r0.f24456b0 = r2
            u1.c$a r3 = new u1.c$a
            r3.<init>(r0)
            r0.f24457c0 = r3
            r0.f24455a0 = r1
            u1.c$b r1 = new u1.c$b
            r1.<init>(r2, r3, r2)
            r0.f24454Z = r1
            return
    }

    @Override // p348u1.AbstractC6288f, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L7
            r0.applyTheme(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            boolean r0 = r0.canApplyTheme()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            r0.draw(r2)
            return
        L8:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            r0.draw(r2)
            u1.c$b r2 = r1.f24454Z
            android.animation.AnimatorSet r2 = r2.f24461c
            boolean r2 = r2.isStarted()
            if (r2 == 0) goto L1c
            r1.invalidateSelf()
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            int r0 = r0.getAlpha()
            return r0
        L9:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f24467Y
            if (r0 == 0) goto L9
            int r0 = r0.getChangingConfigurations()
            return r0
        L9:
            int r0 = super.getChangingConfigurations()
            u1.c$b r1 = r2.f24454Z
            int r1 = r1.f24459a
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
        L9:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f24467Y
            if (r0 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L16
            u1.c$c r0 = new u1.c$c
            android.graphics.drawable.Drawable r1 = r2.f24467Y
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicHeight()
            return r0
        L9:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicWidth()
            return r0
        L9:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            int r0 = r0.getOpacity()
            return r0
        L9:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r24
            r4 = r25
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L12
            r5 = r23
            r0.inflate(r2, r5, r3, r4)
            return
        L12:
            r5 = r23
            int r0 = r23.getEventType()
            int r6 = r23.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L1e:
            if (r0 == r7) goto L189
            int r8 = r23.getDepth()
            if (r8 >= r6) goto L29
            r8 = 3
            if (r0 == r8) goto L189
        L29:
            r8 = 2
            if (r0 != r8) goto L183
            java.lang.String r0 = r23.getName()
            java.lang.String r9 = "animated-vector"
            boolean r9 = r9.equals(r0)
            r10 = 24
            r11 = 0
            r12 = 0
            if (r9 == 0) goto Lab
            int[] r0 = p348u1.C6283a.f24446e
            android.content.res.TypedArray r9 = p065e0.C1505j.m4095i(r2, r4, r3, r0)
            int r0 = r9.getResourceId(r12, r12)
            if (r0 == 0) goto La6
            android.graphics.PorterDuff$Mode r13 = p348u1.C6289g.f24468h0
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto L67
            u1.g r8 = new u1.g
            r8.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r10 = p065e0.C1503h.f7314a
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0, r4)
            r8.f24467Y = r0
            u1.g$i r0 = new u1.g$i
            android.graphics.drawable.Drawable r10 = r8.f24467Y
            android.graphics.drawable.Drawable$ConstantState r10 = r10.getConstantState()
            r0.<init>(r10)
            goto L92
        L67:
            android.content.res.XmlResourceParser r0 = r2.getXml(r0)     // Catch: java.io.IOException -> L87 org.xmlpull.v1.XmlPullParserException -> L89
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r0)     // Catch: java.io.IOException -> L87 org.xmlpull.v1.XmlPullParserException -> L89
        L6f:
            int r13 = r0.next()     // Catch: java.io.IOException -> L87 org.xmlpull.v1.XmlPullParserException -> L89
            if (r13 == r8) goto L78
            if (r13 == r7) goto L78
            goto L6f
        L78:
            if (r13 != r8) goto L7f
            u1.g r8 = p348u1.C6289g.m12916a(r2, r0, r10, r4)     // Catch: java.io.IOException -> L87 org.xmlpull.v1.XmlPullParserException -> L89
            goto L92
        L7f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L87 org.xmlpull.v1.XmlPullParserException -> L89
            java.lang.String r8 = "No start tag found"
            r0.<init>(r8)     // Catch: java.io.IOException -> L87 org.xmlpull.v1.XmlPullParserException -> L89
            throw r0     // Catch: java.io.IOException -> L87 org.xmlpull.v1.XmlPullParserException -> L89
        L87:
            r0 = move-exception
            goto L8a
        L89:
            r0 = move-exception
        L8a:
            java.lang.String r8 = "VectorDrawableCompat"
            java.lang.String r10 = "parser error"
            android.util.Log.e(r8, r10, r0)
            r8 = r11
        L92:
            r8.f24473d0 = r12
            android.graphics.drawable.Drawable$Callback r0 = r1.f24457c0
            r8.setCallback(r0)
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            if (r0 == 0) goto La2
            r0.setCallback(r11)
        La2:
            u1.c$b r0 = r1.f24454Z
            r0.f24460b = r8
        La6:
            r9.recycle()
            goto L183
        Lab:
            java.lang.String r8 = "target"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L183
            int[] r0 = p348u1.C6283a.f24447f
            android.content.res.TypedArray r0 = r2.obtainAttributes(r3, r0)
            java.lang.String r8 = r0.getString(r12)
            int r9 = r0.getResourceId(r7, r12)
            if (r9 == 0) goto L180
            android.content.Context r12 = r1.f24455a0
            if (r12 == 0) goto L175
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto Ld0
            android.animation.Animator r9 = android.animation.AnimatorInflater.loadAnimator(r12, r9)
            goto Lf1
        Ld0:
            android.content.res.Resources r13 = r12.getResources()
            android.content.res.Resources$Theme r14 = r12.getTheme()
            java.lang.String r10 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r20 = r13.getAnimation(r9)     // Catch: java.lang.Throwable -> L131 java.io.IOException -> L133 org.xmlpull.v1.XmlPullParserException -> L150
            android.util.AttributeSet r16 = android.util.Xml.asAttributeSet(r20)     // Catch: java.lang.Throwable -> L127 java.io.IOException -> L129 org.xmlpull.v1.XmlPullParserException -> L12d
            r17 = 0
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r15 = r20
            android.animation.Animator r9 = p348u1.C6286d.m12911a(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L127 java.io.IOException -> L129 org.xmlpull.v1.XmlPullParserException -> L12d
            r20.close()
        Lf1:
            u1.c$b r10 = r1.f24454Z
            u1.g r10 = r10.f24460b
            u1.g$h r10 = r10.f24469Z
            u1.g$g r10 = r10.f24524b
            s.a<java.lang.String, java.lang.Object> r10 = r10.f24522p
            java.lang.Object r10 = r10.getOrDefault(r8, r11)
            r9.setTarget(r10)
            u1.c$b r10 = r1.f24454Z
            java.util.ArrayList<android.animation.Animator> r11 = r10.f24462d
            if (r11 != 0) goto L118
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f24462d = r11
            u1.c$b r10 = r1.f24454Z
            s.a r11 = new s.a
            r11.<init>()
            r10.f24463e = r11
        L118:
            u1.c$b r10 = r1.f24454Z
            java.util.ArrayList<android.animation.Animator> r10 = r10.f24462d
            r10.add(r9)
            u1.c$b r10 = r1.f24454Z
            s.a<android.animation.Animator, java.lang.String> r10 = r10.f24463e
            r10.put(r9, r8)
            goto L180
        L127:
            r0 = move-exception
            goto L16f
        L129:
            r0 = move-exception
            r11 = r20
            goto L134
        L12d:
            r0 = move-exception
            r11 = r20
            goto L151
        L131:
            r0 = move-exception
            goto L16d
        L133:
            r0 = move-exception
        L134:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L131
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r3.<init>()     // Catch: java.lang.Throwable -> L131
            r3.append(r10)     // Catch: java.lang.Throwable -> L131
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch: java.lang.Throwable -> L131
            r3.append(r4)     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L131
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L131
            r2.initCause(r0)     // Catch: java.lang.Throwable -> L131
            throw r2     // Catch: java.lang.Throwable -> L131
        L150:
            r0 = move-exception
        L151:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L131
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r3.<init>()     // Catch: java.lang.Throwable -> L131
            r3.append(r10)     // Catch: java.lang.Throwable -> L131
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch: java.lang.Throwable -> L131
            r3.append(r4)     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L131
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L131
            r2.initCause(r0)     // Catch: java.lang.Throwable -> L131
            throw r2     // Catch: java.lang.Throwable -> L131
        L16d:
            r20 = r11
        L16f:
            if (r20 == 0) goto L174
            r20.close()
        L174:
            throw r0
        L175:
            r0.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L180:
            r0.recycle()
        L183:
            int r0 = r23.next()
            goto L1e
        L189:
            u1.c$b r0 = r1.f24454Z
            android.animation.AnimatorSet r2 = r0.f24461c
            if (r2 != 0) goto L196
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.f24461c = r2
        L196:
            android.animation.AnimatorSet r2 = r0.f24461c
            java.util.ArrayList<android.animation.Animator> r0 = r0.f24462d
            r2.playTogether(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            boolean r0 = r0.isAutoMirrored()
            return r0
        L9:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto Lb
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            boolean r0 = r0.isRunning()
            return r0
        Lb:
            u1.c$b r0 = r1.f24454Z
            android.animation.AnimatorSet r0 = r0.f24461c
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            boolean r0 = r0.isStateful()
            return r0
        L9:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L7
            r0.mutate()
        L7:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            r0.setBounds(r2)
            return
        L8:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            r0.setBounds(r2)
            return
    }

    @Override // p348u1.AbstractC6288f, android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            boolean r2 = r0.setLevel(r2)
            return r2
        L9:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            boolean r2 = r0.setLevel(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            boolean r2 = r0.setState(r2)
            return r2
        L9:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            boolean r2 = r0.setState(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f24467Y
            if (r0 == 0) goto L8
            r0.setAutoMirrored(r3)
            return
        L8:
            u1.c$b r0 = r2.f24454Z
            u1.g r0 = r0.f24460b
            android.graphics.drawable.Drawable r1 = r0.f24467Y
            if (r1 == 0) goto L14
            r1.setAutoMirrored(r3)
            goto L18
        L14:
            u1.g$h r0 = r0.f24469Z
            r0.f24527e = r3
        L18:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f24467Y
            if (r0 == 0) goto L8
            r0.setColorFilter(r3)
            return
        L8:
            u1.c$b r0 = r2.f24454Z
            u1.g r0 = r0.f24460b
            android.graphics.drawable.Drawable r1 = r0.f24467Y
            if (r1 == 0) goto L14
            r1.setColorFilter(r3)
            goto L19
        L14:
            r0.f24471b0 = r3
            r0.invalidateSelf()
        L19:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            p103g0.C2200a.m5788d(r0, r2)
            return
        L8:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            r0.setTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            p103g0.C2200a.m5789e(r0, r2)
            return
        L8:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            r0.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            p103g0.C2200a.m5790f(r0, r2)
            return
        L8:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            r0.setTintMode(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            boolean r2 = r0.setVisible(r2, r3)
            return r2
        L9:
            u1.c$b r0 = r1.f24454Z
            u1.g r0 = r0.f24460b
            r0.setVisible(r2, r3)
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.start()
            return
        La:
            u1.c$b r0 = r1.f24454Z
            android.animation.AnimatorSet r0 = r0.f24461c
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L15
            return
        L15:
            u1.c$b r0 = r1.f24454Z
            android.animation.AnimatorSet r0 = r0.f24461c
            r0.start()
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.stop()
            return
        La:
            u1.c$b r0 = r1.f24454Z
            android.animation.AnimatorSet r0 = r0.f24461c
            r0.end()
            return
    }
}
