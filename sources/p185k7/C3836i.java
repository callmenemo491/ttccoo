package p185k7;

/* renamed from: k7.i */
/* loaded from: classes.dex */
public /* synthetic */ class C3836i {

    /* renamed from: a */
    public static p367v1.C6488b f16668a;

    /* renamed from: a */
    public static final void m8616a(java.lang.Throwable r1, java.lang.Throwable r2) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            java.lang.String r0 = "exception"
            p214m2.C4339q.m9706k(r2, r0)
            if (r1 == r2) goto L11
            ih.a r0 = p153ih.C3173b.f12672a
            r0.mo7610a(r1, r2)
        L11:
            return
    }

    /* renamed from: b */
    public static java.lang.Object m8617b(java.lang.Object r1, int r2) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "at index "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r0, r2)
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: c */
    public static int m8618c(int r4, int r5) {
            int r0 = r4 - r5
            if (r0 <= r5) goto L7
            r3 = r0
            r0 = r5
            r5 = r3
        L7:
            r1 = 1
            r2 = 1
        L9:
            if (r4 <= r5) goto L15
            int r1 = r1 * r4
            if (r2 > r0) goto L12
            int r1 = r1 / r2
            int r2 = r2 + 1
        L12:
            int r4 = r4 + (-1)
            goto L9
        L15:
            if (r2 > r0) goto L1b
            int r1 = r1 / r2
            int r2 = r2 + 1
            goto L15
        L1b:
            return r1
    }

    /* renamed from: d */
    public static boolean m8619d(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    /* renamed from: e */
    public static final p041ce.C0955f m8620e(java.lang.String r10) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "&"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r1 = p362uh.C6467m.m13080k0(r10, r1, r2, r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "="
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.util.List r4 = p362uh.C6467m.m13080k0(r4, r5, r2, r2, r3)
            int r5 = r4.size()
            r6 = 2
            if (r5 != r6) goto L15
            java.lang.Object r5 = p062dh.C1473i.m3997I(r4, r2)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 1
            java.lang.Object r4 = p062dh.C1473i.m3997I(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            if (r5 == 0) goto L15
            if (r4 == 0) goto L15
            r0.put(r5, r4)
            goto L15
        L47:
            java.lang.String r1 = "amount"
            java.lang.Object r1 = r0.get(r1)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb3
            java.lang.String r1 = "currency"
            java.lang.Object r1 = r0.get(r1)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto Lab
            java.lang.String r1 = "to"
            java.lang.Object r1 = r0.get(r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto La3
            java.lang.String r1 = "from"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "memo"
            java.lang.Object r2 = r0.get(r2)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L9b
            java.lang.String r2 = "contract"
            java.lang.Object r0 = r0.get(r2)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L93
            ce.f r0 = new ce.f
            if (r1 != 0) goto L8c
            java.lang.String r1 = ""
        L8c:
            r7 = r1
            r2 = r0
            r9 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L93:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r0 = "contract not fount"
            r10.<init>(r0)
            throw r10
        L9b:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r0 = "memo not fount"
            r10.<init>(r0)
            throw r10
        La3:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r0 = "to not fount"
            r10.<init>(r0)
            throw r10
        Lab:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r0 = "currency not fount"
            r10.<init>(r0)
            throw r10
        Lb3:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r0 = "amount not fount"
            r10.<init>(r0)
            throw r10
    }

    /* renamed from: f */
    public static int m8621f(int[] r17, int r18, boolean r19) {
            r0 = r17
            r1 = r18
            int r2 = r0.length
            r4 = 0
            r5 = 0
        L7:
            if (r4 >= r2) goto Lf
            r6 = r0[r4]
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L7
        Lf:
            int r2 = r0.length
            r4 = 0
            r6 = 0
            r7 = 0
        L13:
            int r8 = r2 + (-1)
            if (r4 >= r8) goto L71
            r9 = 1
            int r10 = r9 << r4
            r7 = r7 | r10
            r11 = 1
        L1c:
            r12 = r0[r4]
            if (r11 >= r12) goto L6b
            int r12 = r5 - r11
            int r13 = r12 + (-1)
            int r14 = r2 - r4
            int r15 = r14 + (-2)
            int r13 = m8618c(r13, r15)
            if (r19 == 0) goto L3d
            if (r7 != 0) goto L3d
            int r3 = r14 + (-1)
            int r9 = r12 - r3
            if (r9 < r3) goto L3d
            int r3 = r12 - r14
            int r3 = m8618c(r3, r15)
            int r13 = r13 - r3
        L3d:
            int r3 = r14 + (-1)
            r9 = 1
            if (r3 <= r9) goto L5e
            int r3 = r12 - r15
            r15 = 0
        L45:
            if (r3 <= r1) goto L58
            int r16 = r12 - r3
            int r9 = r16 + (-1)
            int r0 = r14 + (-3)
            int r0 = m8618c(r9, r0)
            int r15 = r15 + r0
            int r3 = r3 + (-1)
            r0 = r17
            r9 = 1
            goto L45
        L58:
            int r0 = r8 - r4
            int r0 = r0 * r15
            int r13 = r13 - r0
            goto L62
        L5e:
            if (r12 <= r1) goto L62
            int r13 = r13 + (-1)
        L62:
            int r6 = r6 + r13
            int r11 = r11 + 1
            int r0 = ~r10
            r7 = r7 & r0
            r9 = 1
            r0 = r17
            goto L1c
        L6b:
            int r5 = r5 - r11
            int r4 = r4 + 1
            r0 = r17
            goto L13
        L71:
            return r6
    }

    /* renamed from: g */
    public static final p041ce.C0955f m8622g(java.lang.String r5) {
            java.lang.String r0 = "https://tacocrypto.io/transfer/request?data="
            r1 = 0
            r2 = 2
            boolean r2 = p362uh.C6463i.m13061R(r5, r0, r1, r2)
            java.lang.String r3 = "QR Code not supported"
            if (r2 == 0) goto L47
            java.lang.String r5 = p362uh.C6467m.m13076g0(r5, r0)
            r0 = 4
            java.lang.String r2 = "."
            java.lang.String r4 = "+"
            java.lang.String r5 = p362uh.C6463i.m13057N(r5, r2, r4, r1, r0)
            java.lang.String r2 = "_"
            java.lang.String r4 = "/"
            java.lang.String r5 = p362uh.C6463i.m13057N(r5, r2, r4, r1, r0)
            java.lang.String r2 = "-"
            java.lang.String r4 = "="
            java.lang.String r5 = p362uh.C6463i.m13057N(r5, r2, r4, r1, r0)
            byte[] r5 = android.util.Base64.decode(r5, r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r0 = "decode(parameterStr, Base64.DEFAULT)"
            p214m2.C4339q.m9705j(r5, r0)     // Catch: java.lang.Exception -> L3b
            java.lang.String r5 = p362uh.C6463i.m13051H(r5)     // Catch: java.lang.Exception -> L3b
            ce.f r5 = m8620e(r5)     // Catch: java.lang.Exception -> L3b
            return r5
        L3b:
            r5 = move-exception
            hk.a$b r0 = hk.C3053a.f12282b
            r0.mo7468b(r5)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
        L47:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
    }

    /* renamed from: h */
    public static java.text.DateFormat m8623h(int r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown DateFormat style: "
            r2 = 3
            r3 = 2
            r4 = 1
            if (r5 == 0) goto L25
            if (r5 == r4) goto L22
            if (r5 == r3) goto L1f
            if (r5 != r2) goto L15
            java.lang.String r5 = "M/d/yy"
            goto L27
        L15:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = android.support.v4.media.C0142a.m254a(r1, r5)
            r6.<init>(r5)
            throw r6
        L1f:
            java.lang.String r5 = "MMM d, yyyy"
            goto L27
        L22:
            java.lang.String r5 = "MMMM d, yyyy"
            goto L27
        L25:
            java.lang.String r5 = "EEEE, MMMM d, yyyy"
        L27:
            r0.append(r5)
            java.lang.String r5 = " "
            r0.append(r5)
            if (r6 == 0) goto L47
            if (r6 == r4) goto L47
            if (r6 == r3) goto L44
            if (r6 != r2) goto L3a
            java.lang.String r5 = "h:mm a"
            goto L49
        L3a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = android.support.v4.media.C0142a.m254a(r1, r6)
            r5.<init>(r6)
            throw r5
        L44:
            java.lang.String r5 = "h:mm:ss a"
            goto L49
        L47:
            java.lang.String r5 = "h:mm:ss a z"
        L49:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.util.Locale r0 = java.util.Locale.US
            r6.<init>(r5, r0)
            return r6
    }

    /* renamed from: i */
    public static int m8624i(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }

    /* renamed from: j */
    public static boolean m8625j(char r1) {
            r0 = 97
            if (r1 < r0) goto La
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    /* renamed from: k */
    public static boolean m8626k(char r1) {
            r0 = 65
            if (r1 < r0) goto La
            r0 = 90
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    /* renamed from: l */
    public static final androidx.navigation.fragment.NavHostFragment m8627l(androidx.fragment.app.AbstractC0375d0 r2, java.lang.String r3, int r4, int r5) {
            androidx.fragment.app.n r0 = r2.m1140I(r3)
            androidx.navigation.fragment.NavHostFragment r0 = (androidx.navigation.fragment.NavHostFragment) r0
            if (r0 == 0) goto L9
            return r0
        L9:
            int r0 = androidx.navigation.fragment.NavHostFragment.f2923Z0
            if (r4 == 0) goto L18
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "android-support-nav:fragment:graphId"
            r0.putInt(r1, r4)
            goto L19
        L18:
            r0 = 0
        L19:
            androidx.navigation.fragment.NavHostFragment r4 = new androidx.navigation.fragment.NavHostFragment
            r4.<init>()
            if (r0 == 0) goto L23
            r4.m1344x0(r0)
        L23:
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            r0.<init>(r2)
            r2 = 1
            r0.m1081k(r5, r4, r3, r2)
            r0.m1079i()
            return r4
    }

    /* renamed from: m */
    public static void m8628m(android.animation.AnimatorSet r10, java.util.List<android.animation.Animator> r11) {
            int r0 = r11.size()
            r1 = 0
            r2 = 0
            r4 = 0
        L8:
            if (r4 >= r0) goto L20
            java.lang.Object r5 = r11.get(r4)
            android.animation.Animator r5 = (android.animation.Animator) r5
            long r6 = r5.getStartDelay()
            long r8 = r5.getDuration()
            long r8 = r8 + r6
            long r2 = java.lang.Math.max(r2, r8)
            int r4 = r4 + 1
            goto L8
        L20:
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0034: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r0.setDuration(r2)
            r11.add(r1, r0)
            r10.playTogether(r11)
            return
    }

    /* renamed from: n */
    public static java.lang.String m8629n(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2f
            char r2 = r4.charAt(r1)
            boolean r2 = m8626k(r2)
            if (r2 == 0) goto L2c
            char[] r4 = r4.toCharArray()
        L15:
            if (r1 >= r0) goto L27
            char r2 = r4[r1]
            boolean r3 = m8626k(r2)
            if (r3 == 0) goto L24
            r2 = r2 ^ 32
            char r2 = (char) r2
            r4[r1] = r2
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L2c:
            int r1 = r1 + 1
            goto L5
        L2f:
            return r4
    }

    /* renamed from: o */
    public static java.lang.String m8630o(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2f
            char r2 = r4.charAt(r1)
            boolean r2 = m8625j(r2)
            if (r2 == 0) goto L2c
            char[] r4 = r4.toCharArray()
        L15:
            if (r1 >= r0) goto L27
            char r2 = r4[r1]
            boolean r3 = m8625j(r2)
            if (r3 == 0) goto L24
            r2 = r2 ^ 32
            char r2 = (char) r2
            r4[r1] = r2
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L2c:
            int r1 = r1 + 1
            goto L5
        L2f:
            return r4
    }

    /* renamed from: p */
    public static p205ld.C4266c m8631p(android.view.View r0) {
            com.bumptech.glide.j r0 = com.bumptech.glide.ComponentCallbacks2C0999c.m2737f(r0)
            ld.c r0 = (p205ld.C4266c) r0
            return r0
    }

    /* renamed from: q */
    public static p185k7.InterfaceC3916o m8632q(p185k7.InterfaceC3864k r4, p185k7.InterfaceC3916o r5, p365v.C6476c r6, java.util.List<p185k7.InterfaceC3916o> r7) {
            k7.r r5 = (p185k7.C3955r) r5
            java.lang.String r0 = r5.f16850Y
            boolean r0 = r4.mo8352a(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            java.lang.String r0 = r5.f16850Y
            k7.o r4 = r4.mo8358l(r0)
            boolean r0 = r4 instanceof p185k7.AbstractC3822h
            if (r0 == 0) goto L1d
            k7.h r4 = (p185k7.AbstractC3822h) r4
            k7.o r4 = r4.mo8522b(r6, r7)
            return r4
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r5 = r5.f16850Y
            r6[r1] = r5
            java.lang.String r5 = "%s is not a function"
            java.lang.String r5 = java.lang.String.format(r5, r6)
            r4.<init>(r5)
            throw r4
        L2f:
            java.lang.String r0 = r5.f16850Y
            java.lang.String r3 = "hasOwnProperty"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L56
            p124h7.C2939x3.m7264N(r3, r2, r7)
            java.lang.Object r5 = r7.get(r1)
            k7.o r5 = (p185k7.InterfaceC3916o) r5
            k7.o r5 = r6.m13117i(r5)
            java.lang.String r5 = r5.mo8357i()
            boolean r4 = r4.mo8352a(r5)
            if (r4 == 0) goto L53
            k7.o r4 = p185k7.InterfaceC3916o.f16787L
            return r4
        L53:
            k7.o r4 = p185k7.InterfaceC3916o.f16788M
            return r4
        L56:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r5 = r5.f16850Y
            r6[r1] = r5
            java.lang.String r5 = "Object has no function %s"
            java.lang.String r5 = java.lang.String.format(r5, r6)
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: r */
    public static java.lang.String m8633r(java.lang.String r3, java.lang.String[] r4, java.lang.String[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
        L7:
            if (r1 >= r0) goto L1e
            r2 = r4[r1]
            if (r3 != 0) goto Lf
            if (r2 == 0) goto L18
        Lf:
            if (r3 != 0) goto L12
            goto L1b
        L12:
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1b
        L18:
            r3 = r5[r1]
            return r3
        L1b:
            int r1 = r1 + 1
            goto L7
        L1e:
            r3 = 0
            return r3
    }

    /* renamed from: s */
    public static p185k7.C3766d m8634s(p185k7.C3766d r7, p365v.C6476c r8, p185k7.AbstractC3822h r9, java.lang.Boolean r10, java.lang.Boolean r11) {
            k7.d r0 = new k7.d
            r0.<init>()
            java.util.Iterator r1 = r7.m8364w()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r3 = r7.m8351D(r2)
            if (r3 == 0) goto L9
            r3 = 3
            k7.o[] r3 = new p185k7.InterfaceC3916o[r3]
            r4 = 0
            k7.o r5 = r7.m8362q(r2)
            r3[r4] = r5
            k7.g r4 = new k7.g
            double r5 = (double) r2
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r4.<init>(r5)
            r5 = 1
            r3[r5] = r4
            r4 = 2
            r3[r4] = r7
            java.util.List r3 = java.util.Arrays.asList(r3)
            k7.o r3 = r9.mo8522b(r8, r3)
            java.lang.Boolean r4 = r3.mo8353e()
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L4c
            return r0
        L4c:
            if (r11 == 0) goto L58
            java.lang.Boolean r4 = r3.mo8353e()
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L9
        L58:
            r0.m8350C(r2, r3)
            goto L9
        L5c:
            return r0
    }

    /* renamed from: t */
    public static java.lang.String m8635t(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)
            android.content.res.Resources r2 = r1.getResources()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L10
            goto L14
        L10:
            java.lang.String r3 = p249o7.C4962b4.m11110a(r1)
        L14:
            java.lang.String r1 = "google_app_id"
            java.lang.String r1 = p249o7.C4962b4.m11111b(r1, r2, r3)
            return r1
    }

    /* renamed from: u */
    public static p185k7.InterfaceC3916o m8636u(p185k7.C3766d r9, p365v.C6476c r10, java.util.List<p185k7.InterfaceC3916o> r11, boolean r12) {
            java.lang.String r0 = "reduce"
            r1 = 1
            p124h7.C2939x3.m7266P(r0, r1, r11)
            r2 = 2
            p124h7.C2939x3.m7268R(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            k7.o r3 = (p185k7.InterfaceC3916o) r3
            k7.o r3 = r10.m13117i(r3)
            boolean r4 = r3 instanceof p185k7.AbstractC3822h
            if (r4 == 0) goto La0
            int r4 = r11.size()
            if (r4 != r2) goto L36
            java.lang.Object r11 = r11.get(r1)
            k7.o r11 = (p185k7.InterfaceC3916o) r11
            k7.o r11 = r10.m13117i(r11)
            boolean r4 = r11 instanceof p185k7.C3794f
            if (r4 != 0) goto L2e
            goto L3d
        L2e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L36:
            int r11 = r9.m8359m()
            if (r11 == 0) goto L98
            r11 = 0
        L3d:
            k7.h r3 = (p185k7.AbstractC3822h) r3
            int r4 = r9.m8359m()
            if (r12 == 0) goto L47
            r5 = 0
            goto L49
        L47:
            int r5 = r4 + (-1)
        L49:
            r6 = -1
            if (r12 == 0) goto L4e
            int r4 = r4 + r6
            goto L4f
        L4e:
            r4 = 0
        L4f:
            if (r1 == r12) goto L52
            goto L53
        L52:
            r6 = 1
        L53:
            if (r11 != 0) goto L5a
            k7.o r11 = r9.m8362q(r5)
            goto L95
        L5a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L97
            boolean r12 = r9.m8351D(r5)
            if (r12 == 0) goto L95
            r12 = 4
            k7.o[] r12 = new p185k7.InterfaceC3916o[r12]
            r12[r0] = r11
            k7.o r11 = r9.m8362q(r5)
            r12[r1] = r11
            k7.g r11 = new k7.g
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            k7.o r11 = r3.mo8522b(r10, r11)
            boolean r12 = r11 instanceof p185k7.C3794f
            if (r12 != 0) goto L8d
            goto L95
        L8d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L95:
            int r5 = r5 + r6
            goto L5a
        L97:
            return r11
        L98:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        La0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            throw r9
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ boolean m8637v(byte r0) {
            if (r0 < 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    /* renamed from: w */
    public static boolean m8638w(byte r1) {
            r0 = -65
            if (r1 <= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }
}
