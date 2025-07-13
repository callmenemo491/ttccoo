package androidx.databinding;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends androidx.databinding.C0354a implements p383w1.InterfaceC6776a {

    /* renamed from: n */
    public static final boolean f1998n = true;

    /* renamed from: o */
    public static final androidx.databinding.InterfaceC0356c f1999o = null;

    /* renamed from: p */
    public static final java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> f2000p = null;

    /* renamed from: q */
    public static final android.view.View.OnAttachStateChangeListener f2001q = null;

    /* renamed from: b */
    public final java.lang.Runnable f2002b;

    /* renamed from: c */
    public boolean f2003c;

    /* renamed from: d */
    public androidx.databinding.C0364k[] f2004d;

    /* renamed from: e */
    public final android.view.View f2005e;

    /* renamed from: f */
    public boolean f2006f;

    /* renamed from: g */
    public android.view.Choreographer f2007g;

    /* renamed from: h */
    public final android.view.Choreographer.FrameCallback f2008h;

    /* renamed from: i */
    public android.os.Handler f2009i;

    /* renamed from: j */
    public final androidx.databinding.InterfaceC0358e f2010j;

    /* renamed from: k */
    public androidx.lifecycle.InterfaceC0471v f2011k;

    /* renamed from: l */
    public androidx.databinding.ViewDataBinding.OnStartListener f2012l;

    /* renamed from: m */
    public boolean f2013m;

    public static class OnStartListener implements androidx.lifecycle.InterfaceC0470u {

        /* renamed from: Y */
        public final java.lang.ref.WeakReference<androidx.databinding.ViewDataBinding> f2014Y;

        public OnStartListener(androidx.databinding.ViewDataBinding r1, androidx.databinding.ViewDataBinding.C0349a r2) {
                r0 = this;
                r0.<init>()
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r1)
                r0.f2014Y = r2
                return
        }

        @androidx.lifecycle.InterfaceC0441f0(androidx.lifecycle.AbstractC0458o.b.ON_START)
        public void onStart() {
                r1 = this;
                java.lang.ref.WeakReference<androidx.databinding.ViewDataBinding> r0 = r1.f2014Y
                java.lang.Object r0 = r0.get()
                androidx.databinding.ViewDataBinding r0 = (androidx.databinding.ViewDataBinding) r0
                if (r0 == 0) goto Ld
                r0.m1055f()
            Ld:
                return
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    public class C0349a implements androidx.databinding.InterfaceC0356c {
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    public class C0350b implements androidx.databinding.InterfaceC0356c {
        public C0350b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.databinding.InterfaceC0356c
        /* renamed from: a */
        public androidx.databinding.C0364k mo1062a(androidx.databinding.ViewDataBinding r2, int r3, java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r4) {
                r1 = this;
                androidx.databinding.ViewDataBinding$e r0 = new androidx.databinding.ViewDataBinding$e
                r0.<init>(r2, r3, r4)
                androidx.databinding.k<androidx.lifecycle.LiveData<?>> r2 = r0.f2016a
                return r2
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    public class ViewOnAttachStateChangeListenerC0351c implements android.view.View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0351c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @android.annotation.TargetApi(19)
        public void onViewAttachedToWindow(android.view.View r2) {
                r1 = this;
                if (r2 == 0) goto Lc
                r0 = 2131362083(0x7f0a0123, float:1.8343937E38)
                java.lang.Object r0 = r2.getTag(r0)
                androidx.databinding.ViewDataBinding r0 = (androidx.databinding.ViewDataBinding) r0
                goto Ld
            Lc:
                r0 = 0
            Ld:
                java.lang.Runnable r0 = r0.f2002b
                r0.run()
                r2.removeOnAttachStateChangeListener(r1)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    public class RunnableC0352d implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.databinding.ViewDataBinding f2015Y;

        public RunnableC0352d(androidx.databinding.ViewDataBinding r1) {
                r0 = this;
                r0.f2015Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                monitor-enter(r2)
                androidx.databinding.ViewDataBinding r0 = r2.f2015Y     // Catch: java.lang.Throwable -> L3a
                r1 = 0
                r0.f2003c = r1     // Catch: java.lang.Throwable -> L3a
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            L7:
                java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r0 = androidx.databinding.ViewDataBinding.f2000p
                java.lang.ref.Reference r0 = r0.poll()
                if (r0 == 0) goto L19
                boolean r1 = r0 instanceof androidx.databinding.C0364k
                if (r1 == 0) goto L7
                androidx.databinding.k r0 = (androidx.databinding.C0364k) r0
                r0.m1071a()
                goto L7
            L19:
                androidx.databinding.ViewDataBinding r0 = r2.f2015Y
                android.view.View r0 = r0.f2005e
                boolean r0 = r0.isAttachedToWindow()
                if (r0 != 0) goto L34
                androidx.databinding.ViewDataBinding r0 = r2.f2015Y
                android.view.View r0 = r0.f2005e
                android.view.View$OnAttachStateChangeListener r1 = androidx.databinding.ViewDataBinding.f2001q
                r0.removeOnAttachStateChangeListener(r1)
                androidx.databinding.ViewDataBinding r0 = r2.f2015Y
                android.view.View r0 = r0.f2005e
                r0.addOnAttachStateChangeListener(r1)
                return
            L34:
                androidx.databinding.ViewDataBinding r0 = r2.f2015Y
                r0.m1055f()
                return
            L3a:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
                throw r0
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    public static class C0353e implements androidx.lifecycle.InterfaceC0439e0, androidx.databinding.InterfaceC0361h<androidx.lifecycle.LiveData<?>> {

        /* renamed from: a */
        public final androidx.databinding.C0364k<androidx.lifecycle.LiveData<?>> f2016a;

        /* renamed from: b */
        public java.lang.ref.WeakReference<androidx.lifecycle.InterfaceC0471v> f2017b;

        public C0353e(androidx.databinding.ViewDataBinding r2, int r3, java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f2017b = r0
                androidx.databinding.k r0 = new androidx.databinding.k
                r0.<init>(r2, r3, r1, r4)
                r1.f2016a = r0
                return
        }

        @Override // androidx.databinding.InterfaceC0361h
        /* renamed from: a */
        public void mo1063a(androidx.lifecycle.LiveData<?> r1) {
                r0 = this;
                androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
                r1.mo6k(r0)
                return
        }

        @Override // androidx.databinding.InterfaceC0361h
        /* renamed from: b */
        public void mo1064b(androidx.lifecycle.LiveData<?> r2) {
                r1 = this;
                androidx.lifecycle.LiveData r2 = (androidx.lifecycle.LiveData) r2
                java.lang.ref.WeakReference<androidx.lifecycle.v> r0 = r1.f2017b
                if (r0 != 0) goto L8
                r0 = 0
                goto Le
            L8:
                java.lang.Object r0 = r0.get()
                androidx.lifecycle.v r0 = (androidx.lifecycle.InterfaceC0471v) r0
            Le:
                if (r0 == 0) goto L13
                r2.m1413f(r0, r1)
            L13:
                return
        }

        @Override // androidx.databinding.InterfaceC0361h
        /* renamed from: c */
        public void mo1065c(androidx.lifecycle.InterfaceC0471v r3) {
                r2 = this;
                java.lang.ref.WeakReference<androidx.lifecycle.v> r0 = r2.f2017b
                if (r0 != 0) goto L6
                r0 = 0
                goto Lc
            L6:
                java.lang.Object r0 = r0.get()
                androidx.lifecycle.v r0 = (androidx.lifecycle.InterfaceC0471v) r0
            Lc:
                androidx.databinding.k<androidx.lifecycle.LiveData<?>> r1 = r2.f2016a
                T r1 = r1.f2023c
                androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
                if (r1 == 0) goto L1e
                if (r0 == 0) goto L19
                r1.mo6k(r2)
            L19:
                if (r3 == 0) goto L1e
                r1.m1413f(r3, r2)
            L1e:
                if (r3 == 0) goto L27
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r3)
                r2.f2017b = r0
            L27:
                return
        }

        @Override // androidx.lifecycle.InterfaceC0439e0
        /* renamed from: d */
        public void mo124d(java.lang.Object r5) {
                r4 = this;
                androidx.databinding.k<androidx.lifecycle.LiveData<?>> r5 = r4.f2016a
                java.lang.Object r0 = r5.get()
                androidx.databinding.ViewDataBinding r0 = (androidx.databinding.ViewDataBinding) r0
                if (r0 != 0) goto Ld
                r5.m1071a()
            Ld:
                if (r0 == 0) goto L23
                androidx.databinding.k<androidx.lifecycle.LiveData<?>> r5 = r4.f2016a
                int r1 = r5.f2022b
                T r5 = r5.f2023c
                r2 = 0
                boolean r3 = r0.f2013m
                if (r3 != 0) goto L23
                boolean r5 = r0.mo1057l(r1, r5, r2)
                if (r5 == 0) goto L23
                r0.m1059o()
            L23:
                return
        }
    }

    static {
            androidx.databinding.ViewDataBinding$b r0 = new androidx.databinding.ViewDataBinding$b
            r0.<init>()
            androidx.databinding.ViewDataBinding.f1999o = r0
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            androidx.databinding.ViewDataBinding.f2000p = r0
            androidx.databinding.ViewDataBinding$c r0 = new androidx.databinding.ViewDataBinding$c
            r0.<init>()
            androidx.databinding.ViewDataBinding.f2001q = r0
            return
    }

    public ViewDataBinding(java.lang.Object r2, android.view.View r3, int r4) {
            r1 = this;
            androidx.databinding.e r2 = m1047d(r2)
            r1.<init>()
            androidx.databinding.ViewDataBinding$d r0 = new androidx.databinding.ViewDataBinding$d
            r0.<init>(r1)
            r1.f2002b = r0
            r0 = 0
            r1.f2003c = r0
            r1.f2010j = r2
            androidx.databinding.k[] r2 = new androidx.databinding.C0364k[r4]
            r1.f2004d = r2
            r1.f2005e = r3
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 == 0) goto L40
            boolean r2 = androidx.databinding.ViewDataBinding.f1998n
            if (r2 == 0) goto L31
            android.view.Choreographer r2 = android.view.Choreographer.getInstance()
            r1.f2007g = r2
            androidx.databinding.j r2 = new androidx.databinding.j
            r2.<init>(r1)
            r1.f2008h = r2
            goto L3f
        L31:
            r2 = 0
            r1.f2008h = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.myLooper()
            r2.<init>(r3)
            r1.f2009i = r2
        L3f:
            return
        L40:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "DataBinding must be created in view's UI Thread"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: d */
    public static androidx.databinding.InterfaceC0358e m1047d(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1 instanceof androidx.databinding.InterfaceC0358e
            if (r0 == 0) goto Lb
            androidx.databinding.e r1 = (androidx.databinding.InterfaceC0358e) r1
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: h */
    public static <T extends androidx.databinding.ViewDataBinding> T m1048h(android.view.LayoutInflater r4, int r5, android.view.ViewGroup r6, boolean r7, java.lang.Object r8) {
            androidx.databinding.e r8 = m1047d(r8)
            androidx.databinding.d r0 = androidx.databinding.C0359f.f2019a
            r0 = 0
            r1 = 1
            if (r6 == 0) goto Le
            if (r7 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L16
            int r3 = r6.getChildCount()
            goto L17
        L16:
            r3 = 0
        L17:
            android.view.View r4 = r4.inflate(r5, r6, r7)
            if (r2 == 0) goto L45
            int r4 = r6.getChildCount()
            int r7 = r4 - r3
            if (r7 != r1) goto L2f
            int r4 = r4 - r1
            android.view.View r4 = r6.getChildAt(r4)
            androidx.databinding.ViewDataBinding r4 = androidx.databinding.C0359f.m1069a(r8, r4, r5)
            goto L49
        L2f:
            android.view.View[] r4 = new android.view.View[r7]
        L31:
            if (r0 >= r7) goto L3e
            int r1 = r0 + r3
            android.view.View r1 = r6.getChildAt(r1)
            r4[r0] = r1
            int r0 = r0 + 1
            goto L31
        L3e:
            androidx.databinding.d r6 = androidx.databinding.C0359f.f2019a
            androidx.databinding.ViewDataBinding r4 = r6.mo1044c(r8, r4, r5)
            goto L49
        L45:
            androidx.databinding.ViewDataBinding r4 = androidx.databinding.C0359f.m1069a(r8, r4, r5)
        L49:
            return r4
    }

    /* renamed from: i */
    public static boolean m1049i(java.lang.String r3, int r4) {
            int r0 = r3.length()
            r1 = 0
            if (r0 != r4) goto L8
            return r1
        L8:
            if (r4 >= r0) goto L18
            char r2 = r3.charAt(r4)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 != 0) goto L15
            return r1
        L15:
            int r4 = r4 + 1
            goto L8
        L18:
            r3 = 1
            return r3
    }

    /* renamed from: j */
    public static void m1050j(androidx.databinding.InterfaceC0358e r4, android.view.View r5, java.lang.Object[] r6, android.util.SparseIntArray r7, boolean r8) {
            r0 = 0
            if (r5 == 0) goto Ld
            r1 = 2131362083(0x7f0a0123, float:1.8343937E38)
            java.lang.Object r1 = r5.getTag(r1)
            androidx.databinding.ViewDataBinding r1 = (androidx.databinding.ViewDataBinding) r1
            goto Le
        Ld:
            r1 = r0
        Le:
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r5.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L1c
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        L1c:
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L44
            if (r0 == 0) goto L44
            java.lang.String r8 = "layout"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L44
            r8 = 95
            int r8 = r0.lastIndexOf(r8)
            if (r8 <= 0) goto L5b
            int r8 = r8 + r1
            boolean r3 = m1049i(r0, r8)
            if (r3 == 0) goto L5b
            int r8 = m1052m(r0, r8)
            r0 = r6[r8]
            if (r0 != 0) goto L5c
            r6[r8] = r5
            goto L5c
        L44:
            if (r0 == 0) goto L5b
            java.lang.String r8 = "binding_"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L5b
            r8 = 8
            int r8 = m1052m(r0, r8)
            r0 = r6[r8]
            if (r0 != 0) goto L5c
            r6[r8] = r5
            goto L5c
        L5b:
            r1 = 0
        L5c:
            if (r1 != 0) goto L73
            int r8 = r5.getId()
            if (r8 <= 0) goto L73
            if (r7 == 0) goto L73
            r0 = -1
            int r8 = r7.get(r8, r0)
            if (r8 < 0) goto L73
            r0 = r6[r8]
            if (r0 != 0) goto L73
            r6[r8] = r5
        L73:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L8a
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r8 = r5.getChildCount()
            r0 = 0
        L7e:
            if (r0 >= r8) goto L8a
            android.view.View r1 = r5.getChildAt(r0)
            m1050j(r4, r1, r6, r7, r2)
            int r0 = r0 + 1
            goto L7e
        L8a:
            return
    }

    /* renamed from: k */
    public static java.lang.Object[] m1051k(androidx.databinding.InterfaceC0358e r1, android.view.View r2, int r3, android.util.SparseIntArray r4) {
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 1
            m1050j(r1, r2, r3, r4, r0)
            return r3
    }

    /* renamed from: m */
    public static int m1052m(java.lang.String r3, int r4) {
            int r0 = r3.length()
            r1 = 0
        L5:
            if (r4 >= r0) goto L13
            int r1 = r1 * 10
            char r2 = r3.charAt(r4)
            int r2 = r2 + (-48)
            int r1 = r1 + r2
            int r4 = r4 + 1
            goto L5
        L13:
            return r1
    }

    @Override // p383w1.InterfaceC6776a
    /* renamed from: b */
    public android.view.View mo1053b() {
            r1 = this;
            android.view.View r0 = r1.f2005e
            return r0
    }

    /* renamed from: e */
    public abstract void mo1054e();

    /* renamed from: f */
    public void m1055f() {
            r1 = this;
            boolean r0 = r1.f2006f
            if (r0 == 0) goto L8
            r1.m1059o()
            goto L18
        L8:
            boolean r0 = r1.mo1056g()
            if (r0 != 0) goto Lf
            goto L18
        Lf:
            r0 = 1
            r1.f2006f = r0
            r0 = 0
            r1.mo1054e()
            r1.f2006f = r0
        L18:
            return
    }

    /* renamed from: g */
    public abstract boolean mo1056g();

    /* renamed from: l */
    public abstract boolean mo1057l(int r1, java.lang.Object r2, int r3);

    /* renamed from: n */
    public void m1058n(int r2, java.lang.Object r3, androidx.databinding.InterfaceC0356c r4) {
            r1 = this;
            androidx.databinding.k[] r0 = r1.f2004d
            r0 = r0[r2]
            if (r0 != 0) goto L19
            java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r0 = androidx.databinding.ViewDataBinding.f2000p
            androidx.databinding.k r0 = r4.mo1062a(r1, r2, r0)
            androidx.databinding.k[] r4 = r1.f2004d
            r4[r2] = r0
            androidx.lifecycle.v r2 = r1.f2011k
            if (r2 == 0) goto L19
            androidx.databinding.h<T> r4 = r0.f2021a
            r4.mo1065c(r2)
        L19:
            r0.m1071a()
            r0.f2023c = r3
            androidx.databinding.h<T> r2 = r0.f2021a
            r2.mo1064b(r3)
            return
    }

    /* renamed from: o */
    public void m1059o() {
            r3 = this;
            androidx.lifecycle.v r0 = r3.f2011k
            r1 = 1
            if (r0 == 0) goto L1b
            androidx.lifecycle.o r0 = r0.mo428b()
            androidx.lifecycle.w r0 = (androidx.lifecycle.C0472w) r0
            androidx.lifecycle.o$c r0 = r0.f2564c
            androidx.lifecycle.o$c r2 = androidx.lifecycle.AbstractC0458o.c.f2549b0
            int r0 = r0.compareTo(r2)
            if (r0 < 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1b
            return
        L1b:
            monitor-enter(r3)
            boolean r0 = r3.f2003c     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L22
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            return
        L22:
            r3.f2003c = r1     // Catch: java.lang.Throwable -> L39
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            boolean r0 = androidx.databinding.ViewDataBinding.f1998n
            if (r0 == 0) goto L31
            android.view.Choreographer r0 = r3.f2007g
            android.view.Choreographer$FrameCallback r1 = r3.f2008h
            r0.postFrameCallback(r1)
            goto L38
        L31:
            android.os.Handler r0 = r3.f2009i
            java.lang.Runnable r1 = r3.f2002b
            r0.post(r1)
        L38:
            return
        L39:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r0
    }

    /* renamed from: p */
    public void m1060p(androidx.lifecycle.InterfaceC0471v r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.fragment.app.ComponentCallbacksC0395n
            if (r0 == 0) goto Lb
            java.lang.String r0 = "DataBinding"
            java.lang.String r1 = "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle"
            android.util.Log.w(r0, r1)
        Lb:
            androidx.lifecycle.v r0 = r4.f2011k
            if (r0 != r5) goto L10
            return
        L10:
            if (r0 == 0) goto L1b
            androidx.lifecycle.o r0 = r0.mo428b()
            androidx.databinding.ViewDataBinding$OnStartListener r1 = r4.f2012l
            r0.mo1455b(r1)
        L1b:
            r4.f2011k = r5
            if (r5 == 0) goto L38
            androidx.databinding.ViewDataBinding$OnStartListener r0 = r4.f2012l
            if (r0 != 0) goto L2b
            androidx.databinding.ViewDataBinding$OnStartListener r0 = new androidx.databinding.ViewDataBinding$OnStartListener
            r1 = 0
            r0.<init>(r4, r1)
            r4.f2012l = r0
        L2b:
            r0 = r5
            androidx.fragment.app.y0 r0 = (androidx.fragment.app.C0418y0) r0
            r0.m1401c()
            androidx.lifecycle.w r0 = r0.f2422Z
            androidx.databinding.ViewDataBinding$OnStartListener r1 = r4.f2012l
            r0.mo1454a(r1)
        L38:
            androidx.databinding.k[] r0 = r4.f2004d
            int r1 = r0.length
            r2 = 0
        L3c:
            if (r2 >= r1) goto L4a
            r3 = r0[r2]
            if (r3 == 0) goto L47
            androidx.databinding.h<T> r3 = r3.f2021a
            r3.mo1065c(r5)
        L47:
            int r2 = r2 + 1
            goto L3c
        L4a:
            return
    }

    /* renamed from: q */
    public boolean m1061q(int r6, androidx.lifecycle.LiveData<?> r7) {
            r5 = this;
            r0 = 1
            r5.f2013m = r0
            r1 = 0
            androidx.databinding.c r2 = androidx.databinding.ViewDataBinding.f1999o     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L16
            androidx.databinding.k[] r7 = r5.f2004d     // Catch: java.lang.Throwable -> L30
            r6 = r7[r6]     // Catch: java.lang.Throwable -> L30
            if (r6 == 0) goto L14
            boolean r6 = r6.m1071a()     // Catch: java.lang.Throwable -> L30
            r0 = r6
            goto L2d
        L14:
            r0 = 0
            goto L2d
        L16:
            androidx.databinding.k[] r3 = r5.f2004d     // Catch: java.lang.Throwable -> L30
            r4 = r3[r6]     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L20
        L1c:
            r5.m1058n(r6, r7, r2)     // Catch: java.lang.Throwable -> L30
            goto L2d
        L20:
            T r4 = r4.f2023c     // Catch: java.lang.Throwable -> L30
            if (r4 != r7) goto L25
            goto L14
        L25:
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L1c
            r3.m1071a()     // Catch: java.lang.Throwable -> L30
            goto L1c
        L2d:
            r5.f2013m = r1
            return r0
        L30:
            r6 = move-exception
            r5.f2013m = r1
            throw r6
    }
}
