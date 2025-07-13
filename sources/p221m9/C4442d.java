package p221m9;

/* renamed from: m9.d */
/* loaded from: classes.dex */
public final class C4442d {

    /* renamed from: a */
    public static final java.lang.Class<?> f18118a = null;

    /* renamed from: b */
    public static final boolean f18119b = false;

    static {
            java.lang.String r0 = "libcore.io.Memory"
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L8
            goto L9
        L8:
            r0 = r1
        L9:
            p221m9.C4442d.f18118a = r0
            java.lang.String r0 = "org.robolectric.Robolectric"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L12
            goto L13
        L12:
        L13:
            if (r1 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            p221m9.C4442d.f18119b = r0
            return
    }

    /* renamed from: a */
    public static boolean m9915a() {
            java.lang.Class<?> r0 = p221m9.C4442d.f18118a
            if (r0 == 0) goto La
            boolean r0 = p221m9.C4442d.f18119b
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
