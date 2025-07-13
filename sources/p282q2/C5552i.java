package p282q2;

/* renamed from: q2.i */
/* loaded from: classes.dex */
public final class C5552i implements p282q2.InterfaceC5550g {

    /* renamed from: b */
    public final java.util.Map<java.lang.String, java.util.List<p282q2.InterfaceC5551h>> f21609b;

    /* renamed from: c */
    public volatile java.util.Map<java.lang.String, java.lang.String> f21610c;

    /* renamed from: q2.i$a */
    public static final class a {

        /* renamed from: b */
        public static final java.util.Map<java.lang.String, java.util.List<p282q2.InterfaceC5551h>> f21611b = null;

        /* renamed from: a */
        public java.util.Map<java.lang.String, java.util.List<p282q2.InterfaceC5551h>> f21612a;

        static {
                java.lang.String r0 = "http.agent"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto Ld
                goto L3a
            Ld:
                int r1 = r0.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r3 = r0.length()
                r2.<init>(r3)
                r3 = 0
            L1b:
                if (r3 >= r1) goto L36
                char r4 = r0.charAt(r3)
                r5 = 31
                if (r4 > r5) goto L29
                r5 = 9
                if (r4 != r5) goto L2e
            L29:
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L2e
                goto L30
            L2e:
                r4 = 63
            L30:
                r2.append(r4)
                int r3 = r3 + 1
                goto L1b
            L36:
                java.lang.String r0 = r2.toString()
            L3a:
                java.util.HashMap r1 = new java.util.HashMap
                r2 = 2
                r1.<init>(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L54
                q2.i$b r2 = new q2.i$b
                r2.<init>(r0)
                java.util.List r0 = java.util.Collections.singletonList(r2)
                java.lang.String r2 = "User-Agent"
                r1.put(r2, r0)
            L54:
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
                p282q2.C5552i.a.f21611b = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                java.util.Map<java.lang.String, java.util.List<q2.h>> r0 = p282q2.C5552i.a.f21611b
                r1.f21612a = r0
                return
        }
    }

    /* renamed from: q2.i$b */
    public static final class b implements p282q2.InterfaceC5551h {

        /* renamed from: a */
        public final java.lang.String f21613a;

        public b(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f21613a = r1
                return
        }

        @Override // p282q2.InterfaceC5551h
        /* renamed from: a */
        public java.lang.String mo11834a() {
                r1 = this;
                java.lang.String r0 = r1.f21613a
                return r0
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof p282q2.C5552i.b
                if (r0 == 0) goto Lf
                q2.i$b r2 = (p282q2.C5552i.b) r2
                java.lang.String r0 = r1.f21613a
                java.lang.String r2 = r2.f21613a
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.f21613a
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "StringHeaderFactory{value='"
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r2.f21613a
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C5552i(java.util.Map<java.lang.String, java.util.List<p282q2.InterfaceC5551h>> r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.f21609b = r1
            return
    }

    @Override // p282q2.InterfaceC5550g
    /* renamed from: a */
    public java.util.Map<java.lang.String, java.lang.String> mo11833a() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f21610c
            if (r0 != 0) goto L18
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f21610c     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L13
            java.util.Map r0 = r1.m11835b()     // Catch: java.lang.Throwable -> L15
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch: java.lang.Throwable -> L15
            r1.f21610c = r0     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r0
        L18:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f21610c
            return r0
    }

    /* renamed from: b */
    public final java.util.Map<java.lang.String, java.lang.String> m11835b() {
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map<java.lang.String, java.util.List<q2.h>> r1 = r9.f21609b
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r3.size()
            r6 = 0
        L2b:
            if (r6 >= r5) goto L50
            java.lang.Object r7 = r3.get(r6)
            q2.h r7 = (p282q2.InterfaceC5551h) r7
            java.lang.String r7 = r7.mo11834a()
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L4d
            r4.append(r7)
            int r7 = r3.size()
            int r7 = r7 + (-1)
            if (r6 == r7) goto L4d
            r7 = 44
            r4.append(r7)
        L4d:
            int r6 = r6 + 1
            goto L2b
        L50:
            java.lang.String r3 = r4.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Lf
            java.lang.Object r2 = r2.getKey()
            r0.put(r2, r3)
            goto Lf
        L62:
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p282q2.C5552i
            if (r0 == 0) goto Lf
            q2.i r2 = (p282q2.C5552i) r2
            java.util.Map<java.lang.String, java.util.List<q2.h>> r0 = r1.f21609b
            java.util.Map<java.lang.String, java.util.List<q2.h>> r2 = r2.f21609b
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<q2.h>> r0 = r1.f21609b
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "LazyHeaders{headers="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.Map<java.lang.String, java.util.List<q2.h>> r1 = r2.f21609b
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
