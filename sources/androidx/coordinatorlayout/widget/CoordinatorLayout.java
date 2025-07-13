package androidx.coordinatorlayout.widget;

/* loaded from: classes.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements p227n0.InterfaceC4650i, p227n0.InterfaceC4651j {

    /* renamed from: t0 */
    public static final java.lang.String f1904t0 = null;

    /* renamed from: u0 */
    public static final java.lang.Class<?>[] f1905u0 = null;

    /* renamed from: v0 */
    public static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c>>> f1906v0 = null;

    /* renamed from: w0 */
    public static final java.util.Comparator<android.view.View> f1907w0 = null;

    /* renamed from: x0 */
    public static final p212m0.InterfaceC4313c<android.graphics.Rect> f1908x0 = null;

    /* renamed from: a0 */
    public final java.util.List<android.view.View> f1909a0;

    /* renamed from: b0 */
    public final p365v.C6476c f1910b0;

    /* renamed from: c0 */
    public final java.util.List<android.view.View> f1911c0;

    /* renamed from: d0 */
    public final java.util.List<android.view.View> f1912d0;

    /* renamed from: e0 */
    public final int[] f1913e0;

    /* renamed from: f0 */
    public final int[] f1914f0;

    /* renamed from: g0 */
    public boolean f1915g0;

    /* renamed from: h0 */
    public boolean f1916h0;

    /* renamed from: i0 */
    public int[] f1917i0;

    /* renamed from: j0 */
    public android.view.View f1918j0;

    /* renamed from: k0 */
    public android.view.View f1919k0;

    /* renamed from: l0 */
    public androidx.coordinatorlayout.widget.CoordinatorLayout.ViewTreeObserverOnPreDrawListenerC0342g f1920l0;

    /* renamed from: m0 */
    public boolean f1921m0;

    /* renamed from: n0 */
    public p227n0.C4642a0 f1922n0;

    /* renamed from: o0 */
    public boolean f1923o0;

    /* renamed from: p0 */
    public android.graphics.drawable.Drawable f1924p0;

    /* renamed from: q0 */
    public android.view.ViewGroup.OnHierarchyChangeListener f1925q0;

    /* renamed from: r0 */
    public p227n0.InterfaceC4653l f1926r0;

    /* renamed from: s0 */
    public final p227n0.C4652k f1927s0;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0336a implements p227n0.InterfaceC4653l {

        /* renamed from: a */
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f1928a;

        public C0336a(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.f1928a = r1
                r0.<init>()
                return
        }

        @Override // p227n0.InterfaceC4653l
        /* renamed from: a */
        public p227n0.C4642a0 mo984a(android.view.View r5, p227n0.C4642a0 r6) {
                r4 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r5 = r4.f1928a
                n0.a0 r0 = r5.f1922n0
                boolean r0 = java.util.Objects.equals(r0, r6)
                if (r0 != 0) goto L56
                r5.f1922n0 = r6
                int r0 = r6.m10468d()
                r1 = 1
                r2 = 0
                if (r0 <= 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                r5.f1923o0 = r0
                if (r0 != 0) goto L22
                android.graphics.drawable.Drawable r0 = r5.getBackground()
                if (r0 != 0) goto L22
                goto L23
            L22:
                r1 = 0
            L23:
                r5.setWillNotDraw(r1)
                boolean r0 = r6.m10469f()
                if (r0 == 0) goto L2d
                goto L53
            L2d:
                int r0 = r5.getChildCount()
            L31:
                if (r2 >= r0) goto L53
                android.view.View r1 = r5.getChildAt(r2)
                java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
                boolean r3 = p227n0.C4661t.c.m10554b(r1)
                if (r3 == 0) goto L50
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.f1930a
                if (r1 == 0) goto L50
                boolean r1 = r6.m10469f()
                if (r1 == 0) goto L50
                goto L53
            L50:
                int r2 = r2 + 1
                goto L31
            L53:
                r5.requestLayout()
            L56:
                return r6
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0337b {
        androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0338c<V extends android.view.View> {
        public AbstractC0338c() {
                r0 = this;
                r0.<init>()
                return
        }

        public AbstractC0338c(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public boolean mo985a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.graphics.Rect r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: b */
        public boolean mo986b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: c */
        public void mo987c(androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f r1) {
                r0 = this;
                return
        }

        /* renamed from: d */
        public boolean mo988d(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: e */
        public void mo989e(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3) {
                r0 = this;
                return
        }

        /* renamed from: f */
        public void mo990f() {
                r0 = this;
                return
        }

        /* renamed from: g */
        public boolean mo991g(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: h */
        public boolean mo992h(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: i */
        public boolean mo993i(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: j */
        public boolean mo994j(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, float r4, float r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: k */
        public void mo995k(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int[] r6, int r7) {
                r0 = this;
                return
        }

        /* renamed from: l */
        public void mo996l(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8, int[] r9) {
                r0 = this;
                r1 = 0
                r2 = r9[r1]
                int r2 = r2 + r6
                r9[r1] = r2
                r1 = 1
                r2 = r9[r1]
                int r2 = r2 + r7
                r9[r1] = r2
                return
        }

        /* renamed from: m */
        public boolean mo997m(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.graphics.Rect r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: n */
        public void mo998n(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.os.Parcelable r3) {
                r0 = this;
                return
        }

        /* renamed from: o */
        public android.os.Parcelable mo999o(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2) {
                r0 = this;
                android.view.AbsSavedState r1 = android.view.View.BaseSavedState.EMPTY_STATE
                return r1
        }

        /* renamed from: p */
        public boolean mo1000p(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: q */
        public void mo1001q(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4) {
                r0 = this;
                return
        }

        /* renamed from: r */
        public boolean mo1002r(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface InterfaceC0339d {
        java.lang.Class<? extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class ViewGroupOnHierarchyChangeListenerC0340e implements android.view.ViewGroup.OnHierarchyChangeListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f1929Y;

        public ViewGroupOnHierarchyChangeListenerC0340e(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.f1929Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r2, android.view.View r3) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.f1929Y
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.f1925q0
                if (r0 == 0) goto L9
                r0.onChildViewAdded(r2, r3)
            L9:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r3, android.view.View r4) {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.f1929Y
                r1 = 2
                r0.m975q(r1)
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.f1929Y
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.f1925q0
                if (r0 == 0) goto Lf
                r0.onChildViewRemoved(r3, r4)
            Lf:
                return
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0341f extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c f1930a;

        /* renamed from: b */
        public boolean f1931b;

        /* renamed from: c */
        public int f1932c;

        /* renamed from: d */
        public int f1933d;

        /* renamed from: e */
        public int f1934e;

        /* renamed from: f */
        public int f1935f;

        /* renamed from: g */
        public int f1936g;

        /* renamed from: h */
        public int f1937h;

        /* renamed from: i */
        public int f1938i;

        /* renamed from: j */
        public int f1939j;

        /* renamed from: k */
        public android.view.View f1940k;

        /* renamed from: l */
        public android.view.View f1941l;

        /* renamed from: m */
        public boolean f1942m;

        /* renamed from: n */
        public boolean f1943n;

        /* renamed from: o */
        public boolean f1944o;

        /* renamed from: p */
        public boolean f1945p;

        /* renamed from: q */
        public final android.graphics.Rect f1946q;

        public C0341f(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f1931b = r1
                r0.f1932c = r1
                r0.f1933d = r1
                r2 = -1
                r0.f1934e = r2
                r0.f1935f = r2
                r0.f1936g = r1
                r0.f1937h = r1
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f1946q = r1
                return
        }

        public C0341f(android.content.Context r9, android.util.AttributeSet r10) {
                r8 = this;
                r8.<init>(r9, r10)
                r0 = 0
                r8.f1931b = r0
                r8.f1932c = r0
                r8.f1933d = r0
                r1 = -1
                r8.f1934e = r1
                r8.f1935f = r1
                r8.f1936g = r0
                r8.f1937h = r0
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r8.f1946q = r2
                int[] r2 = p442z.C7222a.f27794b
                android.content.res.TypedArray r2 = r9.obtainStyledAttributes(r10, r2)
                int r3 = r2.getInteger(r0, r0)
                r8.f1932c = r3
                r3 = 1
                int r4 = r2.getResourceId(r3, r1)
                r8.f1935f = r4
                r4 = 2
                int r5 = r2.getInteger(r4, r0)
                r8.f1933d = r5
                r5 = 6
                int r1 = r2.getInteger(r5, r1)
                r8.f1934e = r1
                r1 = 5
                int r1 = r2.getInt(r1, r0)
                r8.f1936g = r1
                r1 = 4
                int r1 = r2.getInt(r1, r0)
                r8.f1937h = r1
                r1 = 3
                boolean r5 = r2.hasValue(r1)
                r8.f1931b = r5
                if (r5 == 0) goto Lea
                java.lang.String r1 = r2.getString(r1)
                java.lang.String r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1904t0
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 == 0) goto L61
                r9 = 0
                goto Lda
            L61:
                java.lang.String r5 = "."
                boolean r5 = r1.startsWith(r5)
                if (r5 == 0) goto L7d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = r9.getPackageName()
                r5.append(r6)
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                goto La0
            L7d:
                r5 = 46
                int r6 = r1.indexOf(r5)
                if (r6 < 0) goto L86
                goto La0
            L86:
                java.lang.String r6 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1904t0
                boolean r7 = android.text.TextUtils.isEmpty(r6)
                if (r7 != 0) goto La0
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r6)
                r7.append(r5)
                r7.append(r1)
                java.lang.String r1 = r7.toString()
            La0:
                java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$c>>> r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1906v0     // Catch: java.lang.Exception -> Ldd
                java.lang.Object r6 = r5.get()     // Catch: java.lang.Exception -> Ldd
                java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> Ldd
                if (r6 != 0) goto Lb2
                java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Exception -> Ldd
                r6.<init>()     // Catch: java.lang.Exception -> Ldd
                r5.set(r6)     // Catch: java.lang.Exception -> Ldd
            Lb2:
                java.lang.Object r5 = r6.get(r1)     // Catch: java.lang.Exception -> Ldd
                java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5     // Catch: java.lang.Exception -> Ldd
                if (r5 != 0) goto Lce
                java.lang.ClassLoader r5 = r9.getClassLoader()     // Catch: java.lang.Exception -> Ldd
                java.lang.Class r5 = java.lang.Class.forName(r1, r0, r5)     // Catch: java.lang.Exception -> Ldd
                java.lang.Class<?>[] r7 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1905u0     // Catch: java.lang.Exception -> Ldd
                java.lang.reflect.Constructor r5 = r5.getConstructor(r7)     // Catch: java.lang.Exception -> Ldd
                r5.setAccessible(r3)     // Catch: java.lang.Exception -> Ldd
                r6.put(r1, r5)     // Catch: java.lang.Exception -> Ldd
            Lce:
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Ldd
                r4[r0] = r9     // Catch: java.lang.Exception -> Ldd
                r4[r3] = r10     // Catch: java.lang.Exception -> Ldd
                java.lang.Object r9 = r5.newInstance(r4)     // Catch: java.lang.Exception -> Ldd
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c) r9     // Catch: java.lang.Exception -> Ldd
            Lda:
                r8.f1930a = r9
                goto Lea
            Ldd:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                java.lang.String r0 = "Could not inflate Behavior subclass "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
                r10.<init>(r0, r9)
                throw r10
            Lea:
                r2.recycle()
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r9 = r8.f1930a
                if (r9 == 0) goto Lf4
                r9.mo987c(r8)
            Lf4:
                return
        }

        public C0341f(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.f1931b = r2
                r1.f1932c = r2
                r1.f1933d = r2
                r0 = -1
                r1.f1934e = r0
                r1.f1935f = r0
                r1.f1936g = r2
                r1.f1937h = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.f1946q = r2
                return
        }

        public C0341f(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.f1931b = r2
                r1.f1932c = r2
                r1.f1933d = r2
                r0 = -1
                r1.f1934e = r0
                r1.f1935f = r0
                r1.f1936g = r2
                r1.f1937h = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.f1946q = r2
                return
        }

        public C0341f(androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.f1931b = r2
                r1.f1932c = r2
                r1.f1933d = r2
                r0 = -1
                r1.f1934e = r0
                r1.f1935f = r0
                r1.f1936g = r2
                r1.f1937h = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.f1946q = r2
                return
        }

        /* renamed from: a */
        public boolean m1003a(int r2) {
                r1 = this;
                if (r2 == 0) goto La
                r0 = 1
                if (r2 == r0) goto L7
                r2 = 0
                return r2
            L7:
                boolean r2 = r1.f1944o
                return r2
            La:
                boolean r2 = r1.f1943n
                return r2
        }

        /* renamed from: b */
        public void m1004b(int r2, boolean r3) {
                r1 = this;
                if (r2 == 0) goto L9
                r0 = 1
                if (r2 == r0) goto L6
                goto Lb
            L6:
                r1.f1944o = r3
                goto Lb
            L9:
                r1.f1943n = r3
            Lb:
                return
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class ViewTreeObserverOnPreDrawListenerC0342g implements android.view.ViewTreeObserver.OnPreDrawListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f1947Y;

        public ViewTreeObserverOnPreDrawListenerC0342g(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.f1947Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.f1947Y
                r1 = 0
                r0.m975q(r1)
                r0 = 1
                return r0
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0343h extends p320s0.AbstractC5943a {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.C0343h> CREATOR = null;

        /* renamed from: a0 */
        public android.util.SparseArray<android.os.Parcelable> f1948a0;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class a implements android.os.Parcelable.ClassLoaderCreator<androidx.coordinatorlayout.widget.CoordinatorLayout.C0343h> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.coordinatorlayout.widget.CoordinatorLayout.C0343h createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h[] r1 = new androidx.coordinatorlayout.widget.CoordinatorLayout.C0343h[r1]
                    return r1
            }
        }

        static {
                androidx.coordinatorlayout.widget.CoordinatorLayout$h$a r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h$a
                r0.<init>()
                androidx.coordinatorlayout.widget.CoordinatorLayout.C0343h.CREATOR = r0
                return
        }

        public C0343h(android.os.Parcel r6, java.lang.ClassLoader r7) {
                r5 = this;
                r5.<init>(r6, r7)
                int r0 = r6.readInt()
                int[] r1 = new int[r0]
                r6.readIntArray(r1)
                android.os.Parcelable[] r6 = r6.readParcelableArray(r7)
                android.util.SparseArray r7 = new android.util.SparseArray
                r7.<init>(r0)
                r5.f1948a0 = r7
                r7 = 0
            L18:
                if (r7 >= r0) goto L26
                android.util.SparseArray<android.os.Parcelable> r2 = r5.f1948a0
                r3 = r1[r7]
                r4 = r6[r7]
                r2.append(r3, r4)
                int r7 = r7 + 1
                goto L18
            L26:
                return
        }

        public C0343h(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p320s0.AbstractC5943a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r6, int r7) {
                r5 = this;
                android.os.Parcelable r0 = r5.f22819Y
                r6.writeParcelable(r0, r7)
                android.util.SparseArray<android.os.Parcelable> r0 = r5.f1948a0
                r1 = 0
                if (r0 == 0) goto Lf
                int r0 = r0.size()
                goto L10
            Lf:
                r0 = 0
            L10:
                r6.writeInt(r0)
                int[] r2 = new int[r0]
                android.os.Parcelable[] r3 = new android.os.Parcelable[r0]
            L17:
                if (r1 >= r0) goto L2e
                android.util.SparseArray<android.os.Parcelable> r4 = r5.f1948a0
                int r4 = r4.keyAt(r1)
                r2[r1] = r4
                android.util.SparseArray<android.os.Parcelable> r4 = r5.f1948a0
                java.lang.Object r4 = r4.valueAt(r1)
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r3[r1] = r4
                int r1 = r1 + 1
                goto L17
            L2e:
                r6.writeIntArray(r2)
                r6.writeParcelableArray(r3, r7)
                return
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0344i implements java.util.Comparator<android.view.View> {
        public C0344i() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(android.view.View r2, android.view.View r3) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                android.view.View r3 = (android.view.View) r3
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                float r2 = p227n0.C4661t.h.m10608m(r2)
                float r3 = p227n0.C4661t.h.m10608m(r3)
                int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r0 <= 0) goto L14
                r2 = -1
                goto L1b
            L14:
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 >= 0) goto L1a
                r2 = 1
                goto L1b
            L1a:
                r2 = 0
            L1b:
                return r2
        }
    }

    static {
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.getName()
            goto Le
        Ld:
            r0 = 0
        Le:
            androidx.coordinatorlayout.widget.CoordinatorLayout.f1904t0 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.f1907w0 = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            androidx.coordinatorlayout.widget.CoordinatorLayout.f1905u0 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.f1906v0 = r0
            m0.d r0 = new m0.d
            r1 = 12
            r0.<init>(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout.f1908x0 = r0
            return
    }

    public CoordinatorLayout(android.content.Context r11, android.util.AttributeSet r12) {
            r10 = this;
            r0 = 2130968866(0x7f040122, float:1.7546398E38)
            r10.<init>(r11, r12, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.f1909a0 = r1
            v.c r1 = new v.c
            r2 = 1
            r1.<init>(r2)
            r10.f1910b0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.f1911c0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.f1912d0 = r1
            r1 = 2
            int[] r3 = new int[r1]
            r10.f1913e0 = r3
            int[] r1 = new int[r1]
            r10.f1914f0 = r1
            n0.k r1 = new n0.k
            r1.<init>()
            r10.f1927s0 = r1
            r1 = 0
            int[] r5 = p442z.C7222a.f27793a
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r5, r0, r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L4b
            r9 = 0
            r8 = 2130968866(0x7f040122, float:1.7546398E38)
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r0
            r3.saveAttributeDataForStyleable(r4, r5, r6, r7, r8, r9)
        L4b:
            int r12 = r0.getResourceId(r1, r1)
            if (r12 == 0) goto L73
            android.content.res.Resources r11 = r11.getResources()
            int[] r12 = r11.getIntArray(r12)
            r10.f1917i0 = r12
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            int[] r12 = r10.f1917i0
            int r12 = r12.length
        L64:
            if (r1 >= r12) goto L73
            int[] r3 = r10.f1917i0
            r4 = r3[r1]
            float r4 = (float) r4
            float r4 = r4 * r11
            int r4 = (int) r4
            r3[r1] = r4
            int r1 = r1 + 1
            goto L64
        L73:
            android.graphics.drawable.Drawable r11 = r0.getDrawable(r2)
            r10.f1924p0 = r11
            r0.recycle()
            r10.m983y()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r11 = new androidx.coordinatorlayout.widget.CoordinatorLayout$e
            r11.<init>(r10)
            super.setOnHierarchyChangeListener(r11)
            java.util.WeakHashMap<android.view.View, n0.w> r11 = p227n0.C4661t.f18570a
            int r11 = p227n0.C4661t.c.m10555c(r10)
            if (r11 != 0) goto L92
            p227n0.C4661t.c.m10571s(r10, r2)
        L92:
            return
    }

    /* renamed from: a */
    public static android.graphics.Rect m965a() {
            m0.c<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1908x0
            m0.d r0 = (p212m0.C4314d) r0
            java.lang.Object r0 = r0.mo6231b()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto L11
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
        L11:
            return r0
    }

    /* renamed from: b */
    public final void m966b(androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f r6, android.graphics.Rect r7, int r8, int r9) {
            r5 = this;
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingLeft()
            int r3 = r6.leftMargin
            int r2 = r2 + r3
            int r3 = r7.left
            int r4 = r5.getPaddingRight()
            int r0 = r0 - r4
            int r0 = r0 - r8
            int r4 = r6.rightMargin
            int r0 = r0 - r4
            int r0 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r5.getPaddingTop()
            int r3 = r6.topMargin
            int r2 = r2 + r3
            int r3 = r7.top
            int r4 = r5.getPaddingBottom()
            int r1 = r1 - r4
            int r1 = r1 - r9
            int r6 = r6.bottomMargin
            int r1 = r1 - r6
            int r6 = java.lang.Math.min(r3, r1)
            int r6 = java.lang.Math.max(r2, r6)
            int r8 = r8 + r0
            int r9 = r9 + r6
            r7.set(r0, r6, r8, r9)
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: c */
    public void mo554c(android.view.View r2, android.view.View r3, int r4, int r5) {
            r1 = this;
            n0.k r2 = r1.f1927s0
            r0 = 1
            if (r5 != r0) goto L8
            r2.f18564b = r4
            goto La
        L8:
            r2.f18563a = r4
        La:
            r1.f1919k0 = r3
            int r2 = r1.getChildCount()
            r3 = 0
        L11:
            if (r3 >= r2) goto L24
            android.view.View r4 = r1.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r4
            boolean r4 = r4.m1003a(r5)
            int r3 = r3 + 1
            goto L11
        L24:
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f
            if (r0 == 0) goto Lc
            boolean r2 = super.checkLayoutParams(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* renamed from: d */
    public void m967d(android.view.View r3, boolean r4, android.graphics.Rect r5) {
            r2 = this;
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L29
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lf
            goto L29
        Lf:
            if (r4 == 0) goto L15
            r2.m970g(r3, r5)
            goto L28
        L15:
            int r4 = r3.getLeft()
            int r0 = r3.getTop()
            int r1 = r3.getRight()
            int r3 = r3.getBottom()
            r5.set(r4, r0, r1, r3)
        L28:
            return
        L29:
            r5.setEmpty()
            return
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas r2, android.view.View r3, long r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.f1930a
            if (r0 == 0) goto Ld
            java.util.Objects.requireNonNull(r0)
        Ld:
            boolean r2 = super.drawChild(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            android.graphics.drawable.Drawable r1 = r4.f1924p0
            r2 = 0
            if (r1 == 0) goto L17
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L17
            boolean r0 = r1.setState(r0)
            r2 = r2 | r0
        L17:
            if (r2 == 0) goto L1c
            r4.invalidate()
        L1c:
            return
    }

    /* renamed from: e */
    public java.util.List<android.view.View> m968e(android.view.View r6) {
            r5 = this;
            v.c r0 = r5.f1910b0
            v.e r1 = r0.f25076Z
            s.h r1 = (p319s.C5941h) r1
            int r1 = r1.f22812a0
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L33
            v.e r4 = r0.f25076Z
            s.h r4 = (p319s.C5941h) r4
            java.lang.Object r4 = r4.m12344l(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L30
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L30
            if (r2 != 0) goto L25
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L25:
            v.e r4 = r0.f25076Z
            s.h r4 = (p319s.C5941h) r4
            java.lang.Object r4 = r4.m12343h(r3)
            r2.add(r4)
        L30:
            int r3 = r3 + 1
            goto La
        L33:
            java.util.List<android.view.View> r6 = r5.f1912d0
            r6.clear()
            if (r2 == 0) goto L3f
            java.util.List<android.view.View> r6 = r5.f1912d0
            r6.addAll(r2)
        L3f:
            java.util.List<android.view.View> r6 = r5.f1912d0
            return r6
    }

    /* renamed from: f */
    public java.util.List<android.view.View> m969f(android.view.View r3) {
            r2 = this;
            v.c r0 = r2.f1910b0
            v.e r0 = r0.f25076Z
            s.h r0 = (p319s.C5941h) r0
            r1 = 0
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            java.util.List r3 = (java.util.List) r3
            java.util.List<android.view.View> r0 = r2.f1912d0
            r0.clear()
            if (r3 == 0) goto L19
            java.util.List<android.view.View> r0 = r2.f1912d0
            r0.addAll(r3)
        L19:
            java.util.List<android.view.View> r3 = r2.f1912d0
            return r3
    }

    /* renamed from: g */
    public void m970g(android.view.View r5, android.graphics.Rect r6) {
            r4 = this;
            java.lang.ThreadLocal<android.graphics.Matrix> r0 = p001a0.C0001a.f2a
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            r2 = 0
            r6.set(r2, r2, r0, r1)
            java.lang.ThreadLocal<android.graphics.Matrix> r0 = p001a0.C0001a.f2a
            java.lang.Object r1 = r0.get()
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L21
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.set(r1)
            goto L24
        L21:
            r1.reset()
        L24:
            p001a0.C0001a.m1a(r4, r5, r1)
            java.lang.ThreadLocal<android.graphics.RectF> r5 = p001a0.C0001a.f3b
            java.lang.Object r0 = r5.get()
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            if (r0 != 0) goto L39
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.set(r0)
        L39:
            r0.set(r6)
            r1.mapRect(r0)
            float r5 = r0.left
            r1 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r1
            int r5 = (int) r5
            float r2 = r0.top
            float r2 = r2 + r1
            int r2 = (int) r2
            float r3 = r0.right
            float r3 = r3 + r1
            int r3 = (int) r3
            float r0 = r0.bottom
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.set(r5, r2, r3, r0)
            return
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f
            if (r0 == 0) goto Lc
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r2
            r0.<init>(r2)
            goto L1d
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            goto L1d
        L18:
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            r0.<init>(r2)
        L1d:
            return r0
    }

    public final java.util.List<android.view.View> getDependencySortedChildren() {
            r1 = this;
            r1.m979u()
            java.util.List<android.view.View> r0 = r1.f1909a0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public final p227n0.C4642a0 getLastWindowInsets() {
            r1 = this;
            n0.a0 r0 = r1.f1922n0
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            n0.k r0 = r1.f1927s0
            int r0 = r0.m10516a()
            return r0
    }

    public android.graphics.drawable.Drawable getStatusBarBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1924p0
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
            r3 = this;
            int r0 = super.getSuggestedMinimumHeight()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r2 = r2 + r1
            int r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
            r3 = this;
            int r0 = super.getSuggestedMinimumWidth()
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r2 = r2 + r1
            int r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    /* renamed from: h */
    public final void m971h(int r7, android.graphics.Rect r8, android.graphics.Rect r9, androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f r10, int r11, int r12) {
            r6 = this;
            int r0 = r10.f1932c
            if (r0 != 0) goto L6
            r0 = 17
        L6:
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r7)
            int r10 = r10.f1933d
            r1 = r10 & 7
            if (r1 != 0) goto L14
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r10 = r10 | r1
        L14:
            r1 = r10 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L1a
            r10 = r10 | 48
        L1a:
            int r7 = android.view.Gravity.getAbsoluteGravity(r10, r7)
            r10 = r0 & 7
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r2 = 5
            r3 = 1
            if (r1 == r3) goto L32
            if (r1 == r2) goto L2f
            int r1 = r8.left
            goto L3b
        L2f:
            int r1 = r8.right
            goto L3b
        L32:
            int r1 = r8.left
            int r4 = r8.width()
            int r4 = r4 / 2
            int r1 = r1 + r4
        L3b:
            r4 = 80
            r5 = 16
            if (r7 == r5) goto L49
            if (r7 == r4) goto L46
            int r7 = r8.top
            goto L52
        L46:
            int r7 = r8.bottom
            goto L52
        L49:
            int r7 = r8.top
            int r8 = r8.height()
            int r8 = r8 / 2
            int r7 = r7 + r8
        L52:
            if (r10 == r3) goto L58
            if (r10 == r2) goto L5b
            int r1 = r1 - r11
            goto L5b
        L58:
            int r8 = r11 / 2
            int r1 = r1 - r8
        L5b:
            if (r0 == r5) goto L61
            if (r0 == r4) goto L64
            int r7 = r7 - r12
            goto L64
        L61:
            int r8 = r12 / 2
            int r7 = r7 - r8
        L64:
            int r11 = r11 + r1
            int r12 = r12 + r7
            r9.set(r1, r7, r11, r12)
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: i */
    public void mo560i(android.view.View r7, int r8) {
            r6 = this;
            n0.k r0 = r6.f1927s0
            r1 = 0
            r2 = 1
            if (r8 != r2) goto L9
            r0.f18564b = r1
            goto Lb
        L9:
            r0.f18563a = r1
        Lb:
            int r0 = r6.getChildCount()
            r2 = 0
        L10:
            if (r2 >= r0) goto L32
            android.view.View r3 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r4
            boolean r5 = r4.m1003a(r8)
            if (r5 != 0) goto L23
            goto L2f
        L23:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r4.f1930a
            if (r5 == 0) goto L2a
            r5.mo1001q(r6, r3, r7, r8)
        L2a:
            r4.m1004b(r8, r1)
            r4.f1945p = r1
        L2f:
            int r2 = r2 + 1
            goto L10
        L32:
            r7 = 0
            r6.f1919k0 = r7
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: j */
    public void mo561j(android.view.View r17, int r18, int r19, int[] r20, int r21) {
            r16 = this;
            r8 = r16
            int r9 = r16.getChildCount()
            r10 = 0
            r0 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        Lb:
            r14 = 1
            if (r11 >= r9) goto L6c
            android.view.View r2 = r8.getChildAt(r11)
            int r1 = r2.getVisibility()
            r3 = 8
            if (r1 != r3) goto L1d
            r15 = r21
            goto L69
        L1d:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1
            r15 = r21
            boolean r3 = r1.m1003a(r15)
            if (r3 != 0) goto L2c
            goto L69
        L2c:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.f1930a
            if (r1 == 0) goto L69
            int[] r6 = r8.f1913e0
            r6[r10] = r10
            r6[r14] = r10
            r0 = r1
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r7 = r21
            r0.mo995k(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.f1913e0
            if (r18 <= 0) goto L4f
            r0 = r0[r10]
            int r0 = java.lang.Math.max(r12, r0)
            goto L55
        L4f:
            r0 = r0[r10]
            int r0 = java.lang.Math.min(r12, r0)
        L55:
            r12 = r0
            int[] r0 = r8.f1913e0
            if (r19 <= 0) goto L61
            r0 = r0[r14]
            int r0 = java.lang.Math.max(r13, r0)
            goto L67
        L61:
            r0 = r0[r14]
            int r0 = java.lang.Math.min(r13, r0)
        L67:
            r13 = r0
            r0 = 1
        L69:
            int r11 = r11 + 1
            goto Lb
        L6c:
            r20[r10] = r12
            r20[r14] = r13
            if (r0 == 0) goto L75
            r8.m975q(r14)
        L75:
            return
    }

    /* renamed from: k */
    public final int m972k(int r5) {
            r4 = this;
            int[] r0 = r4.f1917i0
            r1 = 0
            java.lang.String r2 = "CoordinatorLayout"
            if (r0 != 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "No keylines defined for "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " - attempted index lookup "
            r0.append(r3)
            r0.append(r5)
        L1c:
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r2, r5)
            return r1
        L24:
            if (r5 < 0) goto L2d
            int r3 = r0.length
            if (r5 < r3) goto L2a
            goto L2d
        L2a:
            r5 = r0[r5]
            return r5
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Keyline index "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r5 = " out of range for "
            r0.append(r5)
            r0.append(r4)
            goto L1c
    }

    /* renamed from: l */
    public androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f m973l(android.view.View r7) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
            boolean r1 = r0.f1931b
            if (r1 != 0) goto L8f
            boolean r1 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b
            java.lang.String r2 = "CoordinatorLayout"
            r3 = 1
            if (r1 == 0) goto L31
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b) r7
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r7 = r7.getBehavior()
            if (r7 != 0) goto L1e
            java.lang.String r1 = "Attached behavior class is null"
            android.util.Log.e(r2, r1)
        L1e:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r0.f1930a
            if (r1 == r7) goto L8d
            if (r1 == 0) goto L27
            r1.mo990f()
        L27:
            r0.f1930a = r7
            r0.f1931b = r3
            if (r7 == 0) goto L8d
            r7.mo987c(r0)
            goto L8d
        L31:
            java.lang.Class r7 = r7.getClass()
            r1 = 0
        L36:
            if (r7 == 0) goto L47
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout$d> r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0339d.class
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0339d) r1
            if (r1 != 0) goto L47
            java.lang.Class r7 = r7.getSuperclass()
            goto L36
        L47:
            if (r1 == 0) goto L8d
            java.lang.Class r7 = r1.value()     // Catch: java.lang.Exception -> L6f
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L6f
            java.lang.reflect.Constructor r7 = r7.getDeclaredConstructor(r5)     // Catch: java.lang.Exception -> L6f
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L6f
            java.lang.Object r7 = r7.newInstance(r4)     // Catch: java.lang.Exception -> L6f
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c) r7     // Catch: java.lang.Exception -> L6f
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r0.f1930a     // Catch: java.lang.Exception -> L6f
            if (r4 == r7) goto L8d
            if (r4 == 0) goto L65
            r4.mo990f()     // Catch: java.lang.Exception -> L6f
        L65:
            r0.f1930a = r7     // Catch: java.lang.Exception -> L6f
            r0.f1931b = r3     // Catch: java.lang.Exception -> L6f
            if (r7 == 0) goto L8d
            r7.mo987c(r0)     // Catch: java.lang.Exception -> L6f
            goto L8d
        L6f:
            r7 = move-exception
            java.lang.String r4 = "Default behavior class "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            java.lang.Class r1 = r1.value()
            java.lang.String r1 = r1.getName()
            r4.append(r1)
            java.lang.String r1 = " could not be instantiated. Did you forget a default constructor?"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r2, r1, r7)
        L8d:
            r0.f1931b = r3
        L8f:
            return r0
    }

    @Override // p227n0.InterfaceC4651j
    /* renamed from: m */
    public void mo564m(android.view.View r18, int r19, int r20, int r21, int r22, int r23, int[] r24) {
            r17 = this;
            r10 = r17
            int r11 = r17.getChildCount()
            r12 = 0
            r0 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        Lb:
            r9 = 1
            if (r13 >= r11) goto L76
            android.view.View r2 = r10.getChildAt(r13)
            int r1 = r2.getVisibility()
            r3 = 8
            if (r1 != r3) goto L1b
            goto L73
        L1b:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1
            r8 = r23
            boolean r3 = r1.m1003a(r8)
            if (r3 != 0) goto L2a
            goto L73
        L2a:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.f1930a
            if (r1 == 0) goto L73
            int[] r7 = r10.f1913e0
            r7[r12] = r12
            r7[r9] = r12
            r0 = r1
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r16 = r7
            r7 = r22
            r8 = r23
            r9 = r16
            r0.mo996l(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r0 = r10.f1913e0
            if (r21 <= 0) goto L55
            r0 = r0[r12]
            int r0 = java.lang.Math.max(r14, r0)
            goto L5b
        L55:
            r0 = r0[r12]
            int r0 = java.lang.Math.min(r14, r0)
        L5b:
            r14 = r0
            if (r22 <= 0) goto L68
            int[] r0 = r10.f1913e0
            r1 = 1
            r0 = r0[r1]
            int r0 = java.lang.Math.max(r15, r0)
            goto L71
        L68:
            r1 = 1
            int[] r0 = r10.f1913e0
            r0 = r0[r1]
            int r0 = java.lang.Math.min(r15, r0)
        L71:
            r15 = r0
            r0 = 1
        L73:
            int r13 = r13 + 1
            goto Lb
        L76:
            r1 = 1
            r2 = r24[r12]
            int r2 = r2 + r14
            r24[r12] = r2
            r2 = r24[r1]
            int r2 = r2 + r15
            r24[r1] = r2
            if (r0 == 0) goto L86
            r10.m975q(r1)
        L86:
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: n */
    public void mo565n(android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            int[] r7 = r8.f1914f0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.mo564m(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: o */
    public boolean mo566o(android.view.View r15, android.view.View r16, int r17, int r18) {
            r14 = this;
            r7 = r18
            int r8 = r14.getChildCount()
            r9 = 0
            r10 = 0
            r11 = 0
        L9:
            r12 = r14
            if (r10 >= r8) goto L3b
            android.view.View r2 = r14.getChildAt(r10)
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 != r1) goto L19
            goto L38
        L19:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r13 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r13 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r13
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r13.f1930a
            if (r0 == 0) goto L35
            r1 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            boolean r0 = r0.mo1000p(r1, r2, r3, r4, r5, r6)
            r11 = r11 | r0
            r13.m1004b(r7, r0)
            goto L38
        L35:
            r13.m1004b(r7, r9)
        L38:
            int r10 = r10 + 1
            goto L9
        L3b:
            return r11
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 0
            r2.m980v(r0)
            boolean r0 = r2.f1921m0
            if (r0 == 0) goto L1f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r2.f1920l0
            if (r0 != 0) goto L16
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>(r2)
            r2.f1920l0 = r0
        L16:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r2.f1920l0
            r0.addOnPreDrawListener(r1)
        L1f:
            n0.a0 r0 = r2.f1922n0
            if (r0 != 0) goto L2e
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.c.m10554b(r2)
            if (r0 == 0) goto L2e
            p227n0.C4661t.g.m10595c(r2)
        L2e:
            r0 = 1
            r2.f1916h0 = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r3.m980v(r0)
            boolean r1 = r3.f1921m0
            if (r1 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r3.f1920l0
            if (r1 == 0) goto L18
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r2 = r3.f1920l0
            r1.removeOnPreDrawListener(r2)
        L18:
            android.view.View r1 = r3.f1919k0
            if (r1 == 0) goto L1f
            r3.onStopNestedScroll(r1)
        L1f:
            r3.f1916h0 = r0
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f1923o0
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r4.f1924p0
            if (r0 == 0) goto L26
            n0.a0 r0 = r4.f1922n0
            r1 = 0
            if (r0 == 0) goto L15
            int r0 = r0.m10468d()
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 <= 0) goto L26
            android.graphics.drawable.Drawable r2 = r4.f1924p0
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f1924p0
            r0.draw(r5)
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 != 0) goto La
            r3.m980v(r1)
        La:
            r2 = 0
            boolean r4 = r3.m978t(r4, r2)
            if (r0 == r1) goto L14
            r2 = 3
            if (r0 != r2) goto L17
        L14:
            r3.m980v(r1)
        L17:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            int r2 = p227n0.C4661t.d.m10575d(r1)
            java.util.List<android.view.View> r3 = r1.f1909a0
            int r3 = r3.size()
            r4 = 0
        Ld:
            if (r4 >= r3) goto L36
            java.util.List<android.view.View> r5 = r1.f1909a0
            java.lang.Object r5 = r5.get(r4)
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            r0 = 8
            if (r6 != r0) goto L20
            goto L33
        L20:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1930a
            if (r6 == 0) goto L30
            boolean r6 = r6.mo992h(r1, r5, r2)
            if (r6 != 0) goto L33
        L30:
            r1.m976r(r5, r2)
        L33:
            int r4 = r4 + 1
            goto Ld
        L36:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r31, int r32) {
            r30 = this;
            r7 = r30
            r30.m979u()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = 0
        Lb:
            r2 = 1
            if (r1 >= r0) goto L3c
            android.view.View r3 = r7.getChildAt(r1)
            v.c r4 = r7.f1910b0
            v.e r5 = r4.f25076Z
            s.h r5 = (p319s.C5941h) r5
            int r5 = r5.f22812a0
            r6 = 0
        L1b:
            if (r6 >= r5) goto L34
            v.e r9 = r4.f25076Z
            s.h r9 = (p319s.C5941h) r9
            java.lang.Object r9 = r9.m12344l(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L31
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L31
            r3 = 1
            goto L35
        L31:
            int r6 = r6 + 1
            goto L1b
        L34:
            r3 = 0
        L35:
            if (r3 == 0) goto L39
            r0 = 1
            goto L3d
        L39:
            int r1 = r1 + 1
            goto Lb
        L3c:
            r0 = 0
        L3d:
            boolean r1 = r7.f1921m0
            if (r0 == r1) goto L71
            if (r0 == 0) goto L5e
            boolean r0 = r7.f1916h0
            if (r0 == 0) goto L5b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f1920l0
            if (r0 != 0) goto L52
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>(r7)
            r7.f1920l0 = r0
        L52:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f1920l0
            r0.addOnPreDrawListener(r1)
        L5b:
            r7.f1921m0 = r2
            goto L71
        L5e:
            boolean r0 = r7.f1916h0
            if (r0 == 0) goto L6f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f1920l0
            if (r0 == 0) goto L6f
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f1920l0
            r0.removeOnPreDrawListener(r1)
        L6f:
            r7.f1921m0 = r8
        L71:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            int r11 = p227n0.C4661t.d.m10575d(r30)
            if (r11 != r2) goto L8b
            r12 = 1
            goto L8c
        L8b:
            r12 = 0
        L8c:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            n0.a0 r3 = r7.f1922n0
            if (r3 == 0) goto Lb5
            boolean r3 = p227n0.C4661t.c.m10554b(r30)
            if (r3 == 0) goto Lb5
            r19 = 1
            goto Lb7
        Lb5:
            r19 = 0
        Lb7:
            java.util.List<android.view.View> r2 = r7.f1909a0
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        Lc1:
            if (r3 >= r6) goto L1da
            java.util.List<android.view.View> r0 = r7.f1909a0
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto Ldd
            r22 = r3
            r29 = r6
            r28 = r9
            goto L1d1
        Ldd:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1
            int r0 = r1.f1934e
            if (r0 < 0) goto L127
            if (r13 == 0) goto L127
            int r0 = r7.m972k(r0)
            int r8 = r1.f1932c
            if (r8 != 0) goto Lf5
            r8 = 8388661(0x800035, float:1.1755018E-38)
        Lf5:
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto L102
            if (r12 == 0) goto L107
        L102:
            r2 = 5
            if (r8 != r2) goto L113
            if (r12 == 0) goto L113
        L107:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r8 = 0
            goto L12b
        L113:
            if (r8 != r2) goto L117
            if (r12 == 0) goto L11c
        L117:
            r2 = 3
            if (r8 != r2) goto L125
            if (r12 == 0) goto L125
        L11c:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L12b
        L125:
            r8 = 0
            goto L129
        L127:
            r22 = r2
        L129:
            r21 = 0
        L12b:
            if (r19 == 0) goto L15d
            boolean r0 = p227n0.C4661t.c.m10554b(r20)
            if (r0 != 0) goto L15d
            n0.a0 r0 = r7.f1922n0
            int r0 = r0.m10466b()
            n0.a0 r2 = r7.f1922n0
            int r2 = r2.m10467c()
            int r2 = r2 + r0
            n0.a0 r0 = r7.f1922n0
            int r0 = r0.m10468d()
            n0.a0 r8 = r7.f1922n0
            int r8 = r8.m10465a()
            int r8 = r8 + r0
            int r0 = r14 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L161
        L15d:
            r8 = r31
            r23 = r32
        L161:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f1930a
            if (r0 == 0) goto L187
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo993i(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L1a1
            goto L194
        L187:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L194:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L1a1:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r2 + r18
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L1d1:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto Lc1
        L1da:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View r3, float r4, float r5, boolean r6) {
            r2 = this;
            int r3 = r2.getChildCount()
            r4 = 0
            r5 = 0
        L6:
            if (r5 >= r3) goto L27
            android.view.View r6 = r2.getChildAt(r5)
            int r0 = r6.getVisibility()
            r1 = 8
            if (r0 != r1) goto L15
            goto L24
        L15:
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r6
            boolean r0 = r6.m1003a(r4)
            if (r0 != 0) goto L22
            goto L24
        L22:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1930a
        L24:
            int r5 = r5 + 1
            goto L6
        L27:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L33
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L16
            goto L30
        L16:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r4
            boolean r5 = r4.m1003a(r1)
            if (r5 != 0) goto L23
            goto L30
        L23:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f1930a
            if (r4 == 0) goto L30
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r4 = r4.mo994j(r5, r6, r7, r8, r9)
            r3 = r3 | r4
        L30:
            int r2 = r2 + 1
            goto L7
        L33:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.mo561j(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            int[] r7 = r8.f1914f0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.mo564m(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.mo554c(r2, r3, r4, r0)
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r7) {
            r6 = this;
            boolean r0 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0343h
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r7)
            return
        L8:
            androidx.coordinatorlayout.widget.CoordinatorLayout$h r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0343h) r7
            android.os.Parcelable r0 = r7.f22819Y
            super.onRestoreInstanceState(r0)
            android.util.SparseArray<android.os.Parcelable> r7 = r7.f1948a0
            r0 = 0
            int r1 = r6.getChildCount()
        L16:
            if (r0 >= r1) goto L39
            android.view.View r2 = r6.getChildAt(r0)
            int r3 = r2.getId()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r6.m973l(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f1930a
            r5 = -1
            if (r3 == r5) goto L36
            if (r4 == 0) goto L36
            java.lang.Object r3 = r7.get(r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            if (r3 == 0) goto L36
            r4.mo998n(r6, r2, r3)
        L36:
            int r0 = r0 + 1
            goto L16
        L39:
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r8 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r8.getChildCount()
            r3 = 0
        L13:
            if (r3 >= r2) goto L36
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1930a
            r7 = -1
            if (r5 == r7) goto L33
            if (r6 == 0) goto L33
            android.os.Parcelable r4 = r6.mo999o(r8, r4)
            if (r4 == 0) goto L33
            r1.append(r5, r4)
        L33:
            int r3 = r3 + 1
            goto L13
        L36:
            r0.f1948a0 = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.mo566o(r2, r3, r4, r0)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.mo560i(r2, r0)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1918j0
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m978t(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f1918j0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1930a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f1918j0
            boolean r6 = r6.mo1002r(r0, r7, r1)
            goto L2a
        L29:
            r6 = 0
        L2a:
            android.view.View r7 = r0.f1918j0
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.m980v(r5)
        L55:
            return r6
    }

    /* renamed from: p */
    public boolean m974p(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = m965a()
            r1.m970g(r2, r0)
            boolean r2 = r0.contains(r3, r4)     // Catch: java.lang.Throwable -> L16
            r0.setEmpty()
            m0.c<android.graphics.Rect> r3 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1908x0
            m0.d r3 = (p212m0.C4314d) r3
            r3.mo6230a(r0)
            return r2
        L16:
            r2 = move-exception
            r0.setEmpty()
            m0.c<android.graphics.Rect> r3 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1908x0
            m0.d r3 = (p212m0.C4314d) r3
            r3.mo6230a(r0)
            throw r2
    }

    /* renamed from: q */
    public final void m975q(int r25) {
            r24 = this;
            r7 = r24
            r8 = r25
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r9 = p227n0.C4661t.d.m10575d(r24)
            java.util.List<android.view.View> r0 = r7.f1909a0
            int r10 = r0.size()
            android.graphics.Rect r11 = m965a()
            android.graphics.Rect r12 = m965a()
            android.graphics.Rect r13 = m965a()
            r0 = 0
            r14 = 0
        L1e:
            if (r14 >= r10) goto L2ce
            java.util.List<android.view.View> r0 = r7.f1909a0
            java.lang.Object r0 = r0.get(r14)
            r15 = r0
            android.view.View r15 = (android.view.View) r15
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            r6 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r6
            if (r8 != 0) goto L40
            int r0 = r15.getVisibility()
            r1 = 8
            if (r0 != r1) goto L40
            r1 = r10
            r2 = r13
            r19 = r14
            goto L2c8
        L40:
            r0 = 0
            r5 = 0
        L42:
            if (r5 >= r14) goto Lfb
            java.util.List<android.view.View> r0 = r7.f1909a0
            java.lang.Object r0 = r0.get(r5)
            android.view.View r0 = (android.view.View) r0
            android.view.View r1 = r6.f1941l
            if (r1 != r0) goto Le7
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            r4 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r4
            android.view.View r0 = r4.f1940k
            if (r0 == 0) goto Le7
            android.graphics.Rect r3 = m965a()
            android.graphics.Rect r2 = m965a()
            android.graphics.Rect r1 = m965a()
            android.view.View r0 = r4.f1940k
            r7.m970g(r0, r3)
            r0 = 0
            r7.m967d(r15, r0, r2)
            int r0 = r15.getMeasuredWidth()
            r16 = r10
            int r10 = r15.getMeasuredHeight()
            r17 = r0
            r0 = r24
            r18 = r1
            r1 = r9
            r19 = r14
            r14 = r2
            r2 = r3
            r20 = r3
            r3 = r18
            r21 = r4
            r22 = r5
            r5 = r17
            r23 = r13
            r13 = r6
            r6 = r10
            r0.m971h(r1, r2, r3, r4, r5, r6)
            r0 = r18
            int r1 = r0.left
            int r2 = r14.left
            if (r1 != r2) goto La7
            int r1 = r0.top
            int r2 = r14.top
            if (r1 == r2) goto La5
            goto La7
        La5:
            r1 = 0
            goto La8
        La7:
            r1 = 1
        La8:
            r3 = r17
            r2 = r21
            r7.m966b(r2, r0, r3, r10)
            int r3 = r0.left
            int r4 = r14.left
            int r3 = r3 - r4
            int r4 = r0.top
            int r5 = r14.top
            int r4 = r4 - r5
            if (r3 == 0) goto Lbe
            p227n0.C4661t.m10538n(r15, r3)
        Lbe:
            if (r4 == 0) goto Lc3
            p227n0.C4661t.m10539o(r15, r4)
        Lc3:
            if (r1 == 0) goto Lce
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r2.f1930a
            if (r1 == 0) goto Lce
            android.view.View r2 = r2.f1940k
            r1.mo988d(r7, r15, r2)
        Lce:
            r20.setEmpty()
            m0.c<android.graphics.Rect> r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1908x0
            m0.d r1 = (p212m0.C4314d) r1
            r2 = r20
            r1.mo6230a(r2)
            r14.setEmpty()
            r1.mo6230a(r14)
            r0.setEmpty()
            r1.mo6230a(r0)
            goto Lf0
        Le7:
            r22 = r5
            r16 = r10
            r23 = r13
            r19 = r14
            r13 = r6
        Lf0:
            int r5 = r22 + 1
            r6 = r13
            r10 = r16
            r14 = r19
            r13 = r23
            goto L42
        Lfb:
            r16 = r10
            r23 = r13
            r19 = r14
            r13 = r6
            r0 = 1
            r7.m967d(r15, r0, r12)
            int r0 = r13.f1936g
            r1 = 48
            r2 = 80
            r3 = 3
            r4 = 5
            if (r0 == 0) goto L15e
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L15e
            int r0 = r13.f1936g
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r9)
            r5 = r0 & 112(0x70, float:1.57E-43)
            if (r5 == r1) goto L133
            if (r5 == r2) goto L123
            goto L13d
        L123:
            int r5 = r11.bottom
            int r6 = r24.getHeight()
            int r10 = r12.top
            int r6 = r6 - r10
            int r5 = java.lang.Math.max(r5, r6)
            r11.bottom = r5
            goto L13d
        L133:
            int r5 = r11.top
            int r6 = r12.bottom
            int r5 = java.lang.Math.max(r5, r6)
            r11.top = r5
        L13d:
            r0 = r0 & 7
            if (r0 == r3) goto L154
            if (r0 == r4) goto L144
            goto L15e
        L144:
            int r0 = r11.right
            int r3 = r24.getWidth()
            int r4 = r12.left
            int r3 = r3 - r4
            int r0 = java.lang.Math.max(r0, r3)
            r11.right = r0
            goto L15e
        L154:
            int r0 = r11.left
            int r3 = r12.right
            int r0 = java.lang.Math.max(r0, r3)
            r11.left = r0
        L15e:
            int r0 = r13.f1937h
            if (r0 == 0) goto L266
            int r0 = r15.getVisibility()
            if (r0 != 0) goto L266
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10588c(r15)
            if (r0 != 0) goto L172
            goto L266
        L172:
            int r0 = r15.getWidth()
            if (r0 <= 0) goto L266
            int r0 = r15.getHeight()
            if (r0 > 0) goto L180
            goto L266
        L180:
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r0.f1930a
            android.graphics.Rect r4 = m965a()
            android.graphics.Rect r5 = m965a()
            int r6 = r15.getLeft()
            int r10 = r15.getTop()
            int r13 = r15.getRight()
            int r14 = r15.getBottom()
            r5.set(r6, r10, r13, r14)
            if (r3 == 0) goto L1d5
            boolean r3 = r3.mo985a(r7, r15, r4)
            if (r3 == 0) goto L1d5
            boolean r3 = r5.contains(r4)
            if (r3 == 0) goto L1b2
            goto L1d8
        L1b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Rect should be within the child's bounds. Rect:"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r4.toShortString()
            r1.append(r2)
            java.lang.String r2 = " | Bounds:"
            r1.append(r2)
            java.lang.String r2 = r5.toShortString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1d5:
            r4.set(r5)
        L1d8:
            r5.setEmpty()
            m0.c<android.graphics.Rect> r3 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1908x0
            m0.d r3 = (p212m0.C4314d) r3
            r3.mo6230a(r5)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L1ea
            goto L260
        L1ea:
            int r5 = r0.f1937h
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r9)
            r6 = r5 & 48
            if (r6 != r1) goto L206
            int r1 = r4.top
            int r6 = r0.topMargin
            int r1 = r1 - r6
            int r6 = r0.f1939j
            int r1 = r1 - r6
            int r6 = r11.top
            if (r1 >= r6) goto L206
            int r6 = r6 - r1
            r7.m982x(r15, r6)
            r1 = 1
            goto L207
        L206:
            r1 = 0
        L207:
            r6 = r5 & 80
            if (r6 != r2) goto L221
            int r2 = r24.getHeight()
            int r6 = r4.bottom
            int r2 = r2 - r6
            int r6 = r0.bottomMargin
            int r2 = r2 - r6
            int r6 = r0.f1939j
            int r2 = r2 + r6
            int r6 = r11.bottom
            if (r2 >= r6) goto L221
            int r2 = r2 - r6
            r7.m982x(r15, r2)
            r1 = 1
        L221:
            if (r1 != 0) goto L227
            r1 = 0
            r7.m982x(r15, r1)
        L227:
            r1 = r5 & 3
            r2 = 3
            if (r1 != r2) goto L23e
            int r1 = r4.left
            int r2 = r0.leftMargin
            int r1 = r1 - r2
            int r2 = r0.f1938i
            int r1 = r1 - r2
            int r2 = r11.left
            if (r1 >= r2) goto L23e
            int r2 = r2 - r1
            r7.m981w(r15, r2)
            r1 = 1
            goto L23f
        L23e:
            r1 = 0
        L23f:
            r2 = r5 & 5
            r5 = 5
            if (r2 != r5) goto L25a
            int r2 = r24.getWidth()
            int r5 = r4.right
            int r2 = r2 - r5
            int r5 = r0.rightMargin
            int r2 = r2 - r5
            int r0 = r0.f1938i
            int r2 = r2 + r0
            int r0 = r11.right
            if (r2 >= r0) goto L25a
            int r2 = r2 - r0
            r7.m981w(r15, r2)
            r1 = 1
        L25a:
            if (r1 != 0) goto L260
            r0 = 0
            r7.m981w(r15, r0)
        L260:
            r4.setEmpty()
            r3.mo6230a(r4)
        L266:
            r0 = 2
            if (r8 == r0) goto L28b
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1
            android.graphics.Rect r1 = r1.f1946q
            r2 = r23
            r2.set(r1)
            boolean r1 = r2.equals(r12)
            if (r1 == 0) goto L27f
            r1 = r16
            goto L2c8
        L27f:
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1
            android.graphics.Rect r1 = r1.f1946q
            r1.set(r12)
            goto L28d
        L28b:
            r2 = r23
        L28d:
            int r14 = r19 + 1
            r1 = r16
        L291:
            if (r14 >= r1) goto L2c8
            java.util.List<android.view.View> r3 = r7.f1909a0
            java.lang.Object r3 = r3.get(r14)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r4.f1930a
            if (r5 == 0) goto L2c5
            boolean r6 = r5.mo986b(r7, r3, r15)
            if (r6 == 0) goto L2c5
            if (r8 != 0) goto L2b5
            boolean r6 = r4.f1945p
            if (r6 == 0) goto L2b5
            r3 = 0
            r4.f1945p = r3
            goto L2c5
        L2b5:
            if (r8 == r0) goto L2bc
            boolean r3 = r5.mo988d(r7, r3, r15)
            goto L2c0
        L2bc:
            r5.mo989e(r7, r3, r15)
            r3 = 1
        L2c0:
            r5 = 1
            if (r8 != r5) goto L2c5
            r4.f1945p = r3
        L2c5:
            int r14 = r14 + 1
            goto L291
        L2c8:
            int r14 = r19 + 1
            r10 = r1
            r13 = r2
            goto L1e
        L2ce:
            r2 = r13
            r11.setEmpty()
            m0.c<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1908x0
            m0.d r0 = (p212m0.C4314d) r0
            r0.mo6230a(r11)
            r12.setEmpty()
            r0.mo6230a(r12)
            r2.setEmpty()
            r0.mo6230a(r2)
            return
    }

    /* renamed from: r */
    public void m976r(android.view.View r13, int r14) {
            r12 = this;
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
            android.view.View r1 = r0.f1940k
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L13
            int r4 = r0.f1935f
            r5 = -1
            if (r4 == r5) goto L13
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            if (r4 != 0) goto L1a0
            if (r1 == 0) goto L6d
            android.graphics.Rect r0 = m965a()
            android.graphics.Rect r2 = m965a()
            r12.m970g(r1, r0)     // Catch: java.lang.Throwable -> L5b
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()     // Catch: java.lang.Throwable -> L5b
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1     // Catch: java.lang.Throwable -> L5b
            int r3 = r13.getMeasuredWidth()     // Catch: java.lang.Throwable -> L5b
            int r4 = r13.getMeasuredHeight()     // Catch: java.lang.Throwable -> L5b
            r5 = r12
            r6 = r14
            r7 = r0
            r8 = r2
            r9 = r1
            r10 = r3
            r11 = r4
            r5.m971h(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5b
            r12.m966b(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L5b
            int r14 = r2.left     // Catch: java.lang.Throwable -> L5b
            int r1 = r2.top     // Catch: java.lang.Throwable -> L5b
            int r3 = r2.right     // Catch: java.lang.Throwable -> L5b
            int r4 = r2.bottom     // Catch: java.lang.Throwable -> L5b
            r13.layout(r14, r1, r3, r4)     // Catch: java.lang.Throwable -> L5b
            r0.setEmpty()
            m0.c<android.graphics.Rect> r13 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1908x0
            m0.d r13 = (p212m0.C4314d) r13
            r13.mo6230a(r0)
            r2.setEmpty()
            r13.mo6230a(r2)
            goto L19f
        L5b:
            r13 = move-exception
            r0.setEmpty()
            m0.c<android.graphics.Rect> r14 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1908x0
            m0.d r14 = (p212m0.C4314d) r14
            r14.mo6230a(r0)
            r2.setEmpty()
            r14.mo6230a(r2)
            throw r13
        L6d:
            int r0 = r0.f1934e
            if (r0 < 0) goto Lf0
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1
            int r4 = r1.f1932c
            if (r4 != 0) goto L7e
            r4 = 8388661(0x800035, float:1.1755018E-38)
        L7e:
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r14)
            r5 = r4 & 7
            r4 = r4 & 112(0x70, float:1.57E-43)
            int r6 = r12.getWidth()
            int r7 = r12.getHeight()
            int r8 = r13.getMeasuredWidth()
            int r9 = r13.getMeasuredHeight()
            if (r14 != r2) goto L9a
            int r0 = r6 - r0
        L9a:
            int r14 = r12.m972k(r0)
            int r14 = r14 - r8
            if (r5 == r2) goto La7
            r0 = 5
            if (r5 == r0) goto La5
            goto Laa
        La5:
            int r14 = r14 + r8
            goto Laa
        La7:
            int r0 = r8 / 2
            int r14 = r14 + r0
        Laa:
            r0 = 16
            if (r4 == r0) goto Lb6
            r0 = 80
            if (r4 == r0) goto Lb3
            goto Lb9
        Lb3:
            int r3 = r9 + 0
            goto Lb9
        Lb6:
            int r0 = r9 / 2
            int r3 = r3 + r0
        Lb9:
            int r0 = r12.getPaddingLeft()
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r12.getPaddingRight()
            int r6 = r6 - r2
            int r6 = r6 - r8
            int r2 = r1.rightMargin
            int r6 = r6 - r2
            int r14 = java.lang.Math.min(r14, r6)
            int r14 = java.lang.Math.max(r0, r14)
            int r0 = r12.getPaddingTop()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r2 = r12.getPaddingBottom()
            int r7 = r7 - r2
            int r7 = r7 - r9
            int r1 = r1.bottomMargin
            int r7 = r7 - r1
            int r1 = java.lang.Math.min(r3, r7)
            int r0 = java.lang.Math.max(r0, r1)
            int r8 = r8 + r14
            int r9 = r9 + r0
            r13.layout(r14, r0, r8, r9)
            goto L19f
        Lf0:
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
            android.graphics.Rect r7 = m965a()
            int r1 = r12.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r12.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r12.getWidth()
            int r4 = r12.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r0.rightMargin
            int r3 = r3 - r4
            int r4 = r12.getHeight()
            int r5 = r12.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r0.bottomMargin
            int r4 = r4 - r5
            r7.set(r1, r2, r3, r4)
            n0.a0 r1 = r12.f1922n0
            if (r1 == 0) goto L161
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            boolean r1 = p227n0.C4661t.c.m10554b(r12)
            if (r1 == 0) goto L161
            boolean r1 = p227n0.C4661t.c.m10554b(r13)
            if (r1 != 0) goto L161
            int r1 = r7.left
            n0.a0 r2 = r12.f1922n0
            int r2 = r2.m10466b()
            int r2 = r2 + r1
            r7.left = r2
            int r1 = r7.top
            n0.a0 r2 = r12.f1922n0
            int r2 = r2.m10468d()
            int r2 = r2 + r1
            r7.top = r2
            int r1 = r7.right
            n0.a0 r2 = r12.f1922n0
            int r2 = r2.m10467c()
            int r1 = r1 - r2
            r7.right = r1
            int r1 = r7.bottom
            n0.a0 r2 = r12.f1922n0
            int r2 = r2.m10465a()
            int r1 = r1 - r2
            r7.bottom = r1
        L161:
            android.graphics.Rect r8 = m965a()
            int r0 = r0.f1932c
            r1 = r0 & 7
            if (r1 != 0) goto L16f
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0 = r0 | r1
        L16f:
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L175
            r0 = r0 | 48
        L175:
            r1 = r0
            int r2 = r13.getMeasuredWidth()
            int r3 = r13.getMeasuredHeight()
            r4 = r7
            r5 = r8
            r6 = r14
            android.view.Gravity.apply(r1, r2, r3, r4, r5, r6)
            int r14 = r8.left
            int r0 = r8.top
            int r1 = r8.right
            int r2 = r8.bottom
            r13.layout(r14, r0, r1, r2)
            r7.setEmpty()
            m0.c<android.graphics.Rect> r13 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1908x0
            m0.d r13 = (p212m0.C4314d) r13
            r13.mo6230a(r7)
            r8.setEmpty()
            r13.mo6230a(r8)
        L19f:
            return
        L1a0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r13.<init>(r14)
            throw r13
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.f1930a
            if (r0 == 0) goto L12
            boolean r0 = r0.mo997m(r1, r2, r3, r4)
            if (r0 == 0) goto L12
            r2 = 1
            return r2
        L12:
            boolean r2 = super.requestChildRectangleOnScreen(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            super.requestDisallowInterceptTouchEvent(r1)
            if (r1 == 0) goto L10
            boolean r1 = r0.f1915g0
            if (r1 != 0) goto L10
            r1 = 0
            r0.m980v(r1)
            r1 = 1
            r0.f1915g0 = r1
        L10:
            return
    }

    /* renamed from: s */
    public void m977s(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
            r0 = this;
            super.setFitsSystemWindows(r1)
            r0.m983y()
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r1) {
            r0 = this;
            r0.f1925q0 = r1
            return
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1924p0
            if (r0 == r3) goto L47
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.f1924p0 = r1
            if (r1 == 0) goto L42
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r2.f1924p0
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L23:
            android.graphics.drawable.Drawable r3 = r2.f1924p0
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10575d(r2)
            p103g0.C2200a.m5787c(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.f1924p0
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.f1924p0
            r3.setCallback(r2)
        L42:
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r2)
        L47:
            return
    }

    public void setStatusBarBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarBackground(r0)
            return
    }

    public void setStatusBarBackgroundResource(int r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            android.content.Context r0 = r2.getContext()
            java.lang.Object r1 = p046d0.C1259a.f6733a
            android.graphics.drawable.Drawable r3 = p046d0.C1259a.b.m3710b(r0, r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            r2.setStatusBarBackground(r3)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            android.graphics.drawable.Drawable r1 = r2.f1924p0
            if (r1 == 0) goto L18
            boolean r1 = r1.isVisible()
            if (r1 == r3) goto L18
            android.graphics.drawable.Drawable r1 = r2.f1924p0
            r1.setVisible(r3, r0)
        L18:
            return
    }

    /* renamed from: t */
    public final boolean m978t(android.view.MotionEvent r24, int r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r24.getActionMasked()
            java.util.List<android.view.View> r4 = r0.f1911c0
            r4.clear()
            boolean r5 = r23.isChildrenDrawingOrderEnabled()
            int r6 = r23.getChildCount()
            int r7 = r6 + (-1)
        L19:
            if (r7 < 0) goto L2d
            if (r5 == 0) goto L22
            int r8 = r0.getChildDrawingOrder(r6, r7)
            goto L23
        L22:
            r8 = r7
        L23:
            android.view.View r8 = r0.getChildAt(r8)
            r4.add(r8)
            int r7 = r7 + (-1)
            goto L19
        L2d:
            java.util.Comparator<android.view.View> r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.f1907w0
            if (r5 == 0) goto L34
            java.util.Collections.sort(r4, r5)
        L34:
            int r5 = r4.size()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L3d:
            if (r8 >= r5) goto Lac
            java.lang.Object r11 = r4.get(r8)
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r12
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r13 = r12.f1930a
            r14 = 1
            if (r9 != 0) goto L52
            if (r10 == 0) goto L77
        L52:
            if (r3 == 0) goto L77
            if (r13 == 0) goto La9
            if (r6 != 0) goto L6a
            long r17 = android.os.SystemClock.uptimeMillis()
            r19 = 3
            r20 = 0
            r21 = 0
            r22 = 0
            r15 = r17
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
        L6a:
            if (r2 == 0) goto L73
            if (r2 == r14) goto L6f
            goto La9
        L6f:
            r13.mo1002r(r0, r11, r6)
            goto La9
        L73:
            r13.mo991g(r0, r11, r6)
            goto La9
        L77:
            if (r9 != 0) goto L8d
            if (r13 == 0) goto L8d
            if (r2 == 0) goto L85
            if (r2 == r14) goto L80
            goto L89
        L80:
            boolean r9 = r13.mo1002r(r0, r11, r1)
            goto L89
        L85:
            boolean r9 = r13.mo991g(r0, r11, r1)
        L89:
            if (r9 == 0) goto L8d
            r0.f1918j0 = r11
        L8d:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r12.f1930a
            if (r10 != 0) goto L93
            r12.f1942m = r7
        L93:
            boolean r10 = r12.f1942m
            if (r10 == 0) goto L99
            r11 = 1
            goto L9d
        L99:
            r11 = r10 | 0
            r12.f1942m = r11
        L9d:
            if (r11 == 0) goto La3
            if (r10 != 0) goto La3
            r10 = 1
            goto La4
        La3:
            r10 = 0
        La4:
            if (r11 == 0) goto La9
            if (r10 != 0) goto La9
            goto Lac
        La9:
            int r8 = r8 + 1
            goto L3d
        Lac:
            r4.clear()
            return r9
    }

    /* renamed from: u */
    public final void m979u() {
            r11 = this;
            java.util.List<android.view.View> r0 = r11.f1909a0
            r0.clear()
            v.c r0 = r11.f1910b0
            v.e r1 = r0.f25076Z
            s.h r1 = (p319s.C5941h) r1
            int r1 = r1.f22812a0
            r2 = 0
            r3 = 0
        Lf:
            if (r3 >= r1) goto L23
            v.e r4 = r0.f25076Z
            s.h r4 = (p319s.C5941h) r4
            java.lang.Object r4 = r4.m12344l(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L20
            r0.m13115g(r4)
        L20:
            int r3 = r3 + 1
            goto Lf
        L23:
            v.e r0 = r0.f25076Z
            s.h r0 = (p319s.C5941h) r0
            r0.clear()
            int r0 = r11.getChildCount()
            r1 = 0
        L2f:
            if (r1 >= r0) goto L18f
            android.view.View r3 = r11.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r11.m973l(r3)
            int r5 = r4.f1935f
            r6 = -1
            r7 = 0
            if (r5 != r6) goto L45
            r4.f1941l = r7
            r4.f1940k = r7
            goto Lc3
        L45:
            android.view.View r5 = r4.f1940k
            if (r5 == 0) goto L76
            int r5 = r5.getId()
            int r6 = r4.f1935f
            if (r5 == r6) goto L52
            goto L6f
        L52:
            android.view.View r5 = r4.f1940k
            android.view.ViewParent r6 = r5.getParent()
        L58:
            if (r6 == r11) goto L71
            if (r6 == 0) goto L6b
            if (r6 != r3) goto L5f
            goto L6b
        L5f:
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto L66
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L66:
            android.view.ViewParent r6 = r6.getParent()
            goto L58
        L6b:
            r4.f1941l = r7
            r4.f1940k = r7
        L6f:
            r5 = 0
            goto L74
        L71:
            r4.f1941l = r5
            r5 = 1
        L74:
            if (r5 != 0) goto Lc3
        L76:
            int r5 = r4.f1935f
            android.view.View r5 = r11.findViewById(r5)
            r4.f1940k = r5
            if (r5 == 0) goto Lb9
            if (r5 != r11) goto L91
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L89
            goto Lbf
        L89:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L91:
            android.view.ViewParent r6 = r5.getParent()
        L95:
            if (r6 == r11) goto Lb6
            if (r6 == 0) goto Lb6
            if (r6 != r3) goto Laa
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto La2
            goto Lbf
        La2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        Laa:
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto Lb1
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        Lb1:
            android.view.ViewParent r6 = r6.getParent()
            goto L95
        Lb6:
            r4.f1941l = r5
            goto Lc3
        Lb9:
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L16a
        Lbf:
            r4.f1941l = r7
            r4.f1940k = r7
        Lc3:
            v.c r5 = r11.f1910b0
            r5.m13112c(r3)
            r5 = 0
        Lc9:
            if (r5 >= r0) goto L166
            if (r5 != r1) goto Lcf
            goto L162
        Lcf:
            android.view.View r6 = r11.getChildAt(r5)
            android.view.View r8 = r4.f1941l
            if (r6 == r8) goto L106
            java.util.WeakHashMap<android.view.View, n0.w> r8 = p227n0.C4661t.f18570a
            int r8 = p227n0.C4661t.d.m10575d(r11)
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r9
            int r9 = r9.f1936g
            int r9 = android.view.Gravity.getAbsoluteGravity(r9, r8)
            if (r9 == 0) goto Lf6
            int r10 = r4.f1937h
            int r8 = android.view.Gravity.getAbsoluteGravity(r10, r8)
            r8 = r8 & r9
            if (r8 != r9) goto Lf6
            r8 = 1
            goto Lf7
        Lf6:
            r8 = 0
        Lf7:
            if (r8 != 0) goto L106
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r8 = r4.f1930a
            if (r8 == 0) goto L104
            boolean r8 = r8.mo986b(r11, r3, r6)
            if (r8 == 0) goto L104
            goto L106
        L104:
            r8 = 0
            goto L107
        L106:
            r8 = 1
        L107:
            if (r8 == 0) goto L162
            v.c r8 = r11.f1910b0
            v.e r8 = r8.f25076Z
            s.h r8 = (p319s.C5941h) r8
            int r8 = r8.m12340e(r6)
            if (r8 < 0) goto L117
            r8 = 1
            goto L118
        L117:
            r8 = 0
        L118:
            if (r8 != 0) goto L11f
            v.c r8 = r11.f1910b0
            r8.m13112c(r6)
        L11f:
            v.c r8 = r11.f1910b0
            v.e r9 = r8.f25076Z
            s.h r9 = (p319s.C5941h) r9
            int r9 = r9.m12340e(r6)
            if (r9 < 0) goto L12d
            r9 = 1
            goto L12e
        L12d:
            r9 = 0
        L12e:
            if (r9 == 0) goto L15a
            v.e r9 = r8.f25076Z
            s.h r9 = (p319s.C5941h) r9
            int r9 = r9.m12340e(r3)
            if (r9 < 0) goto L13c
            r9 = 1
            goto L13d
        L13c:
            r9 = 0
        L13d:
            if (r9 == 0) goto L15a
            v.e r9 = r8.f25076Z
            s.h r9 = (p319s.C5941h) r9
            java.lang.Object r9 = r9.getOrDefault(r6, r7)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L156
            java.util.ArrayList r9 = r8.m13114f()
            v.e r8 = r8.f25076Z
            s.h r8 = (p319s.C5941h) r8
            r8.put(r6, r9)
        L156:
            r9.add(r3)
            goto L162
        L15a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L162:
            int r5 = r5 + 1
            goto Lc9
        L166:
            int r1 = r1 + 1
            goto L2f
        L16a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            android.content.res.Resources r2 = r11.getResources()
            int r4 = r4.f1935f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L18f:
            java.util.List<android.view.View> r0 = r11.f1909a0
            v.c r1 = r11.f1910b0
            v.e r3 = r1.f25077a0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.lang.Object r3 = r1.f25078b0
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            v.e r3 = r1.f25076Z
            s.h r3 = (p319s.C5941h) r3
            int r3 = r3.f22812a0
        L1a7:
            if (r2 >= r3) goto L1bf
            v.e r4 = r1.f25076Z
            s.h r4 = (p319s.C5941h) r4
            java.lang.Object r4 = r4.m12343h(r2)
            v.e r5 = r1.f25077a0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r1.f25078b0
            java.util.HashSet r6 = (java.util.HashSet) r6
            r1.m13113d(r4, r5, r6)
            int r2 = r2 + 1
            goto L1a7
        L1bf:
            v.e r1 = r1.f25077a0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r11.f1909a0
            java.util.Collections.reverse(r0)
            return
    }

    /* renamed from: v */
    public final void m980v(boolean r14) {
            r13 = this;
            int r0 = r13.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L32
            android.view.View r3 = r13.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f1930a
            if (r4 == 0) goto L2f
            long r7 = android.os.SystemClock.uptimeMillis()
            r9 = 3
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r7
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
            if (r14 == 0) goto L29
            r4.mo991g(r13, r3, r5)
            goto L2c
        L29:
            r4.mo1002r(r13, r3, r5)
        L2c:
            r5.recycle()
        L2f:
            int r2 = r2 + 1
            goto L6
        L32:
            r14 = 0
        L33:
            if (r14 >= r0) goto L44
            android.view.View r2 = r13.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r2
            r2.f1942m = r1
            int r14 = r14 + 1
            goto L33
        L44:
            r14 = 0
            r13.f1918j0 = r14
            r13.f1915g0 = r1
            return
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.f1924p0
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    /* renamed from: w */
    public final void m981w(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
            int r1 = r0.f1938i
            if (r1 == r4) goto L11
            int r1 = r4 - r1
            p227n0.C4661t.m10538n(r3, r1)
            r0.f1938i = r4
        L11:
            return
    }

    /* renamed from: x */
    public final void m982x(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
            int r1 = r0.f1939j
            if (r1 == r4) goto L11
            int r1 = r4 - r1
            p227n0.C4661t.m10539o(r3, r1)
            r0.f1939j = r4
        L11:
            return
    }

    /* renamed from: y */
    public final void m983y() {
            r1 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.c.m10554b(r1)
            if (r0 == 0) goto L1e
            n0.l r0 = r1.f1926r0
            if (r0 != 0) goto L13
            androidx.coordinatorlayout.widget.CoordinatorLayout$a r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$a
            r0.<init>(r1)
            r1.f1926r0 = r0
        L13:
            n0.l r0 = r1.f1926r0
            p227n0.C4661t.h.m10616u(r1, r0)
            r0 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r0)
            goto L22
        L1e:
            r0 = 0
            p227n0.C4661t.h.m10616u(r1, r0)
        L22:
            return
    }
}
