package p332t0;

/* renamed from: t0.a */
/* loaded from: classes.dex */
public abstract class AbstractC6093a extends p227n0.C4641a {

    /* renamed from: n */
    public static final android.graphics.Rect f23502n = null;

    /* renamed from: o */
    public static final p332t0.C6094b.a<p242o0.C4868b> f23503o = null;

    /* renamed from: p */
    public static final p332t0.C6094b.b<p319s.C5942i<p242o0.C4868b>, p242o0.C4868b> f23504p = null;

    /* renamed from: d */
    public final android.graphics.Rect f23505d;

    /* renamed from: e */
    public final android.graphics.Rect f23506e;

    /* renamed from: f */
    public final android.graphics.Rect f23507f;

    /* renamed from: g */
    public final int[] f23508g;

    /* renamed from: h */
    public final android.view.accessibility.AccessibilityManager f23509h;

    /* renamed from: i */
    public final android.view.View f23510i;

    /* renamed from: j */
    public p332t0.AbstractC6093a.c f23511j;

    /* renamed from: k */
    public int f23512k;

    /* renamed from: l */
    public int f23513l;

    /* renamed from: m */
    public int f23514m;

    /* renamed from: t0.a$a */
    public class a implements p332t0.C6094b.a<p242o0.C4868b> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m12561a(java.lang.Object r1, android.graphics.Rect r2) {
                r0 = this;
                o0.b r1 = (p242o0.C4868b) r1
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.f19337a
                r1.getBoundsInParent(r2)
                return
        }
    }

    /* renamed from: t0.a$b */
    public class b implements p332t0.C6094b.b<p319s.C5942i<p242o0.C4868b>, p242o0.C4868b> {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: t0.a$c */
    public class c extends p242o0.C4869c {

        /* renamed from: b */
        public final /* synthetic */ p332t0.AbstractC6093a f23515b;

        public c(p332t0.AbstractC6093a r1) {
                r0 = this;
                r0.f23515b = r1
                r0.<init>()
                return
        }

        @Override // p242o0.C4869c
        /* renamed from: a */
        public p242o0.C4868b mo11003a(int r2) {
                r1 = this;
                t0.a r0 = r1.f23515b
                o0.b r2 = r0.m12557o(r2)
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.f19337a
                android.view.accessibility.AccessibilityNodeInfo r2 = android.view.accessibility.AccessibilityNodeInfo.obtain(r2)
                o0.b r0 = new o0.b
                r0.<init>(r2)
                return r0
        }

        @Override // p242o0.C4869c
        /* renamed from: b */
        public p242o0.C4868b mo11004b(int r2) {
                r1 = this;
                r0 = 2
                if (r2 != r0) goto L8
                t0.a r2 = r1.f23515b
                int r2 = r2.f23512k
                goto Lc
            L8:
                t0.a r2 = r1.f23515b
                int r2 = r2.f23513l
            Lc:
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != r0) goto L12
                r2 = 0
                return r2
            L12:
                t0.a r0 = r1.f23515b
                o0.b r2 = r0.m12557o(r2)
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.f19337a
                android.view.accessibility.AccessibilityNodeInfo r2 = android.view.accessibility.AccessibilityNodeInfo.obtain(r2)
                o0.b r0 = new o0.b
                r0.<init>(r2)
                return r0
        }

        @Override // p242o0.C4869c
        /* renamed from: c */
        public boolean mo11005c(int r4, int r5, android.os.Bundle r6) {
                r3 = this;
                t0.a r0 = r3.f23515b
                r1 = -1
                if (r4 == r1) goto L54
                r1 = 1
                if (r5 == r1) goto L4f
                r2 = 2
                if (r5 == r2) goto L4a
                r2 = 64
                if (r5 == r2) goto L1d
                r1 = 128(0x80, float:1.8E-43)
                if (r5 == r1) goto L18
                boolean r4 = r0.mo3342p(r4, r5, r6)
                goto L5c
            L18:
                boolean r4 = r0.m12553j(r4)
                goto L5c
            L1d:
                android.view.accessibility.AccessibilityManager r5 = r0.f23509h
                boolean r5 = r5.isEnabled()
                if (r5 == 0) goto L47
                android.view.accessibility.AccessibilityManager r5 = r0.f23509h
                boolean r5 = r5.isTouchExplorationEnabled()
                if (r5 != 0) goto L2e
                goto L47
            L2e:
                int r5 = r0.f23512k
                if (r5 == r4) goto L47
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r5 == r6) goto L39
                r0.m12553j(r5)
            L39:
                r0.f23512k = r4
                android.view.View r5 = r0.f23510i
                r5.invalidate()
                r5 = 32768(0x8000, float:4.5918E-41)
                r0.m12559u(r4, r5)
                goto L48
            L47:
                r1 = 0
            L48:
                r4 = r1
                goto L5c
            L4a:
                boolean r4 = r0.m12554k(r4)
                goto L5c
            L4f:
                boolean r4 = r0.m12558t(r4)
                goto L5c
            L54:
                android.view.View r4 = r0.f23510i
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                boolean r4 = p227n0.C4661t.c.m10562j(r4, r5, r6)
            L5c:
                return r4
        }
    }

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.<init>(r1, r1, r2, r2)
            p332t0.AbstractC6093a.f23502n = r0
            t0.a$a r0 = new t0.a$a
            r0.<init>()
            p332t0.AbstractC6093a.f23503o = r0
            t0.a$b r0 = new t0.a$b
            r0.<init>()
            p332t0.AbstractC6093a.f23504p = r0
            return
    }

    public AbstractC6093a(android.view.View r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f23505d = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f23506e = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f23507f = r0
            r0 = 2
            int[] r0 = new int[r0]
            r2.f23508g = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f23512k = r0
            r2.f23513l = r0
            r2.f23514m = r0
            if (r3 == 0) goto L47
            r2.f23510i = r3
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r2.f23509h = r0
            r0 = 1
            r3.setFocusable(r0)
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.c.m10555c(r3)
            if (r1 != 0) goto L46
            p227n0.C4661t.c.m10571s(r3, r0)
        L46:
            return
        L47:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "View may not be null"
            r3.<init>(r0)
            throw r3
    }

    @Override // p227n0.C4641a
    /* renamed from: b */
    public p242o0.C4869c mo2064b(android.view.View r1) {
            r0 = this;
            t0.a$c r1 = r0.f23511j
            if (r1 != 0) goto Lb
            t0.a$c r1 = new t0.a$c
            r1.<init>(r0)
            r0.f23511j = r1
        Lb:
            t0.a$c r1 = r0.f23511j
            return r1
    }

    @Override // p227n0.C4641a
    /* renamed from: c */
    public void mo1039c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            r0.onInitializeAccessibilityEvent(r2, r3)
            return
    }

    @Override // p227n0.C4641a
    /* renamed from: d */
    public void mo1040d(android.view.View r3, p242o0.C4868b r4) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.f18502a
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.f19337a
            r0.onInitializeAccessibilityNodeInfo(r3, r1)
            r2.mo3343q(r4)
            return
    }

    /* renamed from: j */
    public final boolean m12553j(int r2) {
            r1 = this;
            int r0 = r1.f23512k
            if (r0 != r2) goto L14
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f23512k = r0
            android.view.View r0 = r1.f23510i
            r0.invalidate()
            r0 = 65536(0x10000, float:9.1835E-41)
            r1.m12559u(r2, r0)
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    /* renamed from: k */
    public final boolean m12554k(int r3) {
            r2 = this;
            int r0 = r2.f23513l
            r1 = 0
            if (r0 == r3) goto L6
            return r1
        L6:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f23513l = r0
            r2.mo3345s(r3, r1)
            r0 = 8
            r2.m12559u(r3, r0)
            r3 = 1
            return r3
    }

    /* renamed from: l */
    public final p242o0.C4868b m12555l(int r9) {
            r8 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            o0.b r1 = new o0.b
            r1.<init>(r0)
            r2 = 1
            r0.setEnabled(r2)
            r0.setFocusable(r2)
            java.lang.String r3 = "android.view.View"
            r0.setClassName(r3)
            android.graphics.Rect r3 = p332t0.AbstractC6093a.f23502n
            r0.setBoundsInParent(r3)
            r0.setBoundsInScreen(r3)
            android.view.View r4 = r8.f23510i
            r5 = -1
            r1.f19338b = r5
            r0.setParent(r4)
            r8.mo3344r(r9, r1)
            java.lang.CharSequence r4 = r1.m10994g()
            if (r4 != 0) goto L3d
            java.lang.CharSequence r4 = r1.m10992e()
            if (r4 == 0) goto L35
            goto L3d
        L35:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must add text or a content description in populateNodeForVirtualViewId()"
            r9.<init>(r0)
            throw r9
        L3d:
            android.graphics.Rect r4 = r8.f23506e
            r0.getBoundsInParent(r4)
            android.graphics.Rect r4 = r8.f23506e
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L18c
            int r4 = r0.getActions()
            r6 = r4 & 64
            if (r6 != 0) goto L184
            r6 = 128(0x80, float:1.8E-43)
            r4 = r4 & r6
            if (r4 != 0) goto L17c
            android.view.View r4 = r8.f23510i
            android.content.Context r4 = r4.getContext()
            java.lang.String r4 = r4.getPackageName()
            r0.setPackageName(r4)
            android.view.View r4 = r8.f23510i
            r1.f19339c = r9
            r0.setSource(r4, r9)
            int r4 = r8.f23512k
            r7 = 0
            if (r4 != r9) goto L77
            r0.setAccessibilityFocused(r2)
            r0.addAction(r6)
            goto L7f
        L77:
            r0.setAccessibilityFocused(r7)
            r4 = 64
            r0.addAction(r4)
        L7f:
            int r4 = r8.f23513l
            if (r4 != r9) goto L85
            r9 = 1
            goto L86
        L85:
            r9 = 0
        L86:
            if (r9 == 0) goto L8d
            r4 = 2
            r0.addAction(r4)
            goto L96
        L8d:
            boolean r4 = r0.isFocusable()
            if (r4 == 0) goto L96
            r0.addAction(r2)
        L96:
            r0.setFocused(r9)
            android.view.View r9 = r8.f23510i
            int[] r4 = r8.f23508g
            r9.getLocationOnScreen(r4)
            android.graphics.Rect r9 = r8.f23505d
            r0.getBoundsInScreen(r9)
            android.graphics.Rect r9 = r8.f23505d
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L10b
            android.graphics.Rect r9 = r8.f23505d
            r0.getBoundsInParent(r9)
            int r9 = r1.f19338b
            if (r9 == r5) goto Lf0
            android.view.accessibility.AccessibilityNodeInfo r9 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            o0.b r0 = new o0.b
            r0.<init>(r9)
            int r9 = r1.f19338b
        Lc1:
            if (r9 == r5) goto Leb
            android.view.View r3 = r8.f23510i
            r0.f19338b = r5
            android.view.accessibility.AccessibilityNodeInfo r4 = r0.f19337a
            r4.setParent(r3, r5)
            android.graphics.Rect r3 = p332t0.AbstractC6093a.f23502n
            android.view.accessibility.AccessibilityNodeInfo r4 = r0.f19337a
            r4.setBoundsInParent(r3)
            r8.mo3344r(r9, r0)
            android.graphics.Rect r9 = r8.f23506e
            android.view.accessibility.AccessibilityNodeInfo r3 = r0.f19337a
            r3.getBoundsInParent(r9)
            android.graphics.Rect r9 = r8.f23505d
            android.graphics.Rect r3 = r8.f23506e
            int r4 = r3.left
            int r3 = r3.top
            r9.offset(r4, r3)
            int r9 = r0.f19338b
            goto Lc1
        Leb:
            android.view.accessibility.AccessibilityNodeInfo r9 = r0.f19337a
            r9.recycle()
        Lf0:
            android.graphics.Rect r9 = r8.f23505d
            int[] r0 = r8.f23508g
            r0 = r0[r7]
            android.view.View r3 = r8.f23510i
            int r3 = r3.getScrollX()
            int r0 = r0 - r3
            int[] r3 = r8.f23508g
            r3 = r3[r2]
            android.view.View r4 = r8.f23510i
            int r4 = r4.getScrollY()
            int r3 = r3 - r4
            r9.offset(r0, r3)
        L10b:
            android.view.View r9 = r8.f23510i
            android.graphics.Rect r0 = r8.f23507f
            boolean r9 = r9.getLocalVisibleRect(r0)
            if (r9 == 0) goto L17b
            android.graphics.Rect r9 = r8.f23507f
            int[] r0 = r8.f23508g
            r0 = r0[r7]
            android.view.View r3 = r8.f23510i
            int r3 = r3.getScrollX()
            int r0 = r0 - r3
            int[] r3 = r8.f23508g
            r3 = r3[r2]
            android.view.View r4 = r8.f23510i
            int r4 = r4.getScrollY()
            int r3 = r3 - r4
            r9.offset(r0, r3)
            android.graphics.Rect r9 = r8.f23505d
            android.graphics.Rect r0 = r8.f23507f
            boolean r9 = r9.intersect(r0)
            if (r9 == 0) goto L17b
            android.graphics.Rect r9 = r8.f23505d
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.f19337a
            r0.setBoundsInScreen(r9)
            android.graphics.Rect r9 = r8.f23505d
            if (r9 == 0) goto L174
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L14c
            goto L174
        L14c:
            android.view.View r9 = r8.f23510i
            int r9 = r9.getWindowVisibility()
            if (r9 == 0) goto L155
            goto L174
        L155:
            android.view.View r9 = r8.f23510i
        L157:
            android.view.ViewParent r9 = r9.getParent()
            boolean r0 = r9 instanceof android.view.View
            if (r0 == 0) goto L171
            android.view.View r9 = (android.view.View) r9
            float r0 = r9.getAlpha()
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L174
            int r0 = r9.getVisibility()
            if (r0 == 0) goto L157
            goto L174
        L171:
            if (r9 == 0) goto L174
            r7 = 1
        L174:
            if (r7 == 0) goto L17b
            android.view.accessibility.AccessibilityNodeInfo r9 = r1.f19337a
            r9.setVisibleToUser(r2)
        L17b:
            return r1
        L17c:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r9.<init>(r0)
            throw r9
        L184:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r9.<init>(r0)
            throw r9
        L18c:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must set parent bounds in populateNodeForVirtualViewId()"
            r9.<init>(r0)
            throw r9
    }

    /* renamed from: m */
    public abstract void mo3341m(java.util.List<java.lang.Integer> r1);

    /* renamed from: n */
    public final boolean m12556n(int r20, android.graphics.Rect r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mo3341m(r3)
            s.i r4 = new s.i
            r4.<init>()
            r5 = 0
            r6 = 0
        L15:
            int r7 = r3.size()
            if (r6 >= r7) goto L39
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            o0.b r7 = r0.m12555l(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.m12351g(r8, r7)
            int r6 = r6 + 1
            goto L15
        L39:
            int r3 = r0.f23513l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L41
            r3 = 0
            goto L47
        L41:
            java.lang.Object r3 = r4.m12348d(r3)
            o0.b r3 = (p242o0.C4868b) r3
        L47:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L153
            if (r1 == r8) goto L153
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L67
            if (r1 == r12) goto L67
            if (r1 == r11) goto L67
            if (r1 != r8) goto L5f
            goto L67
        L5f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L67:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f23513l
            java.lang.String r6 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r7) goto L7c
            o0.b r2 = r0.m12557o(r15)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f19337a
            r2.getBoundsInParent(r14)
            goto La9
        L7c:
            if (r2 == 0) goto L82
            r14.set(r2)
            goto La9
        L82:
            android.view.View r2 = r0.f23510i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto La6
            if (r1 == r12) goto La2
            if (r1 == r11) goto L9e
            if (r1 != r8) goto L98
            r14.set(r5, r9, r15, r9)
            goto La9
        L98:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L9e:
            r14.set(r9, r5, r9, r2)
            goto La9
        La2:
            r14.set(r5, r2, r15, r2)
            goto La9
        La6:
            r14.set(r15, r5, r15, r2)
        La9:
            t0.b$b<s.i<o0.b>, o0.b> r2 = p332t0.AbstractC6093a.f23504p
            t0.b$a<o0.b> r15 = p332t0.AbstractC6093a.f23503o
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r14)
            if (r1 == r13) goto Ld7
            if (r1 == r12) goto Lce
            if (r1 == r11) goto Lc7
            if (r1 != r8) goto Lc1
            int r6 = r14.height()
            int r6 = r6 + r10
            int r6 = -r6
            goto Ld3
        Lc1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        Lc7:
            int r6 = r14.width()
            int r6 = r6 + r10
            int r6 = -r6
            goto Ldc
        Lce:
            int r6 = r14.height()
            int r6 = r6 + r10
        Ld3:
            r7.offset(r5, r6)
            goto Ldf
        Ld7:
            int r6 = r14.width()
            int r6 = r6 + r10
        Ldc:
            r7.offset(r6, r5)
        Ldf:
            t0.a$b r2 = (p332t0.AbstractC6093a.b) r2
            java.util.Objects.requireNonNull(r2)
            int r2 = r4.m12352j()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r8 = 0
            r16 = 0
        Lf0:
            if (r8 >= r2) goto L1c8
            boolean r11 = r4.f22814Y
            if (r11 == 0) goto Lf9
            r4.m12347c()
        Lf9:
            java.lang.Object[] r11 = r4.f22816a0
            r11 = r11[r8]
            o0.b r11 = (p242o0.C4868b) r11
            if (r11 != r3) goto L102
            goto L150
        L102:
            r12 = r15
            t0.a$a r12 = (p332t0.AbstractC6093a.a) r12
            r12.m12561a(r11, r6)
            boolean r12 = p332t0.C6094b.m12564c(r14, r6, r1)
            if (r12 != 0) goto L10f
            goto L148
        L10f:
            boolean r12 = p332t0.C6094b.m12564c(r14, r7, r1)
            if (r12 != 0) goto L116
            goto L146
        L116:
            boolean r12 = p332t0.C6094b.m12562a(r1, r14, r6, r7)
            if (r12 == 0) goto L11d
            goto L146
        L11d:
            boolean r12 = p332t0.C6094b.m12562a(r1, r14, r7, r6)
            if (r12 == 0) goto L124
            goto L148
        L124:
            int r12 = p332t0.C6094b.m12565d(r1, r14, r6)
            int r13 = p332t0.C6094b.m12566e(r1, r14, r6)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = p332t0.C6094b.m12565d(r1, r14, r7)
            int r17 = p332t0.C6094b.m12566e(r1, r14, r7)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L148
        L146:
            r12 = 1
            goto L149
        L148:
            r12 = 0
        L149:
            if (r12 == 0) goto L150
            r7.set(r6)
            r16 = r11
        L150:
            int r8 = r8 + 1
            goto Lf0
        L153:
            android.view.View r2 = r0.f23510i
            java.util.WeakHashMap<android.view.View, n0.w> r6 = p227n0.C4661t.f18570a
            int r2 = p227n0.C4661t.d.m10575d(r2)
            if (r2 != r10) goto L15f
            r2 = 1
            goto L160
        L15f:
            r2 = 0
        L160:
            t0.b$b<s.i<o0.b>, o0.b> r6 = p332t0.AbstractC6093a.f23504p
            t0.b$a<o0.b> r7 = p332t0.AbstractC6093a.f23503o
            t0.a$b r6 = (p332t0.AbstractC6093a.b) r6
            java.util.Objects.requireNonNull(r6)
            int r6 = r4.m12352j()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = 0
        L173:
            if (r12 >= r6) goto L188
            boolean r13 = r4.f22814Y
            if (r13 == 0) goto L17c
            r4.m12347c()
        L17c:
            java.lang.Object[] r13 = r4.f22816a0
            r13 = r13[r12]
            o0.b r13 = (p242o0.C4868b) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L173
        L188:
            t0.b$c r6 = new t0.b$c
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L1b2
            if (r1 != r8) goto L1aa
            int r1 = r11.size()
            if (r3 != 0) goto L19c
            r2 = -1
            goto L1a0
        L19c:
            int r2 = r11.lastIndexOf(r3)
        L1a0:
            int r2 = r2 + r10
            if (r2 >= r1) goto L1a8
            java.lang.Object r6 = r11.get(r2)
            goto L1c4
        L1a8:
            r6 = 0
            goto L1c4
        L1aa:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L1b2:
            int r1 = r11.size()
            if (r3 != 0) goto L1b9
            goto L1bd
        L1b9:
            int r1 = r11.indexOf(r3)
        L1bd:
            int r1 = r1 + r9
            if (r1 < 0) goto L1a8
            java.lang.Object r6 = r11.get(r1)
        L1c4:
            r16 = r6
            o0.b r16 = (p242o0.C4868b) r16
        L1c8:
            r1 = r16
            if (r1 != 0) goto L1cf
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1e9
        L1cf:
            boolean r2 = r4.f22814Y
            if (r2 == 0) goto L1d6
            r4.m12347c()
        L1d6:
            int r2 = r4.f22817b0
            if (r5 >= r2) goto L1e5
            java.lang.Object[] r2 = r4.f22816a0
            r2 = r2[r5]
            if (r2 != r1) goto L1e2
            r9 = r5
            goto L1e5
        L1e2:
            int r5 = r5 + 1
            goto L1d6
        L1e5:
            int r7 = r4.m12350f(r9)
        L1e9:
            boolean r1 = r0.m12558t(r7)
            return r1
    }

    /* renamed from: o */
    public p242o0.C4868b m12557o(int r7) {
            r6 = this;
            r0 = -1
            if (r7 != r0) goto L4e
            android.view.View r7 = r6.f23510i
            android.view.accessibility.AccessibilityNodeInfo r7 = android.view.accessibility.AccessibilityNodeInfo.obtain(r7)
            o0.b r0 = new o0.b
            r0.<init>(r7)
            android.view.View r1 = r6.f23510i
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            r1.onInitializeAccessibilityNodeInfo(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.mo3341m(r1)
            int r7 = r7.getChildCount()
            if (r7 <= 0) goto L32
            int r7 = r1.size()
            if (r7 > 0) goto L2a
            goto L32
        L2a:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Views cannot have both real and virtual children"
            r7.<init>(r0)
            throw r7
        L32:
            r7 = 0
            int r2 = r1.size()
        L37:
            if (r7 >= r2) goto L4d
            android.view.View r3 = r6.f23510i
            java.lang.Object r4 = r1.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            android.view.accessibility.AccessibilityNodeInfo r5 = r0.f19337a
            r5.addChild(r3, r4)
            int r7 = r7 + 1
            goto L37
        L4d:
            return r0
        L4e:
            o0.b r7 = r6.m12555l(r7)
            return r7
    }

    /* renamed from: p */
    public abstract boolean mo3342p(int r1, int r2, android.os.Bundle r3);

    /* renamed from: q */
    public void mo3343q(p242o0.C4868b r1) {
            r0 = this;
            return
    }

    /* renamed from: r */
    public abstract void mo3344r(int r1, p242o0.C4868b r2);

    /* renamed from: s */
    public void mo3345s(int r1, boolean r2) {
            r0 = this;
            return
    }

    /* renamed from: t */
    public final boolean m12558t(int r4) {
            r3 = this;
            android.view.View r0 = r3.f23510i
            boolean r0 = r0.isFocused()
            r1 = 0
            if (r0 != 0) goto L12
            android.view.View r0 = r3.f23510i
            boolean r0 = r0.requestFocus()
            if (r0 != 0) goto L12
            return r1
        L12:
            int r0 = r3.f23513l
            if (r0 != r4) goto L17
            return r1
        L17:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L1e
            r3.m12554k(r0)
        L1e:
            if (r4 != r2) goto L21
            return r1
        L21:
            r3.f23513l = r4
            r0 = 1
            r3.mo3345s(r4, r0)
            r1 = 8
            r3.m12559u(r4, r1)
            return r0
    }

    /* renamed from: u */
    public final boolean m12559u(int r5, int r6) {
            r4 = this;
            r0 = 0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r1) goto L9e
            android.view.accessibility.AccessibilityManager r1 = r4.f23509h
            boolean r1 = r1.isEnabled()
            if (r1 != 0) goto Lf
            goto L9e
        Lf:
            android.view.View r1 = r4.f23510i
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L18
            return r0
        L18:
            r0 = -1
            if (r5 == r0) goto L8e
            android.view.accessibility.AccessibilityEvent r6 = android.view.accessibility.AccessibilityEvent.obtain(r6)
            o0.b r0 = r4.m12557o(r5)
            java.util.List r2 = r6.getText()
            java.lang.CharSequence r3 = r0.m10994g()
            r2.add(r3)
            java.lang.CharSequence r2 = r0.m10992e()
            r6.setContentDescription(r2)
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.f19337a
            boolean r2 = r2.isScrollable()
            r6.setScrollable(r2)
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.f19337a
            boolean r2 = r2.isPassword()
            r6.setPassword(r2)
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.f19337a
            boolean r2 = r2.isEnabled()
            r6.setEnabled(r2)
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.f19337a
            boolean r2 = r2.isChecked()
            r6.setChecked(r2)
            java.util.List r2 = r6.getText()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L72
            java.lang.CharSequence r2 = r6.getContentDescription()
            if (r2 == 0) goto L6a
            goto L72
        L6a:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r5.<init>(r6)
            throw r5
        L72:
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f19337a
            java.lang.CharSequence r0 = r0.getClassName()
            r6.setClassName(r0)
            android.view.View r0 = r4.f23510i
            r6.setSource(r0, r5)
            android.view.View r5 = r4.f23510i
            android.content.Context r5 = r5.getContext()
            java.lang.String r5 = r5.getPackageName()
            r6.setPackageName(r5)
            goto L97
        L8e:
            android.view.accessibility.AccessibilityEvent r6 = android.view.accessibility.AccessibilityEvent.obtain(r6)
            android.view.View r5 = r4.f23510i
            r5.onInitializeAccessibilityEvent(r6)
        L97:
            android.view.View r5 = r4.f23510i
            boolean r5 = r1.requestSendAccessibilityEvent(r5, r6)
            return r5
        L9e:
            return r0
    }

    /* renamed from: v */
    public final void m12560v(int r3) {
            r2 = this;
            int r0 = r2.f23514m
            if (r0 != r3) goto L5
            return
        L5:
            r2.f23514m = r3
            r1 = 128(0x80, float:1.8E-43)
            r2.m12559u(r3, r1)
            r3 = 256(0x100, float:3.59E-43)
            r2.m12559u(r0, r3)
            return
    }
}
