package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public class C0585e<T> {

    /* renamed from: h */
    public static final java.util.concurrent.Executor f3392h = null;

    /* renamed from: a */
    public final androidx.recyclerview.widget.InterfaceC0614y f3393a;

    /* renamed from: b */
    public final androidx.recyclerview.widget.C0581c<T> f3394b;

    /* renamed from: c */
    public java.util.concurrent.Executor f3395c;

    /* renamed from: d */
    public final java.util.List<androidx.recyclerview.widget.C0585e.a<T>> f3396d;

    /* renamed from: e */
    public java.util.List<T> f3397e;

    /* renamed from: f */
    public java.util.List<T> f3398f;

    /* renamed from: g */
    public int f3399g;

    /* renamed from: androidx.recyclerview.widget.e$a */
    public interface a<T> {
        /* renamed from: a */
        void mo2025a(java.util.List<T> r1, java.util.List<T> r2);
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    public static class b implements java.util.concurrent.Executor {

        /* renamed from: Y */
        public final android.os.Handler f3400Y;

        public b() {
                r2 = this;
                r2.<init>()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                r2.f3400Y = r0
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                android.os.Handler r0 = r1.f3400Y
                r0.post(r2)
                return
        }
    }

    static {
            androidx.recyclerview.widget.e$b r0 = new androidx.recyclerview.widget.e$b
            r0.<init>()
            androidx.recyclerview.widget.C0585e.f3392h = r0
            return
    }

    public C0585e(androidx.recyclerview.widget.InterfaceC0614y r2, androidx.recyclerview.widget.C0581c<T> r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f3396d = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r1.f3398f = r0
            r1.f3393a = r2
            r1.f3394b = r3
            java.util.concurrent.Executor r2 = androidx.recyclerview.widget.C0585e.f3392h
            r1.f3395c = r2
            return
    }

    /* renamed from: a */
    public final void m2024a(java.util.List<T> r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.List<androidx.recyclerview.widget.e$a<T>> r0 = r3.f3396d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.recyclerview.widget.e$a r1 = (androidx.recyclerview.widget.C0585e.a) r1
            java.util.List<T> r2 = r3.f3398f
            r1.mo2025a(r4, r2)
            goto L6
        L18:
            if (r5 == 0) goto L1d
            r5.run()
        L1d:
            return
    }
}
