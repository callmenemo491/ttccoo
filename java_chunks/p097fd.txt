package p097fd;

/* renamed from: fd.a */
/* loaded from: classes.dex */
public final class C2139a {

    /* renamed from: a */
    public static final java.lang.String f9835a = null;

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "http.agent"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r0.append(r1)
            java.lang.String r1 = " Taco"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p097fd.C2139a.f9835a = r0
            return
    }

    /* renamed from: a */
    public static final java.lang.String m5697a(io.tacocrypto.app.EnumC3199a r1) {
            java.lang.String r0 = "token"
            p214m2.C4339q.m9706k(r1, r0)
            java.lang.String r0 = r1.f14242Y
            java.lang.String r1 = r1.f14243Z
            java.lang.String r1 = m5698b(r0, r1)
            return r1
    }

    /* renamed from: b */
    public static final java.lang.String m5698b(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "symbol"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://assets.tacostudios.io/tokens/"
            r0.append(r1)
            r0.append(r3)
            r3 = 95
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = ".png"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
