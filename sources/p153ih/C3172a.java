package p153ih;

/* renamed from: ih.a */
/* loaded from: classes.dex */
public class C3172a {

    /* renamed from: ih.a$a */
    public static final class a {

        /* renamed from: a */
        public static final java.lang.reflect.Method f12671a = null;

        static {
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                p214m2.C4339q.m9705j(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            Le:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = p214m2.C4339q.m9702c(r7, r8)
                r8 = 1
                if (r7 == 0) goto L3a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                p214m2.C4339q.m9705j(r7, r9)
                java.lang.String r9 = "<this>"
                p214m2.C4339q.m9706k(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L33
                r5 = r7[r3]
            L33:
                boolean r5 = p214m2.C4339q.m9702c(r5, r0)
                if (r5 == 0) goto L3a
                goto L3b
            L3a:
                r8 = 0
            L3b:
                if (r8 == 0) goto L3f
                r5 = r6
                goto L42
            L3f:
                int r4 = r4 + 1
                goto Le
            L42:
                p153ih.C3172a.a.f12671a = r5
                int r0 = r1.length
            L45:
                if (r3 >= r0) goto L59
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = p214m2.C4339q.m9702c(r2, r4)
                if (r2 == 0) goto L56
                goto L59
            L56:
                int r3 = r3 + 1
                goto L45
            L59:
                return
        }
    }

    public C3172a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public void mo7610a(java.lang.Throwable r4, java.lang.Throwable r5) {
            r3 = this;
            java.lang.reflect.Method r0 = p153ih.C3172a.a.f12671a
            if (r0 == 0) goto Ld
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r0.invoke(r4, r1)
        Ld:
            return
    }

    /* renamed from: b */
    public ph.AbstractC5526c mo7611b() {
            r1 = this;
            ph.b r0 = new ph.b
            r0.<init>()
            return r0
    }
}
