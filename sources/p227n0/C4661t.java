package p227n0;

@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: n0.t */
/* loaded from: classes.dex */
public class C4661t {

    /* renamed from: a */
    public static java.util.WeakHashMap<android.view.View, p227n0.C4664w> f18570a;

    /* renamed from: b */
    public static java.lang.reflect.Field f18571b;

    /* renamed from: c */
    public static boolean f18572c;

    /* renamed from: d */
    public static java.lang.ThreadLocal<android.graphics.Rect> f18573d;

    /* renamed from: e */
    public static final int[] f18574e = null;

    /* renamed from: f */
    public static final p227n0.InterfaceC4655n f18575f = null;

    /* renamed from: n0.t$a */
    public static abstract class a<T> {

        /* renamed from: a */
        public final int f18576a;

        /* renamed from: b */
        public final java.lang.Class<T> f18577b;

        /* renamed from: c */
        public final int f18578c;

        /* renamed from: d */
        public final int f18579d;

        public a(int r1, java.lang.Class<T> r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f18576a = r1
                r0.f18577b = r2
                r1 = 0
                r0.f18579d = r1
                r0.f18578c = r3
                return
        }

        public a(int r1, java.lang.Class<T> r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f18576a = r1
                r0.f18577b = r2
                r0.f18579d = r3
                r0.f18578c = r4
                return
        }

        /* renamed from: a */
        public boolean m10549a(java.lang.Boolean r3, java.lang.Boolean r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                if (r3 == 0) goto Lc
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                if (r4 == 0) goto L17
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L17
                r4 = 1
                goto L18
            L17:
                r4 = 0
            L18:
                if (r3 != r4) goto L1b
                goto L1c
            L1b:
                r0 = 0
            L1c:
                return r0
        }

        /* renamed from: b */
        public abstract T mo10522b(android.view.View r1);

        /* renamed from: c */
        public abstract void mo10523c(android.view.View r1, T r2);

        /* renamed from: d */
        public T m10550d(android.view.View r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                int r1 = r2.f18578c
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                if (r0 == 0) goto L10
                java.lang.Object r3 = r2.mo10522b(r3)
                return r3
            L10:
                int r0 = r2.f18576a
                java.lang.Object r3 = r3.getTag(r0)
                java.lang.Class<T> r0 = r2.f18577b
                boolean r0 = r0.isInstance(r3)
                if (r0 == 0) goto L1f
                return r3
            L1f:
                r3 = 0
                return r3
        }

        /* renamed from: e */
        public void m10551e(android.view.View r3, T r4) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                int r1 = r2.f18578c
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                if (r0 == 0) goto Lf
                r2.mo10523c(r3, r4)
                goto L31
            Lf:
                java.lang.Object r0 = r2.m10550d(r3)
                boolean r0 = r2.mo10524f(r0, r4)
                if (r0 == 0) goto L31
                n0.a r0 = p227n0.C4661t.m10531g(r3)
                if (r0 != 0) goto L24
                n0.a r0 = new n0.a
                r0.<init>()
            L24:
                p227n0.C4661t.m10546v(r3, r0)
                int r0 = r2.f18576a
                r3.setTag(r0, r4)
                int r4 = r2.f18579d
                p227n0.C4661t.m10537m(r3, r4)
            L31:
                return
        }

        /* renamed from: f */
        public abstract boolean mo10524f(T r1, T r2);
    }

    /* renamed from: n0.t$b */
    public static class b {
        /* renamed from: a */
        public static boolean m10552a(android.view.View r0) {
                boolean r0 = r0.hasOnClickListeners()
                return r0
        }
    }

    /* renamed from: n0.t$c */
    public static class c {
        /* renamed from: a */
        public static android.view.accessibility.AccessibilityNodeProvider m10553a(android.view.View r0) {
                android.view.accessibility.AccessibilityNodeProvider r0 = r0.getAccessibilityNodeProvider()
                return r0
        }

        /* renamed from: b */
        public static boolean m10554b(android.view.View r0) {
                boolean r0 = r0.getFitsSystemWindows()
                return r0
        }

        /* renamed from: c */
        public static int m10555c(android.view.View r0) {
                int r0 = r0.getImportantForAccessibility()
                return r0
        }

        /* renamed from: d */
        public static int m10556d(android.view.View r0) {
                int r0 = r0.getMinimumHeight()
                return r0
        }

        /* renamed from: e */
        public static int m10557e(android.view.View r0) {
                int r0 = r0.getMinimumWidth()
                return r0
        }

        /* renamed from: f */
        public static android.view.ViewParent m10558f(android.view.View r0) {
                android.view.ViewParent r0 = r0.getParentForAccessibility()
                return r0
        }

        /* renamed from: g */
        public static int m10559g(android.view.View r0) {
                int r0 = r0.getWindowSystemUiVisibility()
                return r0
        }

        /* renamed from: h */
        public static boolean m10560h(android.view.View r0) {
                boolean r0 = r0.hasOverlappingRendering()
                return r0
        }

        /* renamed from: i */
        public static boolean m10561i(android.view.View r0) {
                boolean r0 = r0.hasTransientState()
                return r0
        }

        /* renamed from: j */
        public static boolean m10562j(android.view.View r0, int r1, android.os.Bundle r2) {
                boolean r0 = r0.performAccessibilityAction(r1, r2)
                return r0
        }

        /* renamed from: k */
        public static void m10563k(android.view.View r0) {
                r0.postInvalidateOnAnimation()
                return
        }

        /* renamed from: l */
        public static void m10564l(android.view.View r0, int r1, int r2, int r3, int r4) {
                r0.postInvalidateOnAnimation(r1, r2, r3, r4)
                return
        }

        /* renamed from: m */
        public static void m10565m(android.view.View r0, java.lang.Runnable r1) {
                r0.postOnAnimation(r1)
                return
        }

        /* renamed from: n */
        public static void m10566n(android.view.View r0, java.lang.Runnable r1, long r2) {
                r0.postOnAnimationDelayed(r1, r2)
                return
        }

        /* renamed from: o */
        public static void m10567o(android.view.ViewTreeObserver r0, android.view.ViewTreeObserver.OnGlobalLayoutListener r1) {
                r0.removeOnGlobalLayoutListener(r1)
                return
        }

        /* renamed from: p */
        public static void m10568p(android.view.View r0) {
                r0.requestFitSystemWindows()
                return
        }

        /* renamed from: q */
        public static void m10569q(android.view.View r0, android.graphics.drawable.Drawable r1) {
                r0.setBackground(r1)
                return
        }

        /* renamed from: r */
        public static void m10570r(android.view.View r0, boolean r1) {
                r0.setHasTransientState(r1)
                return
        }

        /* renamed from: s */
        public static void m10571s(android.view.View r0, int r1) {
                r0.setImportantForAccessibility(r1)
                return
        }
    }

    /* renamed from: n0.t$d */
    public static class d {
        /* renamed from: a */
        public static int m10572a() {
                int r0 = android.view.View.generateViewId()
                return r0
        }

        /* renamed from: b */
        public static android.view.Display m10573b(android.view.View r0) {
                android.view.Display r0 = r0.getDisplay()
                return r0
        }

        /* renamed from: c */
        public static int m10574c(android.view.View r0) {
                int r0 = r0.getLabelFor()
                return r0
        }

        /* renamed from: d */
        public static int m10575d(android.view.View r0) {
                int r0 = r0.getLayoutDirection()
                return r0
        }

        /* renamed from: e */
        public static int m10576e(android.view.View r0) {
                int r0 = r0.getPaddingEnd()
                return r0
        }

        /* renamed from: f */
        public static int m10577f(android.view.View r0) {
                int r0 = r0.getPaddingStart()
                return r0
        }

        /* renamed from: g */
        public static boolean m10578g(android.view.View r0) {
                boolean r0 = r0.isPaddingRelative()
                return r0
        }

        /* renamed from: h */
        public static void m10579h(android.view.View r0, int r1) {
                r0.setLabelFor(r1)
                return
        }

        /* renamed from: i */
        public static void m10580i(android.view.View r0, android.graphics.Paint r1) {
                r0.setLayerPaint(r1)
                return
        }

        /* renamed from: j */
        public static void m10581j(android.view.View r0, int r1) {
                r0.setLayoutDirection(r1)
                return
        }

        /* renamed from: k */
        public static void m10582k(android.view.View r0, int r1, int r2, int r3, int r4) {
                r0.setPaddingRelative(r1, r2, r3, r4)
                return
        }
    }

    /* renamed from: n0.t$e */
    public static class e {
        /* renamed from: a */
        public static android.graphics.Rect m10583a(android.view.View r0) {
                android.graphics.Rect r0 = r0.getClipBounds()
                return r0
        }

        /* renamed from: b */
        public static boolean m10584b(android.view.View r0) {
                boolean r0 = r0.isInLayout()
                return r0
        }

        /* renamed from: c */
        public static void m10585c(android.view.View r0, android.graphics.Rect r1) {
                r0.setClipBounds(r1)
                return
        }
    }

    /* renamed from: n0.t$f */
    public static class f {
        /* renamed from: a */
        public static int m10586a(android.view.View r0) {
                int r0 = r0.getAccessibilityLiveRegion()
                return r0
        }

        /* renamed from: b */
        public static boolean m10587b(android.view.View r0) {
                boolean r0 = r0.isAttachedToWindow()
                return r0
        }

        /* renamed from: c */
        public static boolean m10588c(android.view.View r0) {
                boolean r0 = r0.isLaidOut()
                return r0
        }

        /* renamed from: d */
        public static boolean m10589d(android.view.View r0) {
                boolean r0 = r0.isLayoutDirectionResolved()
                return r0
        }

        /* renamed from: e */
        public static void m10590e(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
                r0.notifySubtreeAccessibilityStateChanged(r1, r2, r3)
                return
        }

        /* renamed from: f */
        public static void m10591f(android.view.View r0, int r1) {
                r0.setAccessibilityLiveRegion(r1)
                return
        }

        /* renamed from: g */
        public static void m10592g(android.view.accessibility.AccessibilityEvent r0, int r1) {
                r0.setContentChangeTypes(r1)
                return
        }
    }

    /* renamed from: n0.t$g */
    public static class g {
        /* renamed from: a */
        public static android.view.WindowInsets m10593a(android.view.View r0, android.view.WindowInsets r1) {
                android.view.WindowInsets r0 = r0.dispatchApplyWindowInsets(r1)
                return r0
        }

        /* renamed from: b */
        public static android.view.WindowInsets m10594b(android.view.View r0, android.view.WindowInsets r1) {
                android.view.WindowInsets r0 = r0.onApplyWindowInsets(r1)
                return r0
        }

        /* renamed from: c */
        public static void m10595c(android.view.View r0) {
                r0.requestApplyInsets()
                return
        }
    }

    /* renamed from: n0.t$h */
    public static class h {

        /* renamed from: n0.t$h$a */
        public class a implements android.view.View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public p227n0.C4642a0 f18580a;

            /* renamed from: b */
            public final /* synthetic */ android.view.View f18581b;

            /* renamed from: c */
            public final /* synthetic */ p227n0.InterfaceC4653l f18582c;

            public a(android.view.View r1, p227n0.InterfaceC4653l r2) {
                    r0 = this;
                    r0.f18581b = r1
                    r0.f18582c = r2
                    r0.<init>()
                    r1 = 0
                    r0.f18580a = r1
                    return
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public android.view.WindowInsets onApplyWindowInsets(android.view.View r5, android.view.WindowInsets r6) {
                    r4 = this;
                    n0.a0 r0 = p227n0.C4642a0.m10464i(r6, r5)
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 30
                    if (r1 >= r2) goto L22
                    android.view.View r3 = r4.f18581b
                    p227n0.C4661t.h.m10596a(r6, r3)
                    n0.a0 r6 = r4.f18580a
                    boolean r6 = r0.equals(r6)
                    if (r6 == 0) goto L22
                    n0.l r6 = r4.f18582c
                    n0.a0 r5 = r6.mo984a(r5, r0)
                    android.view.WindowInsets r5 = r5.m10470g()
                    return r5
                L22:
                    r4.f18580a = r0
                    n0.l r6 = r4.f18582c
                    n0.a0 r6 = r6.mo984a(r5, r0)
                    if (r1 < r2) goto L31
                    android.view.WindowInsets r5 = r6.m10470g()
                    return r5
                L31:
                    java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                    p227n0.C4661t.g.m10595c(r5)
                    android.view.WindowInsets r5 = r6.m10470g()
                    return r5
            }
        }

        /* renamed from: a */
        public static void m10596a(android.view.WindowInsets r1, android.view.View r2) {
                r0 = 2131362665(0x7f0a0369, float:1.8345117E38)
                java.lang.Object r0 = r2.getTag(r0)
                android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
                if (r0 == 0) goto Le
                r0.onApplyWindowInsets(r2, r1)
            Le:
                return
        }

        /* renamed from: b */
        public static p227n0.C4642a0 m10597b(android.view.View r1, p227n0.C4642a0 r2, android.graphics.Rect r3) {
                android.view.WindowInsets r0 = r2.m10470g()
                if (r0 == 0) goto Lf
                android.view.WindowInsets r2 = r1.computeSystemWindowInsets(r0, r3)
                n0.a0 r1 = p227n0.C4642a0.m10464i(r2, r1)
                return r1
            Lf:
                r3.setEmpty()
                return r2
        }

        /* renamed from: c */
        public static boolean m10598c(android.view.View r0, float r1, float r2, boolean r3) {
                boolean r0 = r0.dispatchNestedFling(r1, r2, r3)
                return r0
        }

        /* renamed from: d */
        public static boolean m10599d(android.view.View r0, float r1, float r2) {
                boolean r0 = r0.dispatchNestedPreFling(r1, r2)
                return r0
        }

        /* renamed from: e */
        public static boolean m10600e(android.view.View r0, int r1, int r2, int[] r3, int[] r4) {
                boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4)
                return r0
        }

        /* renamed from: f */
        public static boolean m10601f(android.view.View r0, int r1, int r2, int r3, int r4, int[] r5) {
                boolean r0 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
                return r0
        }

        /* renamed from: g */
        public static android.content.res.ColorStateList m10602g(android.view.View r0) {
                android.content.res.ColorStateList r0 = r0.getBackgroundTintList()
                return r0
        }

        /* renamed from: h */
        public static android.graphics.PorterDuff.Mode m10603h(android.view.View r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getBackgroundTintMode()
                return r0
        }

        /* renamed from: i */
        public static float m10604i(android.view.View r0) {
                float r0 = r0.getElevation()
                return r0
        }

        /* renamed from: j */
        public static p227n0.C4642a0 m10605j(android.view.View r7) {
                boolean r0 = p227n0.C4642a0.a.f18510d
                r1 = 0
                if (r0 == 0) goto L91
                boolean r0 = r7.isAttachedToWindow()
                if (r0 != 0) goto Ld
                goto L91
            Ld:
                android.view.View r0 = r7.getRootView()
                java.lang.reflect.Field r2 = p227n0.C4642a0.a.f18507a     // Catch: java.lang.IllegalAccessException -> L7a
                java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L7a
                if (r0 == 0) goto L91
                java.lang.reflect.Field r2 = p227n0.C4642a0.a.f18508b     // Catch: java.lang.IllegalAccessException -> L7a
                java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L7a
                android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch: java.lang.IllegalAccessException -> L7a
                java.lang.reflect.Field r3 = p227n0.C4642a0.a.f18509c     // Catch: java.lang.IllegalAccessException -> L7a
                java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.IllegalAccessException -> L7a
                android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch: java.lang.IllegalAccessException -> L7a
                if (r2 == 0) goto L91
                if (r0 == 0) goto L91
                int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.IllegalAccessException -> L7a
                r4 = 30
                if (r3 < r4) goto L39
                n0.a0$d r3 = new n0.a0$d     // Catch: java.lang.IllegalAccessException -> L7a
                r3.<init>()     // Catch: java.lang.IllegalAccessException -> L7a
                goto L48
            L39:
                r4 = 29
                if (r3 < r4) goto L43
                n0.a0$c r3 = new n0.a0$c     // Catch: java.lang.IllegalAccessException -> L7a
                r3.<init>()     // Catch: java.lang.IllegalAccessException -> L7a
                goto L48
            L43:
                n0.a0$b r3 = new n0.a0$b     // Catch: java.lang.IllegalAccessException -> L7a
                r3.<init>()     // Catch: java.lang.IllegalAccessException -> L7a
            L48:
                int r4 = r2.left     // Catch: java.lang.IllegalAccessException -> L7a
                int r5 = r2.top     // Catch: java.lang.IllegalAccessException -> L7a
                int r6 = r2.right     // Catch: java.lang.IllegalAccessException -> L7a
                int r2 = r2.bottom     // Catch: java.lang.IllegalAccessException -> L7a
                f0.c r2 = p084f0.C1940c.m4827a(r4, r5, r6, r2)     // Catch: java.lang.IllegalAccessException -> L7a
                r3.mo10473c(r2)     // Catch: java.lang.IllegalAccessException -> L7a
                int r2 = r0.left     // Catch: java.lang.IllegalAccessException -> L7a
                int r4 = r0.top     // Catch: java.lang.IllegalAccessException -> L7a
                int r5 = r0.right     // Catch: java.lang.IllegalAccessException -> L7a
                int r0 = r0.bottom     // Catch: java.lang.IllegalAccessException -> L7a
                f0.c r0 = p084f0.C1940c.m4827a(r2, r4, r5, r0)     // Catch: java.lang.IllegalAccessException -> L7a
                r3.mo10474d(r0)     // Catch: java.lang.IllegalAccessException -> L7a
                n0.a0 r0 = r3.mo10472b()     // Catch: java.lang.IllegalAccessException -> L7a
                n0.a0$k r2 = r0.f18506a     // Catch: java.lang.IllegalAccessException -> L7a
                r2.mo10482m(r0)     // Catch: java.lang.IllegalAccessException -> L7a
                android.view.View r7 = r7.getRootView()     // Catch: java.lang.IllegalAccessException -> L7a
                n0.a0$k r2 = r0.f18506a     // Catch: java.lang.IllegalAccessException -> L7a
                r2.mo10477d(r7)     // Catch: java.lang.IllegalAccessException -> L7a
                r1 = r0
                goto L91
            L7a:
                r7 = move-exception
                java.lang.String r0 = "Failed to get insets from AttachInfo. "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r2 = r7.getMessage()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "WindowInsetsCompat"
                android.util.Log.w(r2, r0, r7)
            L91:
                return r1
        }

        /* renamed from: k */
        public static java.lang.String m10606k(android.view.View r0) {
                java.lang.String r0 = r0.getTransitionName()
                return r0
        }

        /* renamed from: l */
        public static float m10607l(android.view.View r0) {
                float r0 = r0.getTranslationZ()
                return r0
        }

        /* renamed from: m */
        public static float m10608m(android.view.View r0) {
                float r0 = r0.getZ()
                return r0
        }

        /* renamed from: n */
        public static boolean m10609n(android.view.View r0) {
                boolean r0 = r0.hasNestedScrollingParent()
                return r0
        }

        /* renamed from: o */
        public static boolean m10610o(android.view.View r0) {
                boolean r0 = r0.isImportantForAccessibility()
                return r0
        }

        /* renamed from: p */
        public static boolean m10611p(android.view.View r0) {
                boolean r0 = r0.isNestedScrollingEnabled()
                return r0
        }

        /* renamed from: q */
        public static void m10612q(android.view.View r0, android.content.res.ColorStateList r1) {
                r0.setBackgroundTintList(r1)
                return
        }

        /* renamed from: r */
        public static void m10613r(android.view.View r0, android.graphics.PorterDuff.Mode r1) {
                r0.setBackgroundTintMode(r1)
                return
        }

        /* renamed from: s */
        public static void m10614s(android.view.View r0, float r1) {
                r0.setElevation(r1)
                return
        }

        /* renamed from: t */
        public static void m10615t(android.view.View r0, boolean r1) {
                r0.setNestedScrollingEnabled(r1)
                return
        }

        /* renamed from: u */
        public static void m10616u(android.view.View r2, p227n0.InterfaceC4653l r3) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 >= r1) goto Lc
                r0 = 2131362657(0x7f0a0361, float:1.83451E38)
                r2.setTag(r0, r3)
            Lc:
                if (r3 != 0) goto L1b
                r3 = 2131362665(0x7f0a0369, float:1.8345117E38)
                java.lang.Object r3 = r2.getTag(r3)
                android.view.View$OnApplyWindowInsetsListener r3 = (android.view.View.OnApplyWindowInsetsListener) r3
                r2.setOnApplyWindowInsetsListener(r3)
                return
            L1b:
                n0.t$h$a r0 = new n0.t$h$a
                r0.<init>(r2, r3)
                r2.setOnApplyWindowInsetsListener(r0)
                return
        }

        /* renamed from: v */
        public static void m10617v(android.view.View r0, java.lang.String r1) {
                r0.setTransitionName(r1)
                return
        }

        /* renamed from: w */
        public static void m10618w(android.view.View r0, float r1) {
                r0.setTranslationZ(r1)
                return
        }

        /* renamed from: x */
        public static void m10619x(android.view.View r0, float r1) {
                r0.setZ(r1)
                return
        }

        /* renamed from: y */
        public static boolean m10620y(android.view.View r0, int r1) {
                boolean r0 = r0.startNestedScroll(r1)
                return r0
        }

        /* renamed from: z */
        public static void m10621z(android.view.View r0) {
                r0.stopNestedScroll()
                return
        }
    }

    /* renamed from: n0.t$i */
    public static class i {
        /* renamed from: a */
        public static p227n0.C4642a0 m10622a(android.view.View r2) {
                android.view.WindowInsets r0 = r2.getRootWindowInsets()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                n0.a0 r0 = p227n0.C4642a0.m10464i(r0, r1)
                n0.a0$k r1 = r0.f18506a
                r1.mo10482m(r0)
                android.view.View r2 = r2.getRootView()
                n0.a0$k r1 = r0.f18506a
                r1.mo10477d(r2)
                return r0
        }

        /* renamed from: b */
        public static int m10623b(android.view.View r0) {
                int r0 = r0.getScrollIndicators()
                return r0
        }

        /* renamed from: c */
        public static void m10624c(android.view.View r0, int r1) {
                r0.setScrollIndicators(r1)
                return
        }

        /* renamed from: d */
        public static void m10625d(android.view.View r0, int r1, int r2) {
                r0.setScrollIndicators(r1, r2)
                return
        }
    }

    /* renamed from: n0.t$j */
    public static class j {
        /* renamed from: a */
        public static void m10626a(android.view.View r0) {
                r0.cancelDragAndDrop()
                return
        }

        /* renamed from: b */
        public static void m10627b(android.view.View r0) {
                r0.dispatchFinishTemporaryDetach()
                return
        }

        /* renamed from: c */
        public static void m10628c(android.view.View r0) {
                r0.dispatchStartTemporaryDetach()
                return
        }

        /* renamed from: d */
        public static void m10629d(android.view.View r0, android.view.PointerIcon r1) {
                r0.setPointerIcon(r1)
                return
        }

        /* renamed from: e */
        public static boolean m10630e(android.view.View r0, android.content.ClipData r1, android.view.View.DragShadowBuilder r2, java.lang.Object r3, int r4) {
                boolean r0 = r0.startDragAndDrop(r1, r2, r3, r4)
                return r0
        }

        /* renamed from: f */
        public static void m10631f(android.view.View r0, android.view.View.DragShadowBuilder r1) {
                r0.updateDragShadow(r1)
                return
        }
    }

    /* renamed from: n0.t$k */
    public static class k {
        /* renamed from: a */
        public static void m10632a(android.view.View r0, java.util.Collection<android.view.View> r1, int r2) {
                r0.addKeyboardNavigationClusters(r1, r2)
                return
        }

        /* renamed from: b */
        public static int m10633b(android.view.View r0) {
                int r0 = r0.getImportantForAutofill()
                return r0
        }

        /* renamed from: c */
        public static int m10634c(android.view.View r0) {
                int r0 = r0.getNextClusterForwardId()
                return r0
        }

        /* renamed from: d */
        public static boolean m10635d(android.view.View r0) {
                boolean r0 = r0.hasExplicitFocusable()
                return r0
        }

        /* renamed from: e */
        public static boolean m10636e(android.view.View r0) {
                boolean r0 = r0.isFocusedByDefault()
                return r0
        }

        /* renamed from: f */
        public static boolean m10637f(android.view.View r0) {
                boolean r0 = r0.isImportantForAutofill()
                return r0
        }

        /* renamed from: g */
        public static boolean m10638g(android.view.View r0) {
                boolean r0 = r0.isKeyboardNavigationCluster()
                return r0
        }

        /* renamed from: h */
        public static android.view.View m10639h(android.view.View r0, android.view.View r1, int r2) {
                android.view.View r0 = r0.keyboardNavigationClusterSearch(r1, r2)
                return r0
        }

        /* renamed from: i */
        public static boolean m10640i(android.view.View r0) {
                boolean r0 = r0.restoreDefaultFocus()
                return r0
        }

        /* renamed from: j */
        public static void m10641j(android.view.View r0, java.lang.String... r1) {
                r0.setAutofillHints(r1)
                return
        }

        /* renamed from: k */
        public static void m10642k(android.view.View r0, boolean r1) {
                r0.setFocusedByDefault(r1)
                return
        }

        /* renamed from: l */
        public static void m10643l(android.view.View r0, int r1) {
                r0.setImportantForAutofill(r1)
                return
        }

        /* renamed from: m */
        public static void m10644m(android.view.View r0, boolean r1) {
                r0.setKeyboardNavigationCluster(r1)
                return
        }

        /* renamed from: n */
        public static void m10645n(android.view.View r0, int r1) {
                r0.setNextClusterForwardId(r1)
                return
        }

        /* renamed from: o */
        public static void m10646o(android.view.View r0, java.lang.CharSequence r1) {
                r0.setTooltipText(r1)
                return
        }
    }

    /* renamed from: n0.t$l */
    public static class l {
        /* renamed from: a */
        public static void m10647a(android.view.View r2, p227n0.C4661t.q r3) {
                r0 = 2131362664(0x7f0a0368, float:1.8345115E38)
                java.lang.Object r1 = r2.getTag(r0)
                s.h r1 = (p319s.C5941h) r1
                if (r1 != 0) goto L13
                s.h r1 = new s.h
                r1.<init>()
                r2.setTag(r0, r1)
            L13:
                java.util.Objects.requireNonNull(r3)
                n0.u r0 = new n0.u
                r0.<init>(r3)
                r1.put(r3, r0)
                r2.addOnUnhandledKeyEventListener(r0)
                return
        }

        /* renamed from: b */
        public static java.lang.CharSequence m10648b(android.view.View r0) {
                java.lang.CharSequence r0 = r0.getAccessibilityPaneTitle()
                return r0
        }

        /* renamed from: c */
        public static boolean m10649c(android.view.View r0) {
                boolean r0 = r0.isAccessibilityHeading()
                return r0
        }

        /* renamed from: d */
        public static boolean m10650d(android.view.View r0) {
                boolean r0 = r0.isScreenReaderFocusable()
                return r0
        }

        /* renamed from: e */
        public static void m10651e(android.view.View r2, p227n0.C4661t.q r3) {
                r0 = 2131362664(0x7f0a0368, float:1.8345115E38)
                java.lang.Object r0 = r2.getTag(r0)
                s.h r0 = (p319s.C5941h) r0
                if (r0 != 0) goto Lc
                return
            Lc:
                r1 = 0
                java.lang.Object r3 = r0.getOrDefault(r3, r1)
                android.view.View$OnUnhandledKeyEventListener r3 = (android.view.View.OnUnhandledKeyEventListener) r3
                if (r3 == 0) goto L18
                r2.removeOnUnhandledKeyEventListener(r3)
            L18:
                return
        }

        /* renamed from: f */
        public static <T> T m10652f(android.view.View r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }

        /* renamed from: g */
        public static void m10653g(android.view.View r0, boolean r1) {
                r0.setAccessibilityHeading(r1)
                return
        }

        /* renamed from: h */
        public static void m10654h(android.view.View r0, java.lang.CharSequence r1) {
                r0.setAccessibilityPaneTitle(r1)
                return
        }

        /* renamed from: i */
        public static void m10655i(android.view.View r0, boolean r1) {
                r0.setScreenReaderFocusable(r1)
                return
        }
    }

    /* renamed from: n0.t$m */
    public static class m {
        /* renamed from: a */
        public static android.view.View.AccessibilityDelegate m10656a(android.view.View r0) {
                android.view.View$AccessibilityDelegate r0 = r0.getAccessibilityDelegate()
                return r0
        }

        /* renamed from: b */
        public static java.util.List<android.graphics.Rect> m10657b(android.view.View r0) {
                java.util.List r0 = r0.getSystemGestureExclusionRects()
                return r0
        }

        /* renamed from: c */
        public static void m10658c(android.view.View r0, android.content.Context r1, int[] r2, android.util.AttributeSet r3, android.content.res.TypedArray r4, int r5, int r6) {
                r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
                return
        }

        /* renamed from: d */
        public static void m10659d(android.view.View r0, java.util.List<android.graphics.Rect> r1) {
                r0.setSystemGestureExclusionRects(r1)
                return
        }
    }

    /* renamed from: n0.t$n */
    public static class n {
        /* renamed from: a */
        public static java.lang.CharSequence m10660a(android.view.View r0) {
                java.lang.CharSequence r0 = r0.getStateDescription()
                return r0
        }

        /* renamed from: b */
        public static void m10661b(android.view.View r0, java.lang.CharSequence r1) {
                r0.setStateDescription(r1)
                return
        }
    }

    /* renamed from: n0.t$o */
    public static final class o {
        /* renamed from: a */
        public static java.lang.String[] m10662a(android.view.View r0) {
                java.lang.String[] r0 = r0.getReceiveContentMimeTypes()
                return r0
        }

        /* renamed from: b */
        public static p227n0.C4644c m10663b(android.view.View r1, p227n0.C4644c r2) {
                n0.c$e r0 = r2.f18538a
                android.view.ContentInfo r0 = r0.mo10498b()
                android.view.ContentInfo r1 = r1.performReceiveContent(r0)
                if (r1 != 0) goto Le
                r1 = 0
                return r1
            Le:
                if (r1 != r0) goto L11
                return r2
            L11:
                n0.c r2 = new n0.c
                n0.c$d r0 = new n0.c$d
                r0.<init>(r1)
                r2.<init>(r0)
                return r2
        }

        /* renamed from: c */
        public static void m10664c(android.view.View r1, java.lang.String[] r2, p227n0.InterfaceC4654m r3) {
                if (r3 != 0) goto L7
                r3 = 0
                r1.setOnReceiveContentListener(r2, r3)
                goto Lf
            L7:
                n0.t$p r0 = new n0.t$p
                r0.<init>(r3)
                r1.setOnReceiveContentListener(r2, r0)
            Lf:
                return
        }
    }

    /* renamed from: n0.t$p */
    public static final class p implements android.view.OnReceiveContentListener {

        /* renamed from: a */
        public final p227n0.InterfaceC4654m f18583a;

        public p(p227n0.InterfaceC4654m r1) {
                r0 = this;
                r0.<init>()
                r0.f18583a = r1
                return
        }

        @Override // android.view.OnReceiveContentListener
        public android.view.ContentInfo onReceiveContent(android.view.View r3, android.view.ContentInfo r4) {
                r2 = this;
                n0.c r0 = new n0.c
                n0.c$d r1 = new n0.c$d
                r1.<init>(r4)
                r0.<init>(r1)
                n0.m r1 = r2.f18583a
                n0.c r3 = r1.mo10518a(r3, r0)
                if (r3 != 0) goto L14
                r3 = 0
                return r3
            L14:
                if (r3 != r0) goto L17
                return r4
            L17:
                n0.c$e r3 = r3.f18538a
                android.view.ContentInfo r3 = r3.mo10498b()
                return r3
        }
    }

    /* renamed from: n0.t$q */
    public interface q {
        boolean onUnhandledKeyEvent(android.view.View r1, android.view.KeyEvent r2);
    }

    /* renamed from: n0.t$r */
    public static class r {

        /* renamed from: d */
        public static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> f18584d = null;

        /* renamed from: a */
        public java.util.WeakHashMap<android.view.View, java.lang.Boolean> f18585a;

        /* renamed from: b */
        public android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> f18586b;

        /* renamed from: c */
        public java.lang.ref.WeakReference<android.view.KeyEvent> f18587c;

        static {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                p227n0.C4661t.r.f18584d = r0
                return
        }

        public r() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f18585a = r0
                r1.f18586b = r0
                r1.f18587c = r0
                return
        }

        /* renamed from: a */
        public final android.view.View m10665a(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r4.f18585a
                r1 = 0
                if (r0 == 0) goto L30
                boolean r0 = r0.containsKey(r5)
                if (r0 != 0) goto Lc
                goto L30
            Lc:
                boolean r0 = r5 instanceof android.view.ViewGroup
                if (r0 == 0) goto L29
                r0 = r5
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                int r2 = r0.getChildCount()
                int r2 = r2 + (-1)
            L19:
                if (r2 < 0) goto L29
                android.view.View r3 = r0.getChildAt(r2)
                android.view.View r3 = r4.m10665a(r3, r6)
                if (r3 == 0) goto L26
                return r3
            L26:
                int r2 = r2 + (-1)
                goto L19
            L29:
                boolean r6 = r4.m10666b(r5, r6)
                if (r6 == 0) goto L30
                return r5
            L30:
                return r1
        }

        /* renamed from: b */
        public final boolean m10666b(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                r0 = 2131362664(0x7f0a0368, float:1.8345115E38)
                java.lang.Object r0 = r5.getTag(r0)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                if (r0 == 0) goto L23
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
            L11:
                if (r1 < 0) goto L23
                java.lang.Object r3 = r0.get(r1)
                n0.t$q r3 = (p227n0.C4661t.q) r3
                boolean r3 = r3.onUnhandledKeyEvent(r5, r6)
                if (r3 == 0) goto L20
                return r2
            L20:
                int r1 = r1 + (-1)
                goto L11
            L23:
                r5 = 0
                return r5
        }
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r0 = 0
            p227n0.C4661t.f18570a = r0
            r0 = 0
            p227n0.C4661t.f18572c = r0
            r0 = 32
            int[] r0 = new int[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [2131361813, 2131361814, 2131361825, 2131361836, 2131361839, 2131361840, 2131361841, 2131361842, 2131361843, 2131361844, 2131361815, 2131361816, 2131361817, 2131361818, 2131361819, 2131361820, 2131361821, 2131361822, 2131361823, 2131361824, 2131361826, 2131361827, 2131361828, 2131361829, 2131361830, 2131361831, 2131361832, 2131361833, 2131361834, 2131361835, 2131361837, 2131361838} // fill-array
            p227n0.C4661t.f18574e = r0
            n0.q r0 = p227n0.C4658q.f18569Y
            p227n0.C4661t.f18575f = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static void m10525a(android.view.View r1, p242o0.C4868b.a r2) {
            n0.a r0 = m10531g(r1)
            if (r0 != 0) goto Lb
            n0.a r0 = new n0.a
            r0.<init>()
        Lb:
            m10546v(r1, r0)
            int r0 = r2.m10999a()
            m10543s(r0, r1)
            java.util.List r0 = m10534j(r1)
            r0.add(r2)
            r2 = 0
            m10537m(r1, r2)
            return
    }

    /* renamed from: b */
    public static p227n0.C4664w m10526b(android.view.View r2) {
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p227n0.C4661t.f18570a = r0
        Lb:
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            java.lang.Object r0 = r0.get(r2)
            n0.w r0 = (p227n0.C4664w) r0
            if (r0 != 0) goto L1f
            n0.w r0 = new n0.w
            r0.<init>(r2)
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            r1.put(r2, r0)
        L1f:
            return r0
    }

    /* renamed from: c */
    public static void m10527c(android.view.View r1, int r2) {
            r1.offsetLeftAndRight(r2)
            int r2 = r1.getVisibility()
            if (r2 != 0) goto L23
            float r2 = r1.getTranslationY()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r2
            r1.setTranslationY(r0)
            r1.setTranslationY(r2)
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L23
            android.view.View r1 = (android.view.View) r1
            m10548x(r1)
        L23:
            return
    }

    /* renamed from: d */
    public static void m10528d(android.view.View r1, int r2) {
            r1.offsetTopAndBottom(r2)
            int r2 = r1.getVisibility()
            if (r2 != 0) goto L23
            float r2 = r1.getTranslationY()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r2
            r1.setTranslationY(r0)
            r1.setTranslationY(r2)
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L23
            android.view.View r1 = (android.view.View) r1
            m10548x(r1)
        L23:
            return
    }

    /* renamed from: e */
    public static p227n0.C4642a0 m10529e(android.view.View r2, p227n0.C4642a0 r3) {
            android.view.WindowInsets r0 = r3.m10470g()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = p227n0.C4661t.g.m10593a(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            n0.a0 r2 = p227n0.C4642a0.m10464i(r1, r2)
            return r2
        L15:
            return r3
    }

    /* renamed from: f */
    public static boolean m10530f(android.view.View r8, android.view.KeyEvent r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 28
            if (r0 < r2) goto L8
            return r1
        L8:
            java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = p227n0.C4661t.r.f18584d
            r0 = 2131362663(0x7f0a0367, float:1.8345113E38)
            java.lang.Object r2 = r8.getTag(r0)
            n0.t$r r2 = (p227n0.C4661t.r) r2
            if (r2 != 0) goto L1d
            n0.t$r r2 = new n0.t$r
            r2.<init>()
            r8.setTag(r0, r2)
        L1d:
            int r0 = r9.getAction()
            if (r0 != 0) goto L7e
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r2.f18585a
            if (r0 == 0) goto L2a
            r0.clear()
        L2a:
            java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = p227n0.C4661t.r.f18584d
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L33
            goto L7e
        L33:
            monitor-enter(r0)
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r2.f18585a     // Catch: java.lang.Throwable -> L7b
            if (r3 != 0) goto L3f
            java.util.WeakHashMap r3 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L7b
            r3.<init>()     // Catch: java.lang.Throwable -> L7b
            r2.f18585a = r3     // Catch: java.lang.Throwable -> L7b
        L3f:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L7b
        L43:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L79
            java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r4 = p227n0.C4661t.r.f18584d     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L7b
            android.view.View r5 = (android.view.View) r5     // Catch: java.lang.Throwable -> L7b
            if (r5 != 0) goto L5b
            r4.remove(r3)     // Catch: java.lang.Throwable -> L7b
            goto L43
        L5b:
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> r4 = r2.f18585a     // Catch: java.lang.Throwable -> L7b
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L7b
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L7b
            android.view.ViewParent r4 = r5.getParent()     // Catch: java.lang.Throwable -> L7b
        L66:
            boolean r5 = r4 instanceof android.view.View     // Catch: java.lang.Throwable -> L7b
            if (r5 == 0) goto L43
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> r5 = r2.f18585a     // Catch: java.lang.Throwable -> L7b
            r6 = r4
            android.view.View r6 = (android.view.View) r6     // Catch: java.lang.Throwable -> L7b
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L7b
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L7b
            android.view.ViewParent r4 = r4.getParent()     // Catch: java.lang.Throwable -> L7b
            goto L66
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            goto L7e
        L7b:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r8
        L7e:
            android.view.View r8 = r2.m10665a(r8, r9)
            int r0 = r9.getAction()
            if (r0 != 0) goto La9
            int r9 = r9.getKeyCode()
            if (r8 == 0) goto La9
            boolean r0 = android.view.KeyEvent.isModifierKey(r9)
            if (r0 != 0) goto La9
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r2.f18586b
            if (r0 != 0) goto L9f
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.f18586b = r0
        L9f:
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r2.f18586b
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r8)
            r0.put(r9, r2)
        La9:
            if (r8 == 0) goto Lac
            r1 = 1
        Lac:
            return r1
    }

    /* renamed from: g */
    public static p227n0.C4641a m10531g(android.view.View r1) {
            android.view.View$AccessibilityDelegate r1 = m10532h(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r0 = r1 instanceof p227n0.C4641a.a
            if (r0 == 0) goto L11
            n0.a$a r1 = (p227n0.C4641a.a) r1
            n0.a r1 = r1.f18504a
            return r1
        L11:
            n0.a r0 = new n0.a
            r0.<init>(r1)
            return r0
    }

    /* renamed from: h */
    public static android.view.View.AccessibilityDelegate m10532h(android.view.View r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            android.view.View$AccessibilityDelegate r4 = p227n0.C4661t.m.m10656a(r4)
            return r4
        Lb:
            boolean r0 = p227n0.C4661t.f18572c
            r1 = 0
            if (r0 == 0) goto L11
            goto L33
        L11:
            java.lang.reflect.Field r0 = p227n0.C4661t.f18571b
            r2 = 1
            if (r0 != 0) goto L23
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r3 = "mAccessibilityDelegate"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L31
            p227n0.C4661t.f18571b = r0     // Catch: java.lang.Throwable -> L31
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L31
        L23:
            java.lang.reflect.Field r0 = p227n0.C4661t.f18571b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L31
            boolean r0 = r4 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L33
            android.view.View$AccessibilityDelegate r4 = (android.view.View.AccessibilityDelegate) r4     // Catch: java.lang.Throwable -> L31
            r1 = r4
            goto L33
        L31:
            p227n0.C4661t.f18572c = r2
        L33:
            return r1
    }

    /* renamed from: i */
    public static java.lang.CharSequence m10533i(android.view.View r4) {
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            r1 = 2131362656(0x7f0a0360, float:1.8345099E38)
            r2 = 28
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L15
            java.lang.CharSequence r4 = p227n0.C4661t.l.m10648b(r4)
            goto L21
        L15:
            java.lang.Object r4 = r4.getTag(r1)
            boolean r0 = r0.isInstance(r4)
            if (r0 == 0) goto L20
            goto L21
        L20:
            r4 = 0
        L21:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            return r4
    }

    /* renamed from: j */
    public static java.util.List<p242o0.C4868b.a> m10534j(android.view.View r2) {
            r0 = 2131362653(0x7f0a035d, float:1.8345093E38)
            java.lang.Object r1 = r2.getTag(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 != 0) goto L13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.setTag(r0, r1)
        L13:
            return r1
    }

    /* renamed from: k */
    public static android.graphics.Rect m10535k() {
            java.lang.ThreadLocal<android.graphics.Rect> r0 = p227n0.C4661t.f18573d
            if (r0 != 0) goto Lb
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p227n0.C4661t.f18573d = r0
        Lb:
            java.lang.ThreadLocal<android.graphics.Rect> r0 = p227n0.C4661t.f18573d
            java.lang.Object r0 = r0.get()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto L1f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.ThreadLocal<android.graphics.Rect> r1 = p227n0.C4661t.f18573d
            r1.set(r0)
        L1f:
            r0.setEmpty()
            return r0
    }

    /* renamed from: l */
    public static java.lang.String[] m10536l(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            java.lang.String[] r2 = p227n0.C4661t.o.m10662a(r2)
            return r2
        Lb:
            r0 = 2131362659(0x7f0a0363, float:1.8345105E38)
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    /* renamed from: m */
    public static void m10537m(android.view.View r5, int r6) {
            android.content.Context r0 = r5.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L13
            return
        L13:
            java.lang.CharSequence r1 = m10533i(r5)
            r2 = 1
            if (r1 == 0) goto L22
            int r1 = r5.getVisibility()
            if (r1 != 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            int r3 = p227n0.C4661t.f.m10586a(r5)
            r4 = 32
            if (r3 != 0) goto L85
            if (r1 == 0) goto L2e
            goto L85
        L2e:
            if (r6 != r4) goto L53
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r5.onInitializeAccessibilityEvent(r1)
            r1.setEventType(r4)
            p227n0.C4661t.f.m10592g(r1, r6)
            r1.setSource(r5)
            r5.onPopulateAccessibilityEvent(r1)
            java.util.List r6 = r1.getText()
            java.lang.CharSequence r5 = m10533i(r5)
            r6.add(r5)
            r0.sendAccessibilityEvent(r1)
            goto Lc9
        L53:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto Lc9
            android.view.ViewParent r0 = r5.getParent()
            p227n0.C4661t.f.m10590e(r0, r5, r5, r6)     // Catch: java.lang.AbstractMethodError -> L61
            goto Lc9
        L61:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.view.ViewParent r5 = r5.getParent()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r0.append(r5)
            java.lang.String r5 = " does not fully implement ViewParent"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r5, r6)
            goto Lc9
        L85:
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r1 == 0) goto L8c
            goto L8e
        L8c:
            r4 = 2048(0x800, float:2.87E-42)
        L8e:
            r0.setEventType(r4)
            p227n0.C4661t.f.m10592g(r0, r6)
            if (r1 == 0) goto Lc6
            java.util.List r6 = r0.getText()
            java.lang.CharSequence r1 = m10533i(r5)
            r6.add(r1)
            int r6 = p227n0.C4661t.c.m10555c(r5)
            if (r6 != 0) goto Laa
            p227n0.C4661t.c.m10571s(r5, r2)
        Laa:
            android.view.ViewParent r6 = r5.getParent()
        Lae:
            boolean r1 = r6 instanceof android.view.View
            if (r1 == 0) goto Lc6
            r1 = r6
            android.view.View r1 = (android.view.View) r1
            int r1 = p227n0.C4661t.c.m10555c(r1)
            r2 = 4
            if (r1 != r2) goto Lc1
            r6 = 2
            p227n0.C4661t.c.m10571s(r5, r6)
            goto Lc6
        Lc1:
            android.view.ViewParent r6 = r6.getParent()
            goto Lae
        Lc6:
            r5.sendAccessibilityEventUnchecked(r0)
        Lc9:
            return
    }

    /* renamed from: n */
    public static void m10538n(android.view.View r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r6.offsetLeftAndRight(r7)
            goto L63
        La:
            android.graphics.Rect r0 = m10535k()
            r1 = 0
            android.view.ViewParent r2 = r6.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L43
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r1 = r1.getBottom()
            r0.set(r3, r4, r5, r1)
            int r1 = r6.getLeft()
            int r3 = r6.getTop()
            int r4 = r6.getRight()
            int r5 = r6.getBottom()
            boolean r1 = r0.intersects(r1, r3, r4, r5)
            r1 = r1 ^ 1
        L43:
            m10527c(r6, r7)
            if (r1 == 0) goto L63
            int r7 = r6.getLeft()
            int r1 = r6.getTop()
            int r3 = r6.getRight()
            int r6 = r6.getBottom()
            boolean r6 = r0.intersect(r7, r1, r3, r6)
            if (r6 == 0) goto L63
            android.view.View r2 = (android.view.View) r2
            r2.invalidate(r0)
        L63:
            return
    }

    /* renamed from: o */
    public static void m10539o(android.view.View r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r6.offsetTopAndBottom(r7)
            goto L63
        La:
            android.graphics.Rect r0 = m10535k()
            r1 = 0
            android.view.ViewParent r2 = r6.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L43
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r1 = r1.getBottom()
            r0.set(r3, r4, r5, r1)
            int r1 = r6.getLeft()
            int r3 = r6.getTop()
            int r4 = r6.getRight()
            int r5 = r6.getBottom()
            boolean r1 = r0.intersects(r1, r3, r4, r5)
            r1 = r1 ^ 1
        L43:
            m10528d(r6, r7)
            if (r1 == 0) goto L63
            int r7 = r6.getLeft()
            int r1 = r6.getTop()
            int r3 = r6.getRight()
            int r6 = r6.getBottom()
            boolean r6 = r0.intersect(r7, r1, r3, r6)
            if (r6 == 0) goto L63
            android.view.View r2 = (android.view.View) r2
            r2.invalidate(r0)
        L63:
            return
    }

    /* renamed from: p */
    public static p227n0.C4642a0 m10540p(android.view.View r2, p227n0.C4642a0 r3) {
            android.view.WindowInsets r0 = r3.m10470g()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = p227n0.C4661t.g.m10594b(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            n0.a0 r2 = p227n0.C4642a0.m10464i(r1, r2)
            return r2
        L15:
            return r3
    }

    /* renamed from: q */
    public static p227n0.C4644c m10541q(android.view.View r3, p227n0.C4644c r4) {
            java.lang.String r0 = "ViewCompat"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "performReceiveContent: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", view="
            r1.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = "["
            r1.append(r2)
            int r2 = r3.getId()
            r1.append(r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L3e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L49
            n0.c r3 = p227n0.C4661t.o.m10663b(r3, r4)
            return r3
        L49:
            r0 = 2131362658(0x7f0a0362, float:1.8345103E38)
            java.lang.Object r0 = r3.getTag(r0)
            n0.m r0 = (p227n0.InterfaceC4654m) r0
            if (r0 == 0) goto L6a
            n0.c r4 = r0.mo10518a(r3, r4)
            if (r4 != 0) goto L5c
            r3 = 0
            goto L69
        L5c:
            boolean r0 = r3 instanceof p227n0.InterfaceC4655n
            if (r0 == 0) goto L63
            n0.n r3 = (p227n0.InterfaceC4655n) r3
            goto L65
        L63:
            n0.n r3 = p227n0.C4661t.f18575f
        L65:
            n0.c r3 = r3.mo753a(r4)
        L69:
            return r3
        L6a:
            boolean r0 = r3 instanceof p227n0.InterfaceC4655n
            if (r0 == 0) goto L71
            n0.n r3 = (p227n0.InterfaceC4655n) r3
            goto L73
        L71:
            n0.n r3 = p227n0.C4661t.f18575f
        L73:
            n0.c r3 = r3.mo753a(r4)
            return r3
    }

    /* renamed from: r */
    public static void m10542r(android.view.View r0, int r1) {
            m10543s(r1, r0)
            r1 = 0
            m10537m(r0, r1)
            return
    }

    /* renamed from: s */
    public static void m10543s(int r2, android.view.View r3) {
            java.util.List r3 = m10534j(r3)
            r0 = 0
        L5:
            int r1 = r3.size()
            if (r0 >= r1) goto L1e
            java.lang.Object r1 = r3.get(r0)
            o0.b$a r1 = (p242o0.C4868b.a) r1
            int r1 = r1.m10999a()
            if (r1 != r2) goto L1b
            r3.remove(r0)
            goto L1e
        L1b:
            int r0 = r0 + 1
            goto L5
        L1e:
            return
    }

    /* renamed from: t */
    public static void m10544t(android.view.View r6, p242o0.C4868b.a r7, java.lang.CharSequence r8, p242o0.InterfaceC4870d r9) {
            if (r9 != 0) goto Le
            int r7 = r7.m10999a()
            m10543s(r7, r6)
            r7 = 0
            m10537m(r6, r7)
            goto L1e
        Le:
            o0.b$a r8 = new o0.b$a
            int r2 = r7.f19349b
            java.lang.Class<? extends o0.d$a> r5 = r7.f19350c
            r1 = 0
            r3 = 0
            r0 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            m10525a(r6, r8)
        L1e:
            return
    }

    /* renamed from: u */
    public static void m10545u(android.view.View r2, @android.annotation.SuppressLint({"ContextFirst"}) android.content.Context r3, int[] r4, android.util.AttributeSet r5, android.content.res.TypedArray r6, int r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            p227n0.C4661t.m.m10658c(r2, r3, r4, r5, r6, r7, r8)
        L9:
            return
    }

    /* renamed from: v */
    public static void m10546v(android.view.View r1, p227n0.C4641a r2) {
            if (r2 != 0) goto Lf
            android.view.View$AccessibilityDelegate r0 = m10532h(r1)
            boolean r0 = r0 instanceof p227n0.C4641a.a
            if (r0 == 0) goto Lf
            n0.a r2 = new n0.a
            r2.<init>()
        Lf:
            if (r2 != 0) goto L13
            r2 = 0
            goto L15
        L13:
            android.view.View$AccessibilityDelegate r2 = r2.f18503b
        L15:
            r1.setAccessibilityDelegate(r2)
            return
    }

    /* renamed from: w */
    public static void m10547w(android.view.View r2, p227n0.C4657p r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L11
            if (r3 == 0) goto Lb
            java.lang.Object r3 = r3.f18568a
            goto Lc
        Lb:
            r3 = 0
        Lc:
            android.view.PointerIcon r3 = (android.view.PointerIcon) r3
            p227n0.C4661t.j.m10629d(r2, r3)
        L11:
            return
    }

    /* renamed from: x */
    public static void m10548x(android.view.View r2) {
            float r0 = r2.getTranslationY()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r2.setTranslationY(r1)
            r2.setTranslationY(r0)
            return
    }
}
