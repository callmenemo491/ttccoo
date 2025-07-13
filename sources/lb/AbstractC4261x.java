package lb;

/* renamed from: lb.x */
/* loaded from: classes.dex */
public abstract class AbstractC4261x {
    public AbstractC4261x() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static void m9568a(java.lang.Class<?> r2) {
            int r0 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isInterface(r0)
            if (r1 != 0) goto L28
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L11
            return
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Abstract class can't be instantiated! Class name: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L28:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Interface can't be instantiated! Interface name: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: b */
    public abstract <T> T mo9567b(java.lang.Class<T> r1);
}
