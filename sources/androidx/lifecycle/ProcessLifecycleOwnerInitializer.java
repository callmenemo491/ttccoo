package androidx.lifecycle;

/* loaded from: classes.dex */
public class ProcessLifecycleOwnerInitializer extends android.content.ContentProvider {
    public ProcessLifecycleOwnerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            java.util.concurrent.atomic.AtomicBoolean r1 = androidx.lifecycle.C0466s.f2561a
            r2 = 1
            boolean r1 = r1.getAndSet(r2)
            if (r1 == 0) goto Le
            goto L1c
        Le:
            android.content.Context r0 = r0.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            androidx.lifecycle.s$a r1 = new androidx.lifecycle.s$a
            r1.<init>()
            r0.registerActivityLifecycleCallbacks(r1)
        L1c:
            android.content.Context r0 = r5.getContext()
            androidx.lifecycle.i0 r1 = androidx.lifecycle.C0447i0.f2512g0
            java.util.Objects.requireNonNull(r1)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r1.f2517c0 = r3
            androidx.lifecycle.w r3 = r1.f2518d0
            androidx.lifecycle.o$b r4 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE
            r3.m1462e(r4)
            android.content.Context r0 = r0.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            androidx.lifecycle.j0 r3 = new androidx.lifecycle.j0
            r3.<init>(r1)
            r0.registerActivityLifecycleCallbacks(r3)
            return r2
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r1 = 0
            return r1
    }
}
