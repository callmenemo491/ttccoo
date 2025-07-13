package p227n0;

/* renamed from: n0.h */
/* loaded from: classes.dex */
public class C4649h {

    /* renamed from: a */
    public android.view.ViewParent f18558a;

    /* renamed from: b */
    public android.view.ViewParent f18559b;

    /* renamed from: c */
    public final android.view.View f18560c;

    /* renamed from: d */
    public boolean f18561d;

    /* renamed from: e */
    public int[] f18562e;

    public C4649h(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.f18560c = r1
            return
    }

    /* renamed from: a */
    public boolean m10503a(float r4, float r5, boolean r6) {
            r3 = this;
            boolean r0 = r3.f18561d
            r1 = 0
            if (r0 == 0) goto L2e
            android.view.ViewParent r0 = r3.m10510h(r1)
            if (r0 == 0) goto L2e
            android.view.View r2 = r3.f18560c
            boolean r1 = r0.onNestedFling(r2, r4, r5, r6)     // Catch: java.lang.AbstractMethodError -> L12
            goto L2e
        L12:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ViewParent "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = " does not implement interface method onNestedFling"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ViewParentCompat"
            android.util.Log.e(r6, r5, r4)
        L2e:
            return r1
    }

    /* renamed from: b */
    public boolean m10504b(float r4, float r5) {
            r3 = this;
            boolean r0 = r3.f18561d
            r1 = 0
            if (r0 == 0) goto L2e
            android.view.ViewParent r0 = r3.m10510h(r1)
            if (r0 == 0) goto L2e
            android.view.View r2 = r3.f18560c
            boolean r1 = r0.onNestedPreFling(r2, r4, r5)     // Catch: java.lang.AbstractMethodError -> L12
            goto L2e
        L12:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "ViewParent "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = " does not implement interface method onNestedPreFling"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r5, r4)
        L2e:
            return r1
    }

    /* renamed from: c */
    public boolean m10505c(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.m10506d(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: d */
    public boolean m10506d(int r15, int r16, int[] r17, int[] r18, int r19) {
            r14 = this;
            r1 = r14
            r0 = r15
            r5 = r16
            r8 = r18
            r7 = r19
            boolean r2 = r1.f18561d
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L96
            android.view.ViewParent r2 = r14.m10510h(r7)
            if (r2 != 0) goto L15
            return r10
        L15:
            if (r0 != 0) goto L22
            if (r5 == 0) goto L1a
            goto L22
        L1a:
            if (r8 == 0) goto L96
            r8[r10] = r10
            r8[r9] = r10
            goto L96
        L22:
            if (r8 == 0) goto L30
            android.view.View r3 = r1.f18560c
            r3.getLocationInWindow(r8)
            r3 = r8[r10]
            r4 = r8[r9]
            r11 = r3
            r12 = r4
            goto L32
        L30:
            r11 = 0
            r12 = 0
        L32:
            if (r17 != 0) goto L41
            int[] r3 = r1.f18562e
            if (r3 != 0) goto L3d
            r3 = 2
            int[] r3 = new int[r3]
            r1.f18562e = r3
        L3d:
            int[] r3 = r1.f18562e
            r13 = r3
            goto L43
        L41:
            r13 = r17
        L43:
            r13[r10] = r10
            r13[r9] = r10
            android.view.View r3 = r1.f18560c
            boolean r4 = r2 instanceof p227n0.InterfaceC4650i
            if (r4 == 0) goto L59
            n0.i r2 = (p227n0.InterfaceC4650i) r2
            r4 = r15
            r5 = r16
            r6 = r13
            r7 = r19
            r2.mo561j(r3, r4, r5, r6, r7)
            goto L7c
        L59:
            if (r7 != 0) goto L7c
            r2.onNestedPreScroll(r3, r15, r5, r13)     // Catch: java.lang.AbstractMethodError -> L5f
            goto L7c
        L5f:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "ViewParent "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = " does not implement interface method onNestedPreScroll"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r0, r3)
        L7c:
            if (r8 == 0) goto L8d
            android.view.View r0 = r1.f18560c
            r0.getLocationInWindow(r8)
            r0 = r8[r10]
            int r0 = r0 - r11
            r8[r10] = r0
            r0 = r8[r9]
            int r0 = r0 - r12
            r8[r9] = r0
        L8d:
            r0 = r13[r10]
            if (r0 != 0) goto L97
            r0 = r13[r9]
            if (r0 == 0) goto L96
            goto L97
        L96:
            r9 = 0
        L97:
            return r9
    }

    /* renamed from: e */
    public void m10507e(int r1, int r2, int r3, int r4, int[] r5, int r6, int[] r7) {
            r0 = this;
            r0.m10509g(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* renamed from: f */
    public boolean m10508f(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r9 = r0.m10509g(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    /* renamed from: g */
    public final boolean m10509g(int r16, int r17, int r18, int r19, int[] r20, int r21, int[] r22) {
            r15 = this;
            r1 = r15
            r10 = r20
            r0 = r21
            boolean r2 = r1.f18561d
            r11 = 0
            if (r2 == 0) goto Lbe
            android.view.ViewParent r8 = r15.m10510h(r0)
            if (r8 != 0) goto L11
            return r11
        L11:
            r12 = 1
            if (r16 != 0) goto L23
            if (r17 != 0) goto L23
            if (r18 != 0) goto L23
            if (r19 == 0) goto L1b
            goto L23
        L1b:
            if (r10 == 0) goto Lbe
            r10[r11] = r11
            r10[r12] = r11
            goto Lbe
        L23:
            if (r10 == 0) goto L31
            android.view.View r2 = r1.f18560c
            r2.getLocationInWindow(r10)
            r2 = r10[r11]
            r3 = r10[r12]
            r13 = r2
            r14 = r3
            goto L33
        L31:
            r13 = 0
            r14 = 0
        L33:
            if (r22 != 0) goto L46
            int[] r2 = r1.f18562e
            if (r2 != 0) goto L3e
            r2 = 2
            int[] r2 = new int[r2]
            r1.f18562e = r2
        L3e:
            int[] r2 = r1.f18562e
            r2[r11] = r11
            r2[r12] = r11
            r9 = r2
            goto L48
        L46:
            r9 = r22
        L48:
            android.view.View r3 = r1.f18560c
            boolean r2 = r8 instanceof p227n0.InterfaceC4651j
            if (r2 == 0) goto L5f
            r2 = r8
            n0.j r2 = (p227n0.InterfaceC4651j) r2
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r21
            r2.mo564m(r3, r4, r5, r6, r7, r8, r9)
            goto Lac
        L5f:
            r2 = r9[r11]
            int r2 = r2 + r18
            r9[r11] = r2
            r2 = r9[r12]
            int r2 = r2 + r19
            r9[r12] = r2
            boolean r2 = r8 instanceof p227n0.InterfaceC4650i
            if (r2 == 0) goto L80
            r2 = r8
            n0.i r2 = (p227n0.InterfaceC4650i) r2
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r21
            r2.mo565n(r3, r4, r5, r6, r7, r8)
            goto Lac
        L80:
            if (r0 != 0) goto Lac
            r2 = r8
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r2.onNestedScroll(r3, r4, r5, r6, r7)     // Catch: java.lang.AbstractMethodError -> L8f
            goto Lac
        L8f:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "ViewParent "
            r0.append(r3)
            r0.append(r8)
            java.lang.String r3 = " does not implement interface method onNestedScroll"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r0, r2)
        Lac:
            if (r10 == 0) goto Lbd
            android.view.View r0 = r1.f18560c
            r0.getLocationInWindow(r10)
            r0 = r10[r11]
            int r0 = r0 - r13
            r10[r11] = r0
            r0 = r10[r12]
            int r0 = r0 - r14
            r10[r12] = r0
        Lbd:
            return r12
        Lbe:
            return r11
    }

    /* renamed from: h */
    public final android.view.ViewParent m10510h(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r2 = 0
            return r2
        L7:
            android.view.ViewParent r2 = r1.f18559b
            return r2
        La:
            android.view.ViewParent r2 = r1.f18558a
            return r2
    }

    /* renamed from: i */
    public boolean m10511i() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.m10512j(r0)
            return r0
    }

    /* renamed from: j */
    public boolean m10512j(int r1) {
            r0 = this;
            android.view.ViewParent r1 = r0.m10510h(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* renamed from: k */
    public void m10513k(boolean r3) {
            r2 = this;
            boolean r0 = r2.f18561d
            if (r0 == 0) goto Lb
            android.view.View r0 = r2.f18560c
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            p227n0.C4661t.h.m10621z(r0)
        Lb:
            r2.f18561d = r3
            return
    }

    /* renamed from: l */
    public boolean m10514l(int r11, int r12) {
            r10 = this;
            android.view.ViewParent r0 = r10.m10510h(r12)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto Le
            return r1
        Le:
            boolean r0 = r10.f18561d
            if (r0 == 0) goto L8f
            android.view.View r0 = r10.f18560c
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r3 = r10.f18560c
        L1a:
            if (r0 == 0) goto L8f
            android.view.View r4 = r10.f18560c
            boolean r5 = r0 instanceof p227n0.InterfaceC4650i
            java.lang.String r6 = "ViewParentCompat"
            java.lang.String r7 = "ViewParent "
            if (r5 == 0) goto L2e
            r8 = r0
            n0.i r8 = (p227n0.InterfaceC4650i) r8
            boolean r4 = r8.mo566o(r3, r4, r11, r12)
            goto L4e
        L2e:
            if (r12 != 0) goto L4d
            boolean r4 = r0.onStartNestedScroll(r3, r4, r11)     // Catch: java.lang.AbstractMethodError -> L35
            goto L4e
        L35:
            r4 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r0)
            java.lang.String r9 = " does not implement interface method onStartNestedScroll"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r6, r8, r4)
        L4d:
            r4 = 0
        L4e:
            if (r4 == 0) goto L83
            if (r12 == 0) goto L58
            if (r12 == r1) goto L55
            goto L5a
        L55:
            r10.f18559b = r0
            goto L5a
        L58:
            r10.f18558a = r0
        L5a:
            android.view.View r2 = r10.f18560c
            if (r5 == 0) goto L64
            n0.i r0 = (p227n0.InterfaceC4650i) r0
            r0.mo554c(r3, r2, r11, r12)
            goto L82
        L64:
            if (r12 != 0) goto L82
            r0.onNestedScrollAccepted(r3, r2, r11)     // Catch: java.lang.AbstractMethodError -> L6a
            goto L82
        L6a:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r0)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r6, r12, r11)
        L82:
            return r1
        L83:
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L8a
            r3 = r0
            android.view.View r3 = (android.view.View) r3
        L8a:
            android.view.ViewParent r0 = r0.getParent()
            goto L1a
        L8f:
            return r2
    }

    /* renamed from: m */
    public void m10515m(int r5) {
            r4 = this;
            android.view.ViewParent r0 = r4.m10510h(r5)
            if (r0 == 0) goto L40
            android.view.View r1 = r4.f18560c
            boolean r2 = r0 instanceof p227n0.InterfaceC4650i
            if (r2 == 0) goto L12
            n0.i r0 = (p227n0.InterfaceC4650i) r0
            r0.mo560i(r1, r5)
            goto L34
        L12:
            if (r5 != 0) goto L34
            r0.onStopNestedScroll(r1)     // Catch: java.lang.AbstractMethodError -> L18
            goto L34
        L18:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ViewParent "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " does not implement interface method onStopNestedScroll"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r0, r1)
        L34:
            r0 = 0
            if (r5 == 0) goto L3e
            r1 = 1
            if (r5 == r1) goto L3b
            goto L40
        L3b:
            r4.f18559b = r0
            goto L40
        L3e:
            r4.f18558a = r0
        L40:
            return
    }
}
