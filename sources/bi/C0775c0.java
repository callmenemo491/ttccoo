package bi;

/* renamed from: bi.c0 */
/* loaded from: classes.dex */
public final class C0775c0 {

    /* renamed from: a */
    public bi.C0778e f4193a;

    /* renamed from: b */
    public final bi.C0803w f4194b;

    /* renamed from: c */
    public final java.lang.String f4195c;

    /* renamed from: d */
    public final bi.C0802v f4196d;

    /* renamed from: e */
    public final bi.AbstractC0781f0 f4197e;

    /* renamed from: f */
    public final java.util.Map<java.lang.Class<?>, java.lang.Object> f4198f;

    /* renamed from: bi.c0$a */
    public static class a {

        /* renamed from: a */
        public bi.C0803w f4199a;

        /* renamed from: b */
        public java.lang.String f4200b;

        /* renamed from: c */
        public bi.C0802v.a f4201c;

        /* renamed from: d */
        public bi.AbstractC0781f0 f4202d;

        /* renamed from: e */
        public java.util.Map<java.lang.Class<?>, java.lang.Object> f4203e;

        public a() {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.f4203e = r0
                java.lang.String r0 = "GET"
                r1.f4200b = r0
                bi.v$a r0 = new bi.v$a
                r0.<init>()
                r1.f4201c = r0
                return
        }

        public a(bi.C0775c0 r3) {
                r2 = this;
                r2.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r2.f4203e = r0
                bi.w r0 = r3.f4194b
                r2.f4199a = r0
                java.lang.String r0 = r3.f4195c
                r2.f4200b = r0
                bi.f0 r0 = r3.f4197e
                r2.f4202d = r0
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r3.f4198f
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L24
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                goto L31
            L24:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r3.f4198f
                java.lang.String r1 = "<this>"
                p214m2.C4339q.m9706k(r0, r1)
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>(r0)
                r0 = r1
            L31:
                r2.f4203e = r0
                bi.v r3 = r3.f4196d
                bi.v$a r3 = r3.m2430h()
                r2.f4201c = r3
                return
        }

        /* renamed from: a */
        public bi.C0775c0 m2365a() {
                r7 = this;
                bi.w r1 = r7.f4199a
                if (r1 == 0) goto L36
                java.lang.String r2 = r7.f4200b
                bi.v$a r0 = r7.f4201c
                bi.v r3 = r0.m2434c()
                bi.f0 r4 = r7.f4202d
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r7.f4203e
                byte[] r5 = ci.C0988c.f5065a
                java.lang.String r5 = "$this$toImmutableMap"
                p214m2.C4339q.m9706k(r0, r5)
                boolean r5 = r0.isEmpty()
                if (r5 == 0) goto L20
                dh.l r0 = p062dh.C1476l.f7238Y
                goto L2e
            L20:
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                r5.<init>(r0)
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r5)
                java.lang.String r5 = "Collections.unmodifiableMap(LinkedHashMap(this))"
                p214m2.C4339q.m9705j(r0, r5)
            L2e:
                r5 = r0
                bi.c0 r6 = new bi.c0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
            L36:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "url == null"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        /* renamed from: b */
        public bi.C0775c0.a m2366b(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "value"
                p214m2.C4339q.m9706k(r4, r0)
                bi.v$a r0 = r2.f4201c
                java.util.Objects.requireNonNull(r0)
                bi.v$b r1 = bi.C0802v.f4340Z
                r1.m2436a(r3)
                r1.m2437b(r4, r3)
                r0.m2435d(r3)
                r0.m2433b(r3, r4)
                return r2
        }

        /* renamed from: c */
        public bi.C0775c0.a m2367c(java.lang.String r4, bi.AbstractC0781f0 r5) {
                r3 = this;
                java.lang.String r0 = "method"
                p214m2.C4339q.m9706k(r4, r0)
                int r1 = r4.length()
                r2 = 0
                if (r1 <= 0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                if (r1 == 0) goto L71
                java.lang.String r1 = "method "
                if (r5 != 0) goto L56
                p214m2.C4339q.m9706k(r4, r0)
                java.lang.String r0 = "POST"
                boolean r0 = p214m2.C4339q.m9702c(r4, r0)
                if (r0 != 0) goto L40
                java.lang.String r0 = "PUT"
                boolean r0 = p214m2.C4339q.m9702c(r4, r0)
                if (r0 != 0) goto L40
                java.lang.String r0 = "PATCH"
                boolean r0 = p214m2.C4339q.m9702c(r4, r0)
                if (r0 != 0) goto L40
                java.lang.String r0 = "PROPPATCH"
                boolean r0 = p214m2.C4339q.m9702c(r4, r0)
                if (r0 != 0) goto L40
                java.lang.String r0 = "REPORT"
                boolean r0 = p214m2.C4339q.m9702c(r4, r0)
                if (r0 == 0) goto L41
            L40:
                r2 = 1
            L41:
                r0 = r2 ^ 1
                if (r0 == 0) goto L46
                goto L5c
            L46:
                java.lang.String r5 = " must have a request body."
                java.lang.String r4 = android.support.v4.media.C0145d.m257a(r1, r4, r5)
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
            L56:
                boolean r0 = gi.C2396f.m6147a(r4)
                if (r0 == 0) goto L61
            L5c:
                r3.f4200b = r4
                r3.f4202d = r5
                return r3
            L61:
                java.lang.String r5 = " must not have a request body."
                java.lang.String r4 = android.support.v4.media.C0145d.m257a(r1, r4, r5)
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
            L71:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "method.isEmpty() == true"
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
        }

        /* renamed from: d */
        public <T> bi.C0775c0.a m2368d(java.lang.Class<? super T> r2, T r3) {
                r1 = this;
                java.lang.String r0 = "type"
                p214m2.C4339q.m9706k(r2, r0)
                if (r3 != 0) goto Ld
                java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r1.f4203e
                r3.remove(r2)
                goto L28
            Ld:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.f4203e
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1c
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.f4203e = r0
            L1c:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.f4203e
                java.lang.Object r3 = r2.cast(r3)
                p214m2.C4339q.m9704i(r3)
                r0.put(r2, r3)
            L28:
                return r1
        }

        /* renamed from: e */
        public bi.C0775c0.a m2369e(bi.C0803w r2) {
                r1 = this;
                java.lang.String r0 = "url"
                p214m2.C4339q.m9706k(r2, r0)
                r1.f4199a = r2
                return r1
        }
    }

    public C0775c0(bi.C0803w r2, java.lang.String r3, bi.C0802v r4, bi.AbstractC0781f0 r5, java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> r6) {
            r1 = this;
            java.lang.String r0 = "method"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f4194b = r2
            r1.f4195c = r3
            r1.f4196d = r4
            r1.f4197e = r5
            r1.f4198f = r6
            return
    }

    /* renamed from: a */
    public final bi.C0778e m2363a() {
            r2 = this;
            bi.e r0 = r2.f4193a
            if (r0 != 0) goto Le
            bi.e$a r0 = bi.C0778e.f4206n
            bi.v r1 = r2.f4196d
            bi.e r0 = r0.m2375b(r1)
            r2.f4193a = r0
        Le:
            return r0
    }

    /* renamed from: b */
    public final java.lang.String m2364b(java.lang.String r2) {
            r1 = this;
            bi.v r0 = r1.f4196d
            java.lang.String r2 = r0.m2428a(r2)
            return r2
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = "Request{method="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r6.f4195c
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            bi.w r1 = r6.f4194b
            r0.append(r1)
            bi.v r1 = r6.f4196d
            int r1 = r1.size()
            if (r1 == 0) goto L5f
            java.lang.String r1 = ", headers=["
            r0.append(r1)
            bi.v r1 = r6.f4196d
            r2 = 0
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L55
            ch.e r3 = (ch.C0978e) r3
            A r5 = r3.f5050Y
            java.lang.String r5 = (java.lang.String) r5
            B r3 = r3.f5051Z
            java.lang.String r3 = (java.lang.String) r3
            if (r2 <= 0) goto L48
            java.lang.String r2 = ", "
            r0.append(r2)
        L48:
            r0.append(r5)
            r2 = 58
            r0.append(r2)
            r0.append(r3)
            r2 = r4
            goto L29
        L55:
            p074e9.C1805a.m4539x()
            r0 = 0
            throw r0
        L5a:
            r1 = 93
            r0.append(r1)
        L5f:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r6.f4198f
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L73
            java.lang.String r1 = ", tags="
            r0.append(r1)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r6.f4198f
            r0.append(r1)
        L73:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }
}
