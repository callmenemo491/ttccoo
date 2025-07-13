package androidx.activity;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final java.lang.Runnable f608a;

    /* renamed from: b */
    public final java.util.ArrayDeque<androidx.activity.AbstractC0186b> f609b;

    /* renamed from: androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable */
    public class C0183xa8009b7a implements androidx.lifecycle.InterfaceC0468t, androidx.activity.InterfaceC0185a {

        /* renamed from: Y */
        public final androidx.lifecycle.AbstractC0458o f610Y;

        /* renamed from: Z */
        public final androidx.activity.AbstractC0186b f611Z;

        /* renamed from: a0 */
        public androidx.activity.InterfaceC0185a f612a0;

        /* renamed from: b0 */
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher f613b0;

        public C0183xa8009b7a(androidx.activity.OnBackPressedDispatcher r1, androidx.lifecycle.AbstractC0458o r2, androidx.activity.AbstractC0186b r3) {
                r0 = this;
                r0.f613b0 = r1
                r0.<init>()
                r0.f610Y = r2
                r0.f611Z = r3
                r2.mo1454a(r0)
                return
        }

        @Override // androidx.activity.InterfaceC0185a
        public void cancel() {
                r2 = this;
                androidx.lifecycle.o r0 = r2.f610Y
                androidx.lifecycle.w r0 = (androidx.lifecycle.C0472w) r0
                java.lang.String r1 = "removeObserver"
                r0.m1461d(r1)
                n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r0 = r0.f2563b
                r0.mo10456l(r2)
                androidx.activity.b r0 = r2.f611Z
                java.util.concurrent.CopyOnWriteArrayList<androidx.activity.a> r0 = r0.f617b
                r0.remove(r2)
                androidx.activity.a r0 = r2.f612a0
                if (r0 == 0) goto L1f
                r0.cancel()
                r0 = 0
                r2.f612a0 = r0
            L1f:
                return
        }

        @Override // androidx.lifecycle.InterfaceC0468t
        /* renamed from: d */
        public void mo435d(androidx.lifecycle.InterfaceC0471v r2, androidx.lifecycle.AbstractC0458o.b r3) {
                r1 = this;
                androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_START
                if (r3 != r2) goto L1a
                androidx.activity.OnBackPressedDispatcher r2 = r1.f613b0
                androidx.activity.b r3 = r1.f611Z
                java.util.ArrayDeque<androidx.activity.b> r0 = r2.f609b
                r0.add(r3)
                androidx.activity.OnBackPressedDispatcher$a r0 = new androidx.activity.OnBackPressedDispatcher$a
                r0.<init>(r2, r3)
                java.util.concurrent.CopyOnWriteArrayList<androidx.activity.a> r2 = r3.f617b
                r2.add(r0)
                r1.f612a0 = r0
                goto L2d
            L1a:
                androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_STOP
                if (r3 != r2) goto L26
                androidx.activity.a r2 = r1.f612a0
                if (r2 == 0) goto L2d
                r2.cancel()
                goto L2d
            L26:
                androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY
                if (r3 != r2) goto L2d
                r1.cancel()
            L2d:
                return
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0184a implements androidx.activity.InterfaceC0185a {

        /* renamed from: Y */
        public final androidx.activity.AbstractC0186b f614Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher f615Z;

        public C0184a(androidx.activity.OnBackPressedDispatcher r1, androidx.activity.AbstractC0186b r2) {
                r0 = this;
                r0.f615Z = r1
                r0.<init>()
                r0.f614Y = r2
                return
        }

        @Override // androidx.activity.InterfaceC0185a
        public void cancel() {
                r2 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r2.f615Z
                java.util.ArrayDeque<androidx.activity.b> r0 = r0.f609b
                androidx.activity.b r1 = r2.f614Y
                r0.remove(r1)
                androidx.activity.b r0 = r2.f614Y
                java.util.concurrent.CopyOnWriteArrayList<androidx.activity.a> r0 = r0.f617b
                r0.remove(r2)
                return
        }
    }

    public OnBackPressedDispatcher(java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f609b = r0
            r1.f608a = r2
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void m437a(androidx.lifecycle.InterfaceC0471v r3, androidx.activity.AbstractC0186b r4) {
            r2 = this;
            androidx.lifecycle.o r3 = r3.mo428b()
            r0 = r3
            androidx.lifecycle.w r0 = (androidx.lifecycle.C0472w) r0
            androidx.lifecycle.o$c r0 = r0.f2564c
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2546Y
            if (r0 != r1) goto Le
            return
        Le:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r0.<init>(r2, r3, r4)
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.a> r3 = r4.f617b
            r3.add(r0)
            return
    }

    /* renamed from: b */
    public void m438b() {
            r3 = this;
            java.util.ArrayDeque<androidx.activity.b> r0 = r3.f609b
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.activity.b r1 = (androidx.activity.AbstractC0186b) r1
            boolean r2 = r1.f616a
            if (r2 == 0) goto L6
            r1.mo439a()
            return
        L1a:
            java.lang.Runnable r0 = r3.f608a
            if (r0 == 0) goto L21
            r0.run()
        L21:
            return
    }
}
