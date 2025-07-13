package ck;

/* renamed from: ck.e */
/* loaded from: classes.dex */
public final class C0996e {

    /* renamed from: a */
    public static ck.C0996e.b f5092a = null;

    /* renamed from: b */
    public static boolean f5093b = false;

    /* renamed from: ck.e$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: ck.e$b */
    public static final class b extends java.lang.SecurityManager {
        public b(ck.C0996e.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.SecurityManager
        public java.lang.Class<?>[] getClassContext() {
                r1 = this;
                java.lang.Class[] r0 = super.getClassContext()
                return r0
        }
    }

    public C0996e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static final void m2728a(java.lang.String r3) {
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SLF4J: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.println(r3)
            return
    }

    /* renamed from: b */
    public static final void m2729b(java.lang.String r1, java.lang.Throwable r2) {
            java.io.PrintStream r0 = java.lang.System.err
            r0.println(r1)
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r0 = "Reported exception:"
            r1.println(r0)
            r2.printStackTrace()
            return
    }
}
