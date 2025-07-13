package p371v5;

/* renamed from: v5.a */
/* loaded from: classes.dex */
public final class C6549a {
    /* renamed from: a */
    public static void m13287a(java.lang.String r2) {
            int r0 = p371v5.C6552b0.f25624a
            r1 = 18
            if (r0 < r1) goto L9
            android.os.Trace.beginSection(r2)
        L9:
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: b */
    public static void m13288b(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: c */
    public static void m13289c(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: d */
    public static int m13290d(int r0, int r1, int r2) {
            if (r0 < r1) goto L5
            if (r0 >= r2) goto L5
            return r0
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: e */
    public static void m13291e(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: f */
    public static <T> T m13292f(T r0) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    /* renamed from: g */
    public static void m13293g() {
            int r0 = p371v5.C6552b0.f25624a
            r1 = 18
            if (r0 < r1) goto L9
            android.os.Trace.endSection()
        L9:
            return
    }
}
