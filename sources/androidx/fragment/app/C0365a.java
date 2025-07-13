package androidx.fragment.app;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0365a extends androidx.fragment.app.AbstractC0394m0 implements androidx.fragment.app.AbstractC0375d0.j, androidx.fragment.app.AbstractC0375d0.n {

    /* renamed from: q */
    public final androidx.fragment.app.AbstractC0375d0 f2030q;

    /* renamed from: r */
    public boolean f2031r;

    /* renamed from: s */
    public int f2032s;

    public C0365a(androidx.fragment.app.AbstractC0375d0 r3) {
            r2 = this;
            androidx.fragment.app.z r0 = r3.m1142K()
            androidx.fragment.app.a0<?> r1 = r3.f2130r
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.f2034Z
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L10
        Lf:
            r1 = 0
        L10:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f2032s = r0
            r2.f2030q = r3
            return
    }

    @Override // androidx.fragment.app.AbstractC0375d0.j
    /* renamed from: a */
    public java.lang.String mo1073a() {
            r1 = this;
            java.lang.String r0 = r1.f2241i
            return r0
    }

    @Override // androidx.fragment.app.AbstractC0375d0.n
    /* renamed from: b */
    public boolean mo1074b(java.util.ArrayList<androidx.fragment.app.C0365a> r3, java.util.ArrayList<java.lang.Boolean> r4) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Run: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            r3.add(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.add(r3)
            boolean r3 = r2.f2239g
            if (r3 == 0) goto L3b
            androidx.fragment.app.d0 r3 = r2.f2030q
            java.util.ArrayList<androidx.fragment.app.a> r4 = r3.f2116d
            if (r4 != 0) goto L36
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.f2116d = r4
        L36:
            java.util.ArrayList<androidx.fragment.app.a> r3 = r3.f2116d
            r3.add(r2)
        L3b:
            r3 = 1
            return r3
    }

    @Override // androidx.fragment.app.AbstractC0394m0
    /* renamed from: e */
    public int mo1075e() {
            r1 = this;
            r0 = 0
            int r0 = r1.m1078h(r0)
            return r0
    }

    /* renamed from: f */
    public void m1076f(int r8) {
            r7 = this;
            boolean r0 = r7.f2239g
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            boolean r1 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Bump nesting in "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = " by "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L2a:
            java.util.ArrayList<androidx.fragment.app.m0$a> r1 = r7.f2233a
            int r1 = r1.size()
            r3 = 0
        L31:
            if (r3 >= r1) goto L6b
            java.util.ArrayList<androidx.fragment.app.m0$a> r4 = r7.f2233a
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.m0$a r4 = (androidx.fragment.app.AbstractC0394m0.a) r4
            androidx.fragment.app.n r5 = r4.f2250b
            if (r5 == 0) goto L68
            int r6 = r5.f2293o0
            int r6 = r6 + r8
            r5.f2293o0 = r6
            boolean r5 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r5 == 0) goto L68
            java.lang.String r5 = "Bump nesting of "
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            androidx.fragment.app.n r6 = r4.f2250b
            r5.append(r6)
            java.lang.String r6 = " to "
            r5.append(r6)
            androidx.fragment.app.n r4 = r4.f2250b
            int r4 = r4.f2293o0
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.v(r2, r4)
        L68:
            int r3 = r3 + 1
            goto L31
        L6b:
            return
    }

    /* renamed from: g */
    public int m1077g() {
            r1 = this;
            r0 = 1
            int r0 = r1.m1078h(r0)
            return r0
    }

    /* renamed from: h */
    public int m1078h(boolean r4) {
            r3 = this;
            boolean r0 = r3.f2031r
            if (r0 != 0) goto L4e
            r0 = 2
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            r1 = 1
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Commit: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
            androidx.fragment.app.a1 r0 = new androidx.fragment.app.a1
            r0.<init>(r2)
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            java.lang.String r0 = "  "
            r3.m1082l(r0, r2, r1)
            r2.close()
        L34:
            r3.f2031r = r1
            boolean r0 = r3.f2239g
            if (r0 == 0) goto L43
            androidx.fragment.app.d0 r0 = r3.f2030q
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f2121i
            int r0 = r0.getAndIncrement()
            goto L44
        L43:
            r0 = -1
        L44:
            r3.f2032s = r0
            androidx.fragment.app.d0 r0 = r3.f2030q
            r0.m1132A(r3, r4)
            int r4 = r3.f2032s
            return r4
        L4e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "commit already called"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: i */
    public void m1079i() {
            r2 = this;
            boolean r0 = r2.f2239g
            if (r0 != 0) goto Ld
            r0 = 0
            r2.f2240h = r0
            androidx.fragment.app.d0 r1 = r2.f2030q
            r1.m1135D(r2, r0)
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: j */
    public androidx.fragment.app.AbstractC0394m0 m1080j(androidx.fragment.app.ComponentCallbacksC0395n r3) {
            r2 = this;
            androidx.fragment.app.d0 r0 = r3.f2294p0
            if (r0 == 0) goto L25
            androidx.fragment.app.d0 r1 = r2.f2030q
            if (r0 != r1) goto L9
            goto L25
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot detach Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = " is already attached to a FragmentManager."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            androidx.fragment.app.m0$a r0 = new androidx.fragment.app.m0$a
            r1 = 6
            r0.<init>(r1, r3)
            r2.m1292c(r0)
            return r2
    }

    /* renamed from: k */
    public void m1081k(int r4, androidx.fragment.app.ComponentCallbacksC0395n r5, java.lang.String r6, int r7) {
            r3 = this;
            java.lang.Class r0 = r5.getClass()
            int r1 = r0.getModifiers()
            boolean r2 = r0.isAnonymousClass()
            if (r2 != 0) goto Lb6
            boolean r2 = java.lang.reflect.Modifier.isPublic(r1)
            if (r2 == 0) goto Lb6
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L20
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Lb6
        L20:
            java.lang.String r0 = " now "
            java.lang.String r1 = ": was "
            if (r6 == 0) goto L4f
            java.lang.String r2 = r5.f2300v0
            if (r2 == 0) goto L4d
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L31
            goto L4d
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Can't change tag of fragment "
            r7.append(r2)
            r7.append(r5)
            r7.append(r1)
            java.lang.String r5 = r5.f2300v0
            java.lang.String r5 = p083f.C1932s.m4774a(r7, r5, r0, r6)
            r4.<init>(r5)
            throw r4
        L4d:
            r5.f2300v0 = r6
        L4f:
            if (r4 == 0) goto La9
            r2 = -1
            if (r4 == r2) goto L85
            int r6 = r5.f2298t0
            if (r6 == 0) goto L80
            if (r6 != r4) goto L5b
            goto L80
        L5b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Can't change container ID of fragment "
            r7.append(r2)
            r7.append(r5)
            r7.append(r1)
            int r5 = r5.f2298t0
            r7.append(r5)
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            throw r6
        L80:
            r5.f2298t0 = r4
            r5.f2299u0 = r4
            goto La9
        L85:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Can't add fragment "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = " with tag "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = " to container view with no id"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        La9:
            androidx.fragment.app.m0$a r4 = new androidx.fragment.app.m0$a
            r4.<init>(r7, r5)
            r3.m1292c(r4)
            androidx.fragment.app.d0 r4 = r3.f2030q
            r5.f2294p0 = r4
            return
        Lb6:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Fragment "
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.String r6 = r0.getCanonicalName()
            r5.append(r6)
            java.lang.String r6 = " must be a public static class to be  properly recreated from instance state."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: l */
    public void m1082l(java.lang.String r6, java.io.PrintWriter r7, boolean r8) {
            r5 = this;
            if (r8 == 0) goto Lcc
            r7.print(r6)
            java.lang.String r0 = "mName="
            r7.print(r0)
            java.lang.String r0 = r5.f2241i
            r7.print(r0)
            java.lang.String r0 = " mIndex="
            r7.print(r0)
            int r0 = r5.f2032s
            r7.print(r0)
            java.lang.String r0 = " mCommitted="
            r7.print(r0)
            boolean r0 = r5.f2031r
            r7.println(r0)
            int r0 = r5.f2238f
            if (r0 == 0) goto L38
            r7.print(r6)
            java.lang.String r0 = "mTransition=#"
            r7.print(r0)
            int r0 = r5.f2238f
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
        L38:
            int r0 = r5.f2234b
            if (r0 != 0) goto L40
            int r0 = r5.f2235c
            if (r0 == 0) goto L5f
        L40:
            r7.print(r6)
            java.lang.String r0 = "mEnterAnim=#"
            r7.print(r0)
            int r0 = r5.f2234b
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r7.print(r0)
            int r0 = r5.f2235c
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L5f:
            int r0 = r5.f2236d
            if (r0 != 0) goto L67
            int r0 = r5.f2237e
            if (r0 == 0) goto L86
        L67:
            r7.print(r6)
            java.lang.String r0 = "mPopEnterAnim=#"
            r7.print(r0)
            int r0 = r5.f2236d
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r7.print(r0)
            int r0 = r5.f2237e
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L86:
            int r0 = r5.f2242j
            if (r0 != 0) goto L8e
            java.lang.CharSequence r0 = r5.f2243k
            if (r0 == 0) goto La9
        L8e:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r7.print(r0)
            int r0 = r5.f2242j
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.f2243k
            r7.println(r0)
        La9:
            int r0 = r5.f2244l
            if (r0 != 0) goto Lb1
            java.lang.CharSequence r0 = r5.f2245m
            if (r0 == 0) goto Lcc
        Lb1:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r7.print(r0)
            int r0 = r5.f2244l
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.f2245m
            r7.println(r0)
        Lcc:
            java.util.ArrayList<androidx.fragment.app.m0$a> r0 = r5.f2233a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L193
            r7.print(r6)
            java.lang.String r0 = "Operations:"
            r7.println(r0)
            java.util.ArrayList<androidx.fragment.app.m0$a> r0 = r5.f2233a
            int r0 = r0.size()
            r1 = 0
        Le3:
            if (r1 >= r0) goto L193
            java.util.ArrayList<androidx.fragment.app.m0$a> r2 = r5.f2233a
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.m0$a r2 = (androidx.fragment.app.AbstractC0394m0.a) r2
            int r3 = r2.f2249a
            switch(r3) {
                case 0: goto L120;
                case 1: goto L11d;
                case 2: goto L11a;
                case 3: goto L117;
                case 4: goto L114;
                case 5: goto L111;
                case 6: goto L10e;
                case 7: goto L10b;
                case 8: goto L108;
                case 9: goto L105;
                case 10: goto L102;
                default: goto Lf2;
            }
        Lf2:
            java.lang.String r3 = "cmd="
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            int r4 = r2.f2249a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L122
        L102:
            java.lang.String r3 = "OP_SET_MAX_LIFECYCLE"
            goto L122
        L105:
            java.lang.String r3 = "UNSET_PRIMARY_NAV"
            goto L122
        L108:
            java.lang.String r3 = "SET_PRIMARY_NAV"
            goto L122
        L10b:
            java.lang.String r3 = "ATTACH"
            goto L122
        L10e:
            java.lang.String r3 = "DETACH"
            goto L122
        L111:
            java.lang.String r3 = "SHOW"
            goto L122
        L114:
            java.lang.String r3 = "HIDE"
            goto L122
        L117:
            java.lang.String r3 = "REMOVE"
            goto L122
        L11a:
            java.lang.String r3 = "REPLACE"
            goto L122
        L11d:
            java.lang.String r3 = "ADD"
            goto L122
        L120:
            java.lang.String r3 = "NULL"
        L122:
            r7.print(r6)
            java.lang.String r4 = "  Op #"
            r7.print(r4)
            r7.print(r1)
            java.lang.String r4 = ": "
            r7.print(r4)
            r7.print(r3)
            java.lang.String r3 = " "
            r7.print(r3)
            androidx.fragment.app.n r3 = r2.f2250b
            r7.println(r3)
            if (r8 == 0) goto L18f
            int r3 = r2.f2251c
            if (r3 != 0) goto L149
            int r3 = r2.f2252d
            if (r3 == 0) goto L168
        L149:
            r7.print(r6)
            java.lang.String r3 = "enterAnim=#"
            r7.print(r3)
            int r3 = r2.f2251c
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " exitAnim=#"
            r7.print(r3)
            int r3 = r2.f2252d
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.println(r3)
        L168:
            int r3 = r2.f2253e
            if (r3 != 0) goto L170
            int r3 = r2.f2254f
            if (r3 == 0) goto L18f
        L170:
            r7.print(r6)
            java.lang.String r3 = "popEnterAnim=#"
            r7.print(r3)
            int r3 = r2.f2253e
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " popExitAnim=#"
            r7.print(r3)
            int r2 = r2.f2254f
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r7.println(r2)
        L18f:
            int r1 = r1 + 1
            goto Le3
        L193:
            return
    }

    /* renamed from: m */
    public void m1083m() {
            r8 = this;
            java.util.ArrayList<androidx.fragment.app.m0$a> r0 = r8.f2233a
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto Ldc
            java.util.ArrayList<androidx.fragment.app.m0$a> r3 = r8.f2233a
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.m0$a r3 = (androidx.fragment.app.AbstractC0394m0.a) r3
            androidx.fragment.app.n r4 = r3.f2250b
            if (r4 == 0) goto L36
            r4.m1297B0(r1)
            int r5 = r8.f2238f
            androidx.fragment.app.n$d r6 = r4.f2263F0
            if (r6 != 0) goto L22
            if (r5 != 0) goto L22
            goto L29
        L22:
            r4.m1331r()
            androidx.fragment.app.n$d r6 = r4.f2263F0
            r6.f2314h = r5
        L29:
            java.util.ArrayList<java.lang.String> r5 = r8.f2246n
            java.util.ArrayList<java.lang.String> r6 = r8.f2247o
            r4.m1331r()
            androidx.fragment.app.n$d r7 = r4.f2263F0
            r7.f2315i = r5
            r7.f2316j = r6
        L36:
            int r5 = r3.f2249a
            switch(r5) {
                case 1: goto Lc3;
                case 2: goto L3b;
                case 3: goto Lb2;
                case 4: goto La1;
                case 5: goto L8b;
                case 6: goto L7a;
                case 7: goto L64;
                case 8: goto L5d;
                case 9: goto L59;
                case 10: goto L50;
                default: goto L3b;
            }
        L3b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown cmd: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r3.f2249a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L50:
            androidx.fragment.app.d0 r5 = r8.f2030q
            androidx.lifecycle.o$c r3 = r3.f2256h
            r5.m1168f0(r4, r3)
            goto Ld8
        L59:
            androidx.fragment.app.d0 r3 = r8.f2030q
            r4 = 0
            goto L5f
        L5d:
            androidx.fragment.app.d0 r3 = r8.f2030q
        L5f:
            r3.m1170g0(r4)
            goto Ld8
        L64:
            int r5 = r3.f2251c
            int r6 = r3.f2252d
            int r7 = r3.f2253e
            int r3 = r3.f2254f
            r4.m1340v0(r5, r6, r7, r3)
            androidx.fragment.app.d0 r3 = r8.f2030q
            r3.m1166e0(r4, r1)
            androidx.fragment.app.d0 r3 = r8.f2030q
            r3.m1161c(r4)
            goto Ld8
        L7a:
            int r5 = r3.f2251c
            int r6 = r3.f2252d
            int r7 = r3.f2253e
            int r3 = r3.f2254f
            r4.m1340v0(r5, r6, r7, r3)
            androidx.fragment.app.d0 r3 = r8.f2030q
            r3.m1175j(r4)
            goto Ld8
        L8b:
            int r5 = r3.f2251c
            int r6 = r3.f2252d
            int r7 = r3.f2253e
            int r3 = r3.f2254f
            r4.m1340v0(r5, r6, r7, r3)
            androidx.fragment.app.d0 r3 = r8.f2030q
            r3.m1166e0(r4, r1)
            androidx.fragment.app.d0 r3 = r8.f2030q
            r3.m1174i0(r4)
            goto Ld8
        La1:
            int r5 = r3.f2251c
            int r6 = r3.f2252d
            int r7 = r3.f2253e
            int r3 = r3.f2254f
            r4.m1340v0(r5, r6, r7, r3)
            androidx.fragment.app.d0 r3 = r8.f2030q
            r3.m1145N(r4)
            goto Ld8
        Lb2:
            int r5 = r3.f2251c
            int r6 = r3.f2252d
            int r7 = r3.f2253e
            int r3 = r3.f2254f
            r4.m1340v0(r5, r6, r7, r3)
            androidx.fragment.app.d0 r3 = r8.f2030q
            r3.m1156Z(r4)
            goto Ld8
        Lc3:
            int r5 = r3.f2251c
            int r6 = r3.f2252d
            int r7 = r3.f2253e
            int r3 = r3.f2254f
            r4.m1340v0(r5, r6, r7, r3)
            androidx.fragment.app.d0 r3 = r8.f2030q
            r3.m1166e0(r4, r1)
            androidx.fragment.app.d0 r3 = r8.f2030q
            r3.m1157a(r4)
        Ld8:
            int r2 = r2 + 1
            goto L8
        Ldc:
            return
    }

    /* renamed from: n */
    public void m1084n(boolean r8) {
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.m0$a> r8 = r7.f2233a
            int r8 = r8.size()
            r0 = 1
            int r8 = r8 - r0
        L8:
            if (r8 < 0) goto Lef
            java.util.ArrayList<androidx.fragment.app.m0$a> r1 = r7.f2233a
            java.lang.Object r1 = r1.get(r8)
            androidx.fragment.app.m0$a r1 = (androidx.fragment.app.AbstractC0394m0.a) r1
            androidx.fragment.app.n r2 = r1.f2250b
            if (r2 == 0) goto L49
            r2.m1297B0(r0)
            int r3 = r7.f2238f
            r4 = 8194(0x2002, float:1.1482E-41)
            r5 = 4099(0x1003, float:5.744E-42)
            r6 = 4097(0x1001, float:5.741E-42)
            if (r3 == r6) goto L2e
            if (r3 == r5) goto L2c
            if (r3 == r4) goto L29
            r4 = 0
            goto L2e
        L29:
            r4 = 4097(0x1001, float:5.741E-42)
            goto L2e
        L2c:
            r4 = 4099(0x1003, float:5.744E-42)
        L2e:
            androidx.fragment.app.n$d r3 = r2.f2263F0
            if (r3 != 0) goto L35
            if (r4 != 0) goto L35
            goto L3c
        L35:
            r2.m1331r()
            androidx.fragment.app.n$d r3 = r2.f2263F0
            r3.f2314h = r4
        L3c:
            java.util.ArrayList<java.lang.String> r3 = r7.f2247o
            java.util.ArrayList<java.lang.String> r4 = r7.f2246n
            r2.m1331r()
            androidx.fragment.app.n$d r5 = r2.f2263F0
            r5.f2315i = r3
            r5.f2316j = r4
        L49:
            int r3 = r1.f2249a
            switch(r3) {
                case 1: goto Ld6;
                case 2: goto L4e;
                case 3: goto Lc5;
                case 4: goto Lb4;
                case 5: goto L9e;
                case 6: goto L8d;
                case 7: goto L77;
                case 8: goto L6f;
                case 9: goto L6c;
                case 10: goto L63;
                default: goto L4e;
            }
        L4e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown cmd: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r1.f2249a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L63:
            androidx.fragment.app.d0 r3 = r7.f2030q
            androidx.lifecycle.o$c r1 = r1.f2255g
            r3.m1168f0(r2, r1)
            goto Leb
        L6c:
            androidx.fragment.app.d0 r1 = r7.f2030q
            goto L72
        L6f:
            androidx.fragment.app.d0 r1 = r7.f2030q
            r2 = 0
        L72:
            r1.m1170g0(r2)
            goto Leb
        L77:
            int r3 = r1.f2251c
            int r4 = r1.f2252d
            int r5 = r1.f2253e
            int r1 = r1.f2254f
            r2.m1340v0(r3, r4, r5, r1)
            androidx.fragment.app.d0 r1 = r7.f2030q
            r1.m1166e0(r2, r0)
            androidx.fragment.app.d0 r1 = r7.f2030q
            r1.m1175j(r2)
            goto Leb
        L8d:
            int r3 = r1.f2251c
            int r4 = r1.f2252d
            int r5 = r1.f2253e
            int r1 = r1.f2254f
            r2.m1340v0(r3, r4, r5, r1)
            androidx.fragment.app.d0 r1 = r7.f2030q
            r1.m1161c(r2)
            goto Leb
        L9e:
            int r3 = r1.f2251c
            int r4 = r1.f2252d
            int r5 = r1.f2253e
            int r1 = r1.f2254f
            r2.m1340v0(r3, r4, r5, r1)
            androidx.fragment.app.d0 r1 = r7.f2030q
            r1.m1166e0(r2, r0)
            androidx.fragment.app.d0 r1 = r7.f2030q
            r1.m1145N(r2)
            goto Leb
        Lb4:
            int r3 = r1.f2251c
            int r4 = r1.f2252d
            int r5 = r1.f2253e
            int r1 = r1.f2254f
            r2.m1340v0(r3, r4, r5, r1)
            androidx.fragment.app.d0 r1 = r7.f2030q
            r1.m1174i0(r2)
            goto Leb
        Lc5:
            int r3 = r1.f2251c
            int r4 = r1.f2252d
            int r5 = r1.f2253e
            int r1 = r1.f2254f
            r2.m1340v0(r3, r4, r5, r1)
            androidx.fragment.app.d0 r1 = r7.f2030q
            r1.m1157a(r2)
            goto Leb
        Ld6:
            int r3 = r1.f2251c
            int r4 = r1.f2252d
            int r5 = r1.f2253e
            int r1 = r1.f2254f
            r2.m1340v0(r3, r4, r5, r1)
            androidx.fragment.app.d0 r1 = r7.f2030q
            r1.m1166e0(r2, r0)
            androidx.fragment.app.d0 r1 = r7.f2030q
            r1.m1156Z(r2)
        Leb:
            int r8 = r8 + (-1)
            goto L8
        Lef:
            return
    }

    /* renamed from: o */
    public boolean m1085o(int r5) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.m0$a> r0 = r4.f2233a
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L23
            java.util.ArrayList<androidx.fragment.app.m0$a> r3 = r4.f2233a
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.m0$a r3 = (androidx.fragment.app.AbstractC0394m0.a) r3
            androidx.fragment.app.n r3 = r3.f2250b
            if (r3 == 0) goto L19
            int r3 = r3.f2299u0
            goto L1a
        L19:
            r3 = 0
        L1a:
            if (r3 == 0) goto L20
            if (r3 != r5) goto L20
            r5 = 1
            return r5
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            return r1
    }

    /* renamed from: p */
    public boolean m1086p(java.util.ArrayList<androidx.fragment.app.C0365a> r10, int r11, int r12) {
            r9 = this;
            r0 = 0
            if (r12 != r11) goto L4
            return r0
        L4:
            java.util.ArrayList<androidx.fragment.app.m0$a> r1 = r9.f2233a
            int r1 = r1.size()
            r2 = -1
            r3 = 0
        Lc:
            if (r3 >= r1) goto L52
            java.util.ArrayList<androidx.fragment.app.m0$a> r4 = r9.f2233a
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.m0$a r4 = (androidx.fragment.app.AbstractC0394m0.a) r4
            androidx.fragment.app.n r4 = r4.f2250b
            if (r4 == 0) goto L1d
            int r4 = r4.f2299u0
            goto L1e
        L1d:
            r4 = 0
        L1e:
            if (r4 == 0) goto L4f
            if (r4 == r2) goto L4f
            r2 = r11
        L23:
            if (r2 >= r12) goto L4e
            java.lang.Object r5 = r10.get(r2)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0365a) r5
            java.util.ArrayList<androidx.fragment.app.m0$a> r6 = r5.f2233a
            int r6 = r6.size()
            r7 = 0
        L32:
            if (r7 >= r6) goto L4b
            java.util.ArrayList<androidx.fragment.app.m0$a> r8 = r5.f2233a
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.m0$a r8 = (androidx.fragment.app.AbstractC0394m0.a) r8
            androidx.fragment.app.n r8 = r8.f2250b
            if (r8 == 0) goto L43
            int r8 = r8.f2299u0
            goto L44
        L43:
            r8 = 0
        L44:
            if (r8 != r4) goto L48
            r10 = 1
            return r10
        L48:
            int r7 = r7 + 1
            goto L32
        L4b:
            int r2 = r2 + 1
            goto L23
        L4e:
            r2 = r4
        L4f:
            int r3 = r3 + 1
            goto Lc
        L52:
            return r0
    }

    /* renamed from: q */
    public androidx.fragment.app.AbstractC0394m0 m1087q(androidx.fragment.app.ComponentCallbacksC0395n r3) {
            r2 = this;
            if (r3 == 0) goto L27
            androidx.fragment.app.d0 r0 = r3.f2294p0
            if (r0 == 0) goto L27
            androidx.fragment.app.d0 r1 = r2.f2030q
            if (r0 != r1) goto Lb
            goto L27
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = " is already attached to a FragmentManager."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L27:
            androidx.fragment.app.m0$a r0 = new androidx.fragment.app.m0$a
            r1 = 8
            r0.<init>(r1, r3)
            r2.m1292c(r0)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.f2032s
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.f2032s
            r0.append(r1)
        L25:
            java.lang.String r1 = r2.f2241i
            if (r1 == 0) goto L33
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.f2241i
            r0.append(r1)
        L33:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
