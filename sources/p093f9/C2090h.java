package p093f9;

/* renamed from: f9.h */
/* loaded from: classes.dex */
public final class C2090h {

    /* renamed from: a */
    public final p204l9.C4198a0 f9512a;

    public C2090h(p204l9.C4198a0 r1) {
            r0 = this;
            r0.<init>()
            r0.f9512a = r1
            return
    }

    /* renamed from: a */
    public static final p093f9.C2090h m5524a(p204l9.C4198a0 r1) {
            if (r1 == 0) goto Le
            int r0 = r1.m9346A()
            if (r0 <= 0) goto Le
            f9.h r0 = new f9.h
            r0.<init>(r1)
            return r0
        Le:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "empty keyset"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: c */
    public static final p093f9.C2090h m5525c(androidx.appcompat.widget.C0311x r3, p093f9.InterfaceC2083a r4) {
            byte[] r3 = r3.m824o()
            m9.p r0 = p221m9.C4478p.m10222a()
            l9.r r3 = p204l9.C4224r.m9496B(r3, r0)
            m9.h r0 = r3.m9500z()
            int r0 = r0.size()
            java.lang.String r1 = "empty keyset"
            if (r0 == 0) goto L49
            f9.h r0 = new f9.h
            m9.h r3 = r3.m9500z()     // Catch: p221m9.C4434a0 -> L41
            byte[] r3 = r3.m10063w()     // Catch: p221m9.C4434a0 -> L41
            r2 = 0
            byte[] r2 = new byte[r2]     // Catch: p221m9.C4434a0 -> L41
            byte[] r3 = r4.mo5507b(r3, r2)     // Catch: p221m9.C4434a0 -> L41
            m9.p r4 = p221m9.C4478p.m10222a()     // Catch: p221m9.C4434a0 -> L41
            l9.a0 r3 = p204l9.C4198a0.m9342E(r3, r4)     // Catch: p221m9.C4434a0 -> L41
            int r4 = r3.m9346A()     // Catch: p221m9.C4434a0 -> L41
            if (r4 <= 0) goto L3b
            r0.<init>(r3)
            return r0
        L3b:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: p221m9.C4434a0 -> L41
            r3.<init>(r1)     // Catch: p221m9.C4434a0 -> L41
            throw r3     // Catch: p221m9.C4434a0 -> L41
        L41:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "invalid keyset, corrupted key material"
            r3.<init>(r4)
            throw r3
        L49:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r1)
            throw r3
    }

    /* renamed from: b */
    public <P> P m5526b(java.lang.Class<P> r15) {
            r14 = this;
            java.util.logging.Logger r0 = p093f9.C2100r.f9524a
            l9.x r0 = p204l9.EnumC4230x.f17386a0
            l9.a0 r1 = r14.f9512a
            int r2 = p093f9.C2101s.f9529a
            int r2 = r1.m9348C()
            java.util.List r1 = r1.m9347B()
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 1
        L19:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto Lac
            java.lang.Object r8 = r1.next()
            l9.a0$c r8 = (p204l9.C4198a0.c) r8
            l9.x r9 = r8.m9359E()
            if (r9 == r0) goto L2c
            goto L19
        L2c:
            boolean r9 = r8.m9360F()
            if (r9 == 0) goto L94
            l9.g0 r9 = r8.m9358D()
            l9.g0 r10 = p204l9.EnumC4210g0.f17361Z
            if (r9 == r10) goto L7c
            l9.x r9 = r8.m9359E()
            l9.x r10 = p204l9.EnumC4230x.f17385Z
            if (r9 == r10) goto L64
            int r9 = r8.m9357C()
            if (r9 != r2) goto L54
            if (r6 != 0) goto L4c
            r6 = 1
            goto L54
        L4c:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset contains multiple primary keys"
            r15.<init>(r0)
            throw r15
        L54:
            l9.w r8 = r8.m9356B()
            l9.w$c r8 = r8.m9527B()
            l9.w$c r9 = p204l9.C4229w.c.f17380c0
            if (r8 == r9) goto L61
            r7 = 0
        L61:
            int r5 = r5 + 1
            goto L19
        L64:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r1 = r8.m9357C()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r3] = r1
            java.lang.String r1 = "key %d has unknown status"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L7c:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r1 = r8.m9357C()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r3] = r1
            java.lang.String r1 = "key %d has unknown prefix"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L94:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r1 = r8.m9357C()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r3] = r1
            java.lang.String r1 = "key %d has no key data"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        Lac:
            if (r5 == 0) goto L1e1
            if (r6 != 0) goto Lbb
            if (r7 == 0) goto Lb3
            goto Lbb
        Lb3:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset doesn't contain a valid primary key"
            r15.<init>(r0)
            throw r15
        Lbb:
            f9.n r1 = new f9.n
            r1.<init>(r15)
            l9.a0 r2 = r14.f9512a
            java.util.List r2 = r2.m9347B()
            java.util.Iterator r2 = r2.iterator()
        Lca:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L1b5
            java.lang.Object r5 = r2.next()
            l9.a0$c r5 = (p204l9.C4198a0.c) r5
            l9.x r6 = r5.m9359E()
            if (r6 != r0) goto Lca
            l9.w r6 = r5.m9356B()
            java.lang.String r6 = r6.m9528C()
            l9.w r7 = r5.m9356B()
            m9.h r7 = r7.m9529D()
            java.lang.Object r9 = p093f9.C2100r.m5550d(r6, r7, r15)
            l9.x r6 = r5.m9359E()
            if (r6 != r0) goto L1ad
            f9.n$a r6 = new f9.n$a
            l9.g0 r7 = r5.m9358D()
            int r7 = r7.ordinal()
            r8 = 5
            if (r7 == r4) goto L121
            r10 = 2
            if (r7 == r10) goto L118
            r10 = 3
            if (r7 == r10) goto L115
            r10 = 4
            if (r7 != r10) goto L10d
            goto L118
        L10d:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown output prefix type"
            r15.<init>(r0)
            throw r15
        L115:
            byte[] r7 = p093f9.C2084b.f9503a
            goto L135
        L118:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteBuffer r7 = r7.put(r3)
            goto L129
        L121:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteBuffer r7 = r7.put(r4)
        L129:
            int r8 = r5.m9357C()
            java.nio.ByteBuffer r7 = r7.putInt(r8)
            byte[] r7 = r7.array()
        L135:
            r10 = r7
            l9.x r11 = r5.m9359E()
            l9.g0 r12 = r5.m9358D()
            int r13 = r5.m9357C()
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r6)
            java.lang.String r8 = new java.lang.String
            byte[] r9 = r6.m5540a()
            java.nio.charset.Charset r10 = p093f9.C2096n.f9515d
            r8.<init>(r9, r10)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<f9.n$a<P>>> r9 = r1.f9516a
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            java.lang.Object r7 = r9.put(r8, r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L17b
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.addAll(r7)
            r9.add(r6)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<f9.n$a<P>>> r7 = r1.f9516a
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            r7.put(r8, r9)
        L17b:
            int r5 = r5.m9357C()
            l9.a0 r7 = r14.f9512a
            int r7 = r7.m9348C()
            if (r5 != r7) goto Lca
            l9.x r5 = r6.f9521c
            if (r5 != r0) goto L1a5
            byte[] r5 = r6.m5540a()
            java.util.List r5 = r1.m5538a(r5)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L19d
            r1.f9517b = r6
            goto Lca
        L19d:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the primary entry cannot be set to an entry which is not held by this primitive set"
            r15.<init>(r0)
            throw r15
        L1a5:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the primary entry has to be ENABLED"
            r15.<init>(r0)
            throw r15
        L1ad:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "only ENABLED key is allowed"
            r15.<init>(r0)
            throw r15
        L1b5:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, f9.o<?>> r15 = p093f9.C2100r.f9528e
            java.lang.Class<P> r0 = r1.f9518c
            java.util.concurrent.ConcurrentHashMap r15 = (java.util.concurrent.ConcurrentHashMap) r15
            java.lang.Object r15 = r15.get(r0)
            f9.o r15 = (p093f9.InterfaceC2097o) r15
            if (r15 == 0) goto L1c8
            java.lang.Object r15 = r15.mo5541a(r1)
            return r15
        L1c8:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "No wrapper found for "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class<P> r1 = r1.f9518c
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L1e1:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset must contain at least one ENABLED key"
            r15.<init>(r0)
            throw r15
    }

    public java.lang.String toString() {
            r1 = this;
            l9.a0 r0 = r1.f9512a
            l9.b0 r0 = p093f9.C2101s.m5554a(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
