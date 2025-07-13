package p292qd;

/* renamed from: qd.e */
/* loaded from: classes.dex */
public final class C5621e {

    /* renamed from: a */
    public final android.content.Context f21865a;

    /* renamed from: b */
    public final android.content.pm.PackageManager f21866b;

    /* renamed from: c */
    public final java.util.Map<java.lang.String, p292qd.C5621e.b> f21867c;

    /* renamed from: d */
    public final java.lang.String f21868d;

    /* renamed from: e */
    public final java.util.Map<java.lang.String, ch.C0978e<java.lang.Integer, java.lang.Boolean>> f21869e;

    /* renamed from: qd.e$a */
    public static final class a {

        /* renamed from: a */
        public final java.lang.String f21870a;

        /* renamed from: b */
        public final java.lang.String f21871b;

        /* renamed from: c */
        public final int f21872c;

        /* renamed from: d */
        public final java.lang.String f21873d;

        /* renamed from: e */
        public final java.util.Set<java.lang.String> f21874e;

        public a(java.lang.String r2, java.lang.String r3, int r4, java.lang.String r5, java.util.Set<java.lang.String> r6) {
                r1 = this;
                java.lang.String r0 = "name"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "packageName"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.f21870a = r2
                r1.f21871b = r3
                r1.f21872c = r4
                r1.f21873d = r5
                r1.f21874e = r6
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p292qd.C5621e.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                qd.e$a r5 = (p292qd.C5621e.a) r5
                java.lang.String r1 = r4.f21870a
                java.lang.String r3 = r5.f21870a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.f21871b
                java.lang.String r3 = r5.f21871b
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                int r1 = r4.f21872c
                int r3 = r5.f21872c
                if (r1 == r3) goto L29
                return r2
            L29:
                java.lang.String r1 = r4.f21873d
                java.lang.String r3 = r5.f21873d
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L34
                return r2
            L34:
                java.util.Set<java.lang.String> r1 = r4.f21874e
                java.util.Set<java.lang.String> r5 = r5.f21874e
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L3f
                return r2
            L3f:
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f21870a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r3.f21871b
                r2 = 31
                int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
                int r1 = r3.f21872c
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.f21873d
                if (r1 != 0) goto L1b
                r1 = 0
                goto L1f
            L1b:
                int r1 = r1.hashCode()
            L1f:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.Set<java.lang.String> r1 = r3.f21874e
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "CallerPackageInfo(name="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r2.f21870a
                r0.append(r1)
                java.lang.String r1 = ", packageName="
                r0.append(r1)
                java.lang.String r1 = r2.f21871b
                r0.append(r1)
                java.lang.String r1 = ", uid="
                r0.append(r1)
                int r1 = r2.f21872c
                r0.append(r1)
                java.lang.String r1 = ", signature="
                r0.append(r1)
                java.lang.String r1 = r2.f21873d
                r0.append(r1)
                java.lang.String r1 = ", permissions="
                r0.append(r1)
                java.util.Set<java.lang.String> r1 = r2.f21874e
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: qd.e$b */
    public static final class b {

        /* renamed from: a */
        public final java.lang.String f21875a;

        /* renamed from: b */
        public final java.lang.String f21876b;

        /* renamed from: c */
        public final java.util.Set<p292qd.C5621e.c> f21877c;

        public b(java.lang.String r1, java.lang.String r2, java.util.Set<p292qd.C5621e.c> r3) {
                r0 = this;
                r0.<init>()
                r0.f21875a = r1
                r0.f21876b = r2
                r0.f21877c = r3
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p292qd.C5621e.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                qd.e$b r5 = (p292qd.C5621e.b) r5
                java.lang.String r1 = r4.f21875a
                java.lang.String r3 = r5.f21875a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.f21876b
                java.lang.String r3 = r5.f21876b
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.util.Set<qd.e$c> r1 = r4.f21877c
                java.util.Set<qd.e$c> r5 = r5.f21877c
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f21875a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r3.f21876b
                r2 = 31
                int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
                java.util.Set<qd.e$c> r1 = r3.f21877c
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "KnownCallerInfo(name="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r2.f21875a
                r0.append(r1)
                java.lang.String r1 = ", packageName="
                r0.append(r1)
                java.lang.String r1 = r2.f21876b
                r0.append(r1)
                java.lang.String r1 = ", signatures="
                r0.append(r1)
                java.util.Set<qd.e$c> r1 = r2.f21877c
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: qd.e$c */
    public static final class c {

        /* renamed from: a */
        public final java.lang.String f21878a;

        /* renamed from: b */
        public final boolean f21879b;

        public c(java.lang.String r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.f21878a = r1
                r0.f21879b = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p292qd.C5621e.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                qd.e$c r5 = (p292qd.C5621e.c) r5
                java.lang.String r1 = r4.f21878a
                java.lang.String r3 = r5.f21878a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                boolean r1 = r4.f21879b
                boolean r5 = r5.f21879b
                if (r1 == r5) goto L1e
                return r2
            L1e:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.f21878a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                boolean r1 = r2.f21879b
                if (r1 == 0) goto Ld
                r1 = 1
            Ld:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "KnownSignature(signature="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r2.f21878a
                r0.append(r1)
                java.lang.String r1 = ", release="
                r0.append(r1)
                boolean r1 = r2.f21879b
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: qd.e$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Byte, java.lang.CharSequence> {

        /* renamed from: Z */
        public static final p292qd.C5621e.d f21880Z = null;

        static {
                qd.e$d r0 = new qd.e$d
                r0.<init>()
                p292qd.C5621e.d.f21880Z = r0
                return
        }

        public d() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public java.lang.CharSequence mo107b(java.lang.Byte r4) {
                r3 = this;
                java.lang.Number r4 = (java.lang.Number) r4
                byte r4 = r4.byteValue()
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
                r2 = 0
                r1[r2] = r4
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r0)
                java.lang.String r0 = "%02x"
                java.lang.String r4 = java.lang.String.format(r0, r4)
                java.lang.String r0 = "format(format, *args)"
                p214m2.C4339q.m9705j(r4, r0)
                return r4
        }
    }

    public C5621e(android.content.Context r4, int r5) {
            r3 = this;
            r3.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.f21869e = r0
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.XmlResourceParser r5 = r0.getXml(r5)
            java.lang.String r0 = "context.resources.getXml(xmlResId)"
            p214m2.C4339q.m9705j(r5, r0)
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r0 = "context.applicationContext"
            p214m2.C4339q.m9705j(r4, r0)
            r3.f21865a = r4
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "this.context.packageManager"
            p214m2.C4339q.m9705j(r4, r0)
            r3.f21866b = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
        L32:
            int r0 = r5.next()     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            r1 = 1
            if (r0 == r1) goto L7d
            r1 = 2
            if (r0 != r1) goto L32
            java.lang.String r0 = r5.getName()     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            java.lang.String r1 = "signing_certificate"
            boolean r1 = p214m2.C4339q.m9702c(r0, r1)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            if (r1 == 0) goto L4d
            qd.e$b r0 = r3.m11922c(r5)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            goto L5b
        L4d:
            java.lang.String r1 = "signature"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            if (r0 == 0) goto L5a
            qd.e$b r0 = r3.m11923d(r5)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            goto L5b
        L5a:
            r0 = 0
        L5b:
            if (r0 == 0) goto L32
            java.lang.String r1 = r0.f21876b     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            java.lang.Object r2 = r4.get(r1)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            qd.e$b r2 = (p292qd.C5621e.b) r2     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            if (r2 == 0) goto L6f
            java.util.Set<qd.e$c> r1 = r2.f21877c     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            java.util.Set<qd.e$c> r0 = r0.f21877c     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            p062dh.C1471g.m3994F(r1, r0)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            goto L32
        L6f:
            r4.put(r1, r0)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L75
            goto L32
        L73:
            r5 = move-exception
            goto L76
        L75:
            r5 = move-exception
        L76:
            java.lang.String r0 = "PackageValidator"
            java.lang.String r1 = "Could not read allowed callers from XML."
            android.util.Log.e(r0, r1, r5)
        L7d:
            r3.f21867c = r4
            android.content.pm.PackageManager r4 = r3.f21866b
            r5 = 4160(0x1040, float:5.83E-42)
            java.lang.String r0 = "android"
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r0, r5)
            if (r4 == 0) goto L94
            java.lang.String r4 = r3.m11920a(r4)
            if (r4 == 0) goto L94
            r3.f21868d = r4
            return
        L94:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Platform signature not found"
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: a */
    public final java.lang.String m11920a(android.content.pm.PackageInfo r3) {
            r2 = this;
            android.content.pm.Signature[] r3 = r3.signatures
            if (r3 == 0) goto L1a
            int r0 = r3.length
            r1 = 1
            if (r0 == r1) goto L9
            goto L1a
        L9:
            r0 = 0
            r3 = r3[r0]
            byte[] r3 = r3.toByteArray()
            java.lang.String r0 = "certificate"
            p214m2.C4339q.m9705j(r3, r0)
            java.lang.String r3 = r2.m11921b(r3)
            goto L1b
        L1a:
            r3 = 0
        L1b:
            return r3
    }

    /* renamed from: b */
    public final java.lang.String m11921b(byte[] r11) {
            r10 = this;
            java.lang.String r0 = "SHA256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L26
            java.lang.String r1 = "getInstance(\"SHA256\")"
            p214m2.C4339q.m9705j(r0, r1)     // Catch: java.security.NoSuchAlgorithmException -> L26
            r0.update(r11)
            byte[] r2 = r0.digest()
            java.lang.String r11 = "md.digest()"
            p214m2.C4339q.m9705j(r2, r11)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            qd.e$d r8 = p292qd.C5621e.d.f21880Z
            r9 = 30
            java.lang.String r3 = ":"
            java.lang.String r11 = p062dh.C1468d.m3989K(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L26:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No such algorithm: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PackageValidator"
            android.util.Log.e(r1, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not find SHA256 hash algorithm"
            r0.<init>(r1, r11)
            throw r0
    }

    /* renamed from: c */
    public final p292qd.C5621e.b m11922c(android.content.res.XmlResourceParser r8) {
            r7 = this;
            r0 = 0
            java.lang.String r1 = "name"
            java.lang.String r2 = r8.getAttributeValue(r0, r1)
            java.lang.String r3 = "package"
            java.lang.String r3 = r8.getAttributeValue(r0, r3)
            java.lang.String r4 = "release"
            r5 = 0
            boolean r0 = r8.getAttributeBooleanValue(r0, r4, r5)
            java.lang.String r8 = r8.nextText()
            java.lang.String r4 = "parser.nextText()"
            p214m2.C4339q.m9705j(r8, r4)
            uh.c r4 = p292qd.C5622f.f21881a
            java.lang.String r6 = ""
            java.lang.String r8 = r4.m13044b(r8, r6)
            byte[] r8 = android.util.Base64.decode(r8, r5)
            java.lang.String r4 = "decode(certificate, Base64.DEFAULT)"
            p214m2.C4339q.m9705j(r8, r4)
            java.lang.String r8 = r7.m11921b(r8)
            qd.e$c r4 = new qd.e$c
            r4.<init>(r8, r0)
            qd.e$b r8 = new qd.e$b
            p214m2.C4339q.m9705j(r2, r1)
            java.lang.String r0 = "packageName"
            p214m2.C4339q.m9705j(r3, r0)
            r0 = 1
            qd.e$c[] r0 = new p292qd.C5621e.c[r0]
            r0[r5] = r4
            java.util.Set r0 = p185k7.C3828h5.m8573B(r0)
            r8.<init>(r2, r3, r0)
            return r8
    }

    /* renamed from: d */
    public final p292qd.C5621e.b m11923d(android.content.res.XmlResourceParser r10) {
            r9 = this;
            r0 = 0
            java.lang.String r1 = "name"
            java.lang.String r2 = r10.getAttributeValue(r0, r1)
            java.lang.String r3 = "package"
            java.lang.String r3 = r10.getAttributeValue(r0, r3)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
        L12:
            int r5 = r10.next()
            r6 = 3
            if (r5 == r6) goto L43
            r5 = 0
            java.lang.String r6 = "release"
            boolean r5 = r10.getAttributeBooleanValue(r0, r6, r5)
            java.lang.String r6 = r10.nextText()
            java.lang.String r7 = "parser.nextText()"
            p214m2.C4339q.m9705j(r6, r7)
            uh.c r7 = p292qd.C5622f.f21881a
            java.lang.String r8 = ""
            java.lang.String r6 = r7.m13044b(r6, r8)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r7 = "this as java.lang.String).toLowerCase()"
            p214m2.C4339q.m9705j(r6, r7)
            qd.e$c r7 = new qd.e$c
            r7.<init>(r6, r5)
            r4.add(r7)
            goto L12
        L43:
            qd.e$b r10 = new qd.e$b
            p214m2.C4339q.m9705j(r2, r1)
            java.lang.String r0 = "packageName"
            p214m2.C4339q.m9705j(r3, r0)
            r10.<init>(r2, r3, r4)
            return r10
    }
}
