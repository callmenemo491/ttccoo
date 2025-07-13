package androidx.fragment.app;

/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
public class C0419z {

    /* renamed from: a */
    public static final p319s.C5941h<java.lang.ClassLoader, p319s.C5941h<java.lang.String, java.lang.Class<?>>> f2424a = null;

    static {
            s.h r0 = new s.h
            r0.<init>()
            androidx.fragment.app.C0419z.f2424a = r0
            return
    }

    public C0419z() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: b */
    public static java.lang.Class<?> m1402b(java.lang.ClassLoader r3, java.lang.String r4) {
            s.h<java.lang.ClassLoader, s.h<java.lang.String, java.lang.Class<?>>> r0 = androidx.fragment.app.C0419z.f2424a
            r1 = 0
            java.lang.Object r2 = r0.getOrDefault(r3, r1)
            s.h r2 = (p319s.C5941h) r2
            if (r2 != 0) goto L13
            s.h r2 = new s.h
            r2.<init>()
            r0.put(r3, r2)
        L13:
            java.lang.Object r0 = r2.getOrDefault(r4, r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L23
            r0 = 0
            java.lang.Class r0 = java.lang.Class.forName(r4, r0, r3)
            r2.put(r4, r0)
        L23:
            return r0
    }

    /* renamed from: c */
    public static java.lang.Class<? extends androidx.fragment.app.ComponentCallbacksC0395n> m1403c(java.lang.ClassLoader r3, java.lang.String r4) {
            java.lang.String r0 = "Unable to instantiate fragment "
            java.lang.Class r3 = m1402b(r3, r4)     // Catch: java.lang.ClassCastException -> L7 java.lang.ClassNotFoundException -> L14
            return r3
        L7:
            r3 = move-exception
            androidx.fragment.app.n$e r1 = new androidx.fragment.app.n$e
            java.lang.String r2 = ": make sure class is a valid subclass of Fragment"
            java.lang.String r4 = android.support.v4.media.C0145d.m257a(r0, r4, r2)
            r1.<init>(r4, r3)
            throw r1
        L14:
            r3 = move-exception
            androidx.fragment.app.n$e r1 = new androidx.fragment.app.n$e
            java.lang.String r2 = ": make sure class name exists"
            java.lang.String r4 = android.support.v4.media.C0145d.m257a(r0, r4, r2)
            r1.<init>(r4, r3)
            throw r1
    }

    /* renamed from: a */
    public androidx.fragment.app.ComponentCallbacksC0395n mo1196a(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
