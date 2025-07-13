package p236n9;

import p236n9.InterfaceC4712m;

/* renamed from: n9.l */
/* loaded from: classes.dex */
public final class C4711l<T_WRAPPER extends p236n9.InterfaceC4712m<T_ENGINE>, T_ENGINE> {

    /* renamed from: c */
    public static final java.util.logging.Logger f18819c = null;

    /* renamed from: d */
    public static final java.util.List<java.security.Provider> f18820d = null;

    /* renamed from: e */
    public static final p236n9.C4711l<p236n9.InterfaceC4712m.a, javax.crypto.Cipher> f18821e = null;

    /* renamed from: f */
    public static final p236n9.C4711l<p236n9.InterfaceC4712m.b, javax.crypto.Mac> f18822f = null;

    /* renamed from: a */
    public T_WRAPPER f18823a;

    /* renamed from: b */
    public java.util.List<java.security.Provider> f18824b;

    static {
            java.lang.Class<n9.l> r0 = p236n9.C4711l.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p236n9.C4711l.f18819c = r0
            boolean r0 = p185k7.C4038x4.m9095h()
            if (r0 == 0) goto L46
            r0 = 2
            java.lang.String r1 = "GmsCore_OpenSSL"
            java.lang.String r2 = "AndroidOpenSSL"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
        L22:
            if (r4 >= r0) goto L43
            r5 = r1[r4]
            java.security.Provider r6 = java.security.Security.getProvider(r5)
            if (r6 == 0) goto L30
            r2.add(r6)
            goto L40
        L30:
            java.util.logging.Logger r6 = p236n9.C4711l.f18819c
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r5
            java.lang.String r5 = "Provider %s not available"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r6.info(r5)
        L40:
            int r4 = r4 + 1
            goto L22
        L43:
            p236n9.C4711l.f18820d = r2
            goto L4d
        L46:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p236n9.C4711l.f18820d = r0
        L4d:
            n9.l r0 = new n9.l
            n9.m$a r1 = new n9.m$a
            r1.<init>()
            r0.<init>(r1)
            p236n9.C4711l.f18821e = r0
            n9.l r0 = new n9.l
            n9.m$b r1 = new n9.m$b
            r1.<init>()
            r0.<init>(r1)
            p236n9.C4711l.f18822f = r0
            return
    }

    public C4711l(T_WRAPPER r1) {
            r0 = this;
            r0.<init>()
            r0.f18823a = r1
            java.util.List<java.security.Provider> r1 = p236n9.C4711l.f18820d
            r0.f18824b = r1
            return
    }

    /* renamed from: a */
    public T_ENGINE m10770a(java.lang.String r6) {
            r5 = this;
            java.util.List<java.security.Provider> r0 = r5.f18824b
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r0.next()
            java.security.Provider r3 = (java.security.Provider) r3
            T_WRAPPER extends n9.m<T_ENGINE> r4 = r5.f18823a     // Catch: java.lang.Exception -> L1b
            java.lang.Object r6 = r4.mo10771a(r6, r3)     // Catch: java.lang.Exception -> L1b
            return r6
        L1b:
            r3 = move-exception
            if (r2 != 0) goto L8
            r2 = r3
            goto L8
        L20:
            T_WRAPPER extends n9.m<T_ENGINE> r0 = r5.f18823a
            java.lang.Object r6 = r0.mo10771a(r6, r1)
            return r6
    }
}
