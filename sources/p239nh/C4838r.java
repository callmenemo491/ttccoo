package p239nh;

/* renamed from: nh.r */
/* loaded from: classes.dex */
public class C4838r {

    /* renamed from: a */
    public static final p239nh.C4839s f19233a = null;

    /* renamed from: b */
    public static final sh.InterfaceC6073b[] f19234b = null;

    static {
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> Lf
            nh.s r1 = (p239nh.C4839s) r1     // Catch: java.lang.Throwable -> Lf
            r0 = r1
            goto L10
        Lf:
        L10:
            if (r0 == 0) goto L13
            goto L18
        L13:
            nh.s r0 = new nh.s
            r0.<init>()
        L18:
            p239nh.C4838r.f19233a = r0
            r0 = 0
            sh.b[] r0 = new sh.InterfaceC6073b[r0]
            p239nh.C4838r.f19234b = r0
            return
    }

    /* renamed from: a */
    public static sh.InterfaceC6073b m10853a(java.lang.Class r1) {
            nh.s r0 = p239nh.C4838r.f19233a
            java.util.Objects.requireNonNull(r0)
            nh.d r0 = new nh.d
            r0.<init>(r1)
            return r0
    }
}
