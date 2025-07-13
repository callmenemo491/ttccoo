package bi;

/* renamed from: bi.h */
/* loaded from: classes.dex */
public final class C0784h {

    /* renamed from: c */
    public static final bi.C0784h f4251c = null;

    /* renamed from: d */
    public static final bi.C0784h.a f4252d = null;

    /* renamed from: a */
    public final java.util.Set<bi.C0784h.b> f4253a;

    /* renamed from: b */
    public final p224mi.AbstractC4634c f4254b;

    /* renamed from: bi.h$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final java.lang.String m2391a(java.security.cert.Certificate r2) {
                r1 = this;
                java.lang.String r0 = "certificate"
                p214m2.C4339q.m9706k(r2, r0)
                boolean r0 = r2 instanceof java.security.cert.X509Certificate
                if (r0 == 0) goto L21
                java.lang.String r0 = "sha256/"
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
                oi.i r2 = r1.m2392b(r2)
                java.lang.String r2 = r2.mo11583e()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
            L21:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Certificate pinning requires X509 certificates"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        /* renamed from: b */
        public final p260oi.C5287i m2392b(java.security.cert.X509Certificate r4) {
                r3 = this;
                oi.i$a r0 = p260oi.C5287i.f20505c0
                java.security.PublicKey r4 = r4.getPublicKey()
                java.lang.String r1 = "publicKey"
                p214m2.C4339q.m9705j(r4, r1)
                byte[] r4 = r4.getEncoded()
                java.lang.String r1 = "publicKey.encoded"
                p214m2.C4339q.m9705j(r4, r1)
                r1 = 0
                r2 = 3
                oi.i r4 = p260oi.C5287i.a.m11594c(r0, r4, r1, r1, r2)
                java.lang.String r0 = "SHA-256"
                oi.i r4 = r4.mo11584g(r0)
                return r4
        }
    }

    /* renamed from: bi.h$b */
    public static final class b {
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof bi.C0784h.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                bi.h$b r5 = (bi.C0784h.b) r5
                java.util.Objects.requireNonNull(r5)
                r1 = 0
                boolean r3 = p214m2.C4339q.m9702c(r1, r1)
                r3 = r3 ^ r0
                if (r3 == 0) goto L18
                return r2
            L18:
                java.util.Objects.requireNonNull(r5)
                boolean r3 = p214m2.C4339q.m9702c(r1, r1)
                r3 = r3 ^ r0
                if (r3 == 0) goto L23
                return r2
            L23:
                java.util.Objects.requireNonNull(r5)
                boolean r5 = p214m2.C4339q.m9702c(r1, r1)
                r5 = r5 ^ r0
                if (r5 == 0) goto L2e
                return r2
            L2e:
                return r0
        }

        public int hashCode() {
                r1 = this;
                r0 = 0
                throw r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
                r0.append(r1)
                r2 = 47
                r0.append(r2)
                throw r1
        }
    }

    static {
            bi.h$a r0 = new bi.h$a
            r1 = 0
            r0.<init>(r1)
            bi.C0784h.f4252d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            bi.h r2 = new bi.h
            java.util.Set r0 = p062dh.C1473i.m4011W(r0)
            r3 = 2
            r2.<init>(r0, r1, r3)
            bi.C0784h.f4251c = r2
            return
    }

    public C0784h(java.util.Set<bi.C0784h.b> r2, p224mi.AbstractC4634c r3) {
            r1 = this;
            java.lang.String r0 = "pins"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f4253a = r2
            r1.f4254b = r3
            return
    }

    public C0784h(java.util.Set r1, p224mi.AbstractC4634c r2, int r3) {
            r0 = this;
            r2 = 0
            r0.<init>()
            r0.f4253a = r1
            r0.f4254b = r2
            return
    }

    /* renamed from: a */
    public final void m2389a(java.lang.String r8, mh.InterfaceC4609a<? extends java.util.List<? extends java.security.cert.X509Certificate>> r9) {
            r7 = this;
            java.lang.String r0 = "hostname"
            p214m2.C4339q.m9706k(r8, r0)
            java.util.Set<bi.h$b> r0 = r7.f4253a
            dh.k r1 = p062dh.C1475k.f7237Y
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            r4 = r2
            bi.h$b r4 = (bi.C0784h.b) r4
            java.util.Objects.requireNonNull(r4)
            r4 = 0
            r5 = 2
            java.lang.String r6 = "**."
            boolean r6 = p362uh.C6463i.m13061R(r3, r6, r4, r5)
            if (r6 != 0) goto L50
            java.lang.String r6 = "*."
            boolean r4 = p362uh.C6463i.m13061R(r3, r6, r4, r5)
            if (r4 != 0) goto L4f
            boolean r4 = p214m2.C4339q.m9702c(r8, r3)
            if (r4 == 0) goto Ld
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L41
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L41:
            boolean r4 = r1 instanceof p259oh.InterfaceC5277a
            if (r4 != 0) goto L49
            r1.add(r2)
            goto Ld
        L49:
            java.lang.String r8 = "kotlin.collections.MutableList"
            p239nh.C4840t.m10857c(r1, r8)
            throw r3
        L4f:
            throw r3
        L50:
            throw r3
        L51:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L58
            return
        L58:
            java.lang.Object r9 = r9.mo15e()
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r0 = r9.iterator()
        L62:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r2 = r0.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.util.Iterator r2 = r1.iterator()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L79
            goto L62
        L79:
            java.lang.Object r8 = r2.next()
            bi.h$b r8 = (bi.C0784h.b) r8
            java.util.Objects.requireNonNull(r8)
            throw r3
        L83:
            java.lang.String r0 = "Certificate pinning failure!"
            java.lang.String r2 = "\n  Peer certificate chain:"
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r2)
            java.util.Iterator r9 = r9.iterator()
        L8f:
            boolean r2 = r9.hasNext()
            java.lang.String r3 = "\n    "
            if (r2 == 0) goto Lbf
            java.lang.Object r2 = r9.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r0.append(r3)
            bi.h$a r3 = bi.C0784h.f4252d
            java.lang.String r3 = r3.m2391a(r2)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r3 = "element.subjectDN"
            p214m2.C4339q.m9705j(r2, r3)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            goto L8f
        Lbf:
            java.lang.String r9 = "\n  Pinned certificates for "
            r0.append(r9)
            r0.append(r8)
            java.lang.String r8 = ":"
            r0.append(r8)
            java.util.Iterator r8 = r1.iterator()
        Ld0:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Le3
            java.lang.Object r9 = r8.next()
            bi.h$b r9 = (bi.C0784h.b) r9
            r0.append(r3)
            r0.append(r9)
            goto Ld0
        Le3:
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = "StringBuilder().apply(builderAction).toString()"
            p214m2.C4339q.m9705j(r8, r9)
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            r9.<init>(r8)
            throw r9
    }

    /* renamed from: b */
    public final bi.C0784h m2390b(p224mi.AbstractC4634c r3) {
            r2 = this;
            mi.c r0 = r2.f4254b
            boolean r0 = p214m2.C4339q.m9702c(r0, r3)
            if (r0 == 0) goto La
            r0 = r2
            goto L11
        La:
            bi.h r0 = new bi.h
            java.util.Set<bi.h$b> r1 = r2.f4253a
            r0.<init>(r1, r3)
        L11:
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof bi.C0784h
            if (r0 == 0) goto L1c
            bi.h r3 = (bi.C0784h) r3
            java.util.Set<bi.h$b> r0 = r3.f4253a
            java.util.Set<bi.h$b> r1 = r2.f4253a
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L1c
            mi.c r3 = r3.f4254b
            mi.c r0 = r2.f4254b
            boolean r3 = p214m2.C4339q.m9702c(r3, r0)
            if (r3 == 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }

    public int hashCode() {
            r2 = this;
            java.util.Set<bi.h$b> r0 = r2.f4253a
            int r0 = r0.hashCode()
            int r0 = r0 + 1517
            int r0 = r0 * 41
            mi.c r1 = r2.f4254b
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            goto L14
        L13:
            r1 = 0
        L14:
            int r0 = r0 + r1
            return r0
    }
}
