package p350u3;

/* renamed from: u3.a */
/* loaded from: classes.dex */
public final class C6292a implements p385w3.InterfaceC6782d {

    /* renamed from: c */
    public static final java.lang.String f24538c = null;

    /* renamed from: d */
    public static final java.util.Set<p335t3.C6149b> f24539d = null;

    /* renamed from: e */
    public static final p350u3.C6292a f24540e = null;

    /* renamed from: f */
    public static final p350u3.C6292a f24541f = null;

    /* renamed from: a */
    public final java.lang.String f24542a;

    /* renamed from: b */
    public final java.lang.String f24543b;

    static {
            java.lang.String r0 = "hts/frbslgiggolai.o/0clgbthfra=snpoo"
            java.lang.String r1 = "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3"
            java.lang.String r0 = p064e.C1494h.m4062m(r0, r1)
            p350u3.C6292a.f24538c = r0
            java.lang.String r1 = "hts/frbslgigp.ogepscmv/ieo/eaybtho"
            java.lang.String r2 = "tp:/ieaeogn-agolai.o/1frlglgc/aclg"
            java.lang.String r1 = p064e.C1494h.m4062m(r1, r2)
            java.lang.String r2 = "AzSCki82AwsLzKd5O8zo"
            java.lang.String r3 = "IayckHiZRO1EFl1aGoK"
            java.lang.String r2 = p064e.C1494h.m4062m(r2, r3)
            java.util.HashSet r3 = new java.util.HashSet
            r4 = 2
            t3.b[] r4 = new p335t3.C6149b[r4]
            t3.b r5 = new t3.b
            java.lang.String r6 = "proto"
            r5.<init>(r6)
            r6 = 0
            r4[r6] = r5
            t3.b r5 = new t3.b
            java.lang.String r6 = "json"
            r5.<init>(r6)
            r6 = 1
            r4[r6] = r5
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.<init>(r4)
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r3)
            p350u3.C6292a.f24539d = r3
            u3.a r3 = new u3.a
            r4 = 0
            r3.<init>(r0, r4)
            p350u3.C6292a.f24540e = r3
            u3.a r0 = new u3.a
            r0.<init>(r1, r2)
            p350u3.C6292a.f24541f = r0
            return
    }

    public C6292a(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f24542a = r1
            r0.f24543b = r2
            return
    }

    /* renamed from: a */
    public static p350u3.C6292a m12924a(byte[] r3) {
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r0.<init>(r3, r1)
            java.lang.String r3 = "1$"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L4e
            r3 = 2
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r1 = "\\"
            java.lang.String r1 = java.util.regex.Pattern.quote(r1)
            java.lang.String[] r0 = r0.split(r1, r3)
            int r1 = r0.length
            if (r1 != r3) goto L46
            r3 = 0
            r3 = r0[r3]
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3e
            r1 = 1
            r0 = r0[r1]
            u3.a r1 = new u3.a
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L3a
            r0 = 0
        L3a:
            r1.<init>(r3, r0)
            return r1
        L3e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing endpoint in CCTDestination extras"
            r3.<init>(r0)
            throw r3
        L46:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Extra is not a valid encoded LegacyFlgDestination"
            r3.<init>(r0)
            throw r3
        L4e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Version marker missing from extras"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: b */
    public byte[] m12925b() {
            r4 = this;
            java.lang.String r0 = r4.f24543b
            if (r0 != 0) goto La
            java.lang.String r1 = r4.f24542a
            if (r1 != 0) goto La
            r0 = 0
            goto L33
        La:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "1$"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = r4.f24542a
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "\\"
            r1[r2] = r3
            r2 = 3
            if (r0 != 0) goto L21
            java.lang.String r0 = ""
        L21:
            r1[r2] = r0
            java.lang.String r0 = "%s%s%s%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
        L33:
            return r0
    }
}
