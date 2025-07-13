package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.AbstractC0546b0;

/* renamed from: androidx.recyclerview.widget.x */
/* loaded from: classes.dex */
public abstract class AbstractC0613x<T, VH extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<VH> {

    /* renamed from: d */
    public final androidx.recyclerview.widget.C0585e<T> f3640d;

    /* renamed from: e */
    public final androidx.recyclerview.widget.C0585e.a<T> f3641e;

    /* renamed from: androidx.recyclerview.widget.x$a */
    public class a implements androidx.recyclerview.widget.C0585e.a<java.lang.Object> {

        /* renamed from: a */
        public final /* synthetic */ androidx.recyclerview.widget.AbstractC0613x f3642a;

        public a(androidx.recyclerview.widget.AbstractC0613x r1) {
                r0 = this;
                r0.f3642a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0585e.a
        /* renamed from: a */
        public void mo2025a(java.util.List<java.lang.Object> r1, java.util.List<java.lang.Object> r2) {
                r0 = this;
                androidx.recyclerview.widget.x r1 = r0.f3642a
                java.util.Objects.requireNonNull(r1)
                return
        }
    }

    public AbstractC0613x(androidx.recyclerview.widget.C0604o.e<T> r7) {
            r6 = this;
            r6.<init>()
            androidx.recyclerview.widget.x$a r0 = new androidx.recyclerview.widget.x$a
            r0.<init>(r6)
            r6.f3641e = r0
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            androidx.recyclerview.widget.b r2 = new androidx.recyclerview.widget.b
            r2.<init>(r6)
            androidx.recyclerview.widget.c$a r3 = new androidx.recyclerview.widget.c$a
            r3.<init>(r7)
            java.util.concurrent.Executor r4 = r3.f3378a
            if (r4 != 0) goto L31
            java.lang.Object r4 = androidx.recyclerview.widget.C0581c.a.f3376c
            monitor-enter(r4)
            java.util.concurrent.Executor r5 = androidx.recyclerview.widget.C0581c.a.f3377d     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L28
            r5 = 2
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newFixedThreadPool(r5)     // Catch: java.lang.Throwable -> L2e
            androidx.recyclerview.widget.C0581c.a.f3377d = r5     // Catch: java.lang.Throwable -> L2e
        L28:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.Executor r4 = androidx.recyclerview.widget.C0581c.a.f3377d
            r3.f3378a = r4
            goto L31
        L2e:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            throw r7
        L31:
            androidx.recyclerview.widget.c r4 = new androidx.recyclerview.widget.c
            r5 = 0
            java.util.concurrent.Executor r3 = r3.f3378a
            r4.<init>(r5, r3, r7)
            r1.<init>(r2, r4)
            r6.f3640d = r1
            java.util.List<androidx.recyclerview.widget.e$a<T>> r7 = r1.f3396d
            r7.add(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            androidx.recyclerview.widget.e<T> r0 = r1.f3640d
            java.util.List<T> r0 = r0.f3398f
            int r0 = r0.size()
            return r0
    }

    /* renamed from: i */
    public void m2140i(java.util.List<T> r9) {
            r8 = this;
            androidx.recyclerview.widget.e<T> r1 = r8.f3640d
            int r0 = r1.f3399g
            int r4 = r0 + 1
            r1.f3399g = r4
            java.util.List<T> r2 = r1.f3397e
            if (r9 != r2) goto Ld
            goto L4b
        Ld:
            java.util.List<T> r0 = r1.f3398f
            r3 = 0
            r5 = 0
            if (r9 != 0) goto L25
            int r9 = r2.size()
            r1.f3397e = r5
            java.util.List r2 = java.util.Collections.emptyList()
            r1.f3398f = r2
            androidx.recyclerview.widget.y r2 = r1.f3393a
            r2.mo2011a(r3, r9)
            goto L38
        L25:
            if (r2 != 0) goto L3c
            r1.f3397e = r9
            java.util.List r2 = java.util.Collections.unmodifiableList(r9)
            r1.f3398f = r2
            androidx.recyclerview.widget.y r2 = r1.f3393a
            int r9 = r9.size()
            r2.mo2013c(r3, r9)
        L38:
            r1.m2024a(r0, r5)
            goto L4b
        L3c:
            androidx.recyclerview.widget.c<T> r0 = r1.f3394b
            java.util.concurrent.Executor r6 = r0.f3374a
            androidx.recyclerview.widget.d r7 = new androidx.recyclerview.widget.d
            r5 = 0
            r0 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.execute(r7)
        L4b:
            return
    }
}
