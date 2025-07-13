package p222mb;

/* renamed from: mb.g */
/* loaded from: classes.dex */
public final class C4516g implements p169jb.InterfaceC3458a0 {

    /* renamed from: Y */
    public final lb.C4244g f18334Y;

    /* renamed from: Z */
    public final boolean f18335Z;

    /* renamed from: mb.g$a */
    public final class a<K, V> extends p169jb.AbstractC3483z<java.util.Map<K, V>> {

        /* renamed from: a */
        public final p169jb.AbstractC3483z<K> f18336a;

        /* renamed from: b */
        public final p169jb.AbstractC3483z<V> f18337b;

        /* renamed from: c */
        public final lb.InterfaceC4256s<? extends java.util.Map<K, V>> f18338c;

        /* renamed from: d */
        public final /* synthetic */ p222mb.C4516g f18339d;

        public a(p222mb.C4516g r1, p169jb.C3467j r2, java.lang.reflect.Type r3, p169jb.AbstractC3483z<K> r4, java.lang.reflect.Type r5, p169jb.AbstractC3483z<V> r6, lb.InterfaceC4256s<? extends java.util.Map<K, V>> r7) {
                r0 = this;
                r0.f18339d = r1
                r0.<init>()
                mb.n r1 = new mb.n
                r1.<init>(r2, r4, r3)
                r0.f18336a = r1
                mb.n r1 = new mb.n
                r1.<init>(r2, r6, r5)
                r0.f18337b = r1
                r0.f18338c = r7
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Object mo7919a(p290qb.C5612a r5) {
                r4 = this;
                qb.b r0 = r5.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r5.mo10411m0()
                r5 = 0
                goto L7a
            Ld:
                lb.s<? extends java.util.Map<K, V>> r1 = r4.f18338c
                java.lang.Object r1 = r1.mo9554a()
                java.util.Map r1 = (java.util.Map) r1
                qb.b r2 = p290qb.EnumC5613b.f21790Y
                java.lang.String r3 = "duplicate key: "
                if (r0 != r2) goto L4b
                r5.mo10406a()
            L1e:
                boolean r0 = r5.mo10403Q()
                if (r0 == 0) goto L47
                r5.mo10406a()
                jb.z<K> r0 = r4.f18336a
                java.lang.Object r0 = r0.mo7919a(r5)
                jb.z<V> r2 = r4.f18337b
                java.lang.Object r2 = r2.mo7919a(r5)
                java.lang.Object r2 = r1.put(r0, r2)
                if (r2 != 0) goto L3d
                r5.mo10412n()
                goto L1e
            L3d:
                jb.w r5 = new jb.w
                java.lang.String r0 = p214m2.C4338p.m9700a(r3, r0)
                r5.<init>(r0)
                throw r5
            L47:
                r5.mo10412n()
                goto L79
            L4b:
                r5.mo10410h()
            L4e:
                boolean r0 = r5.mo10403Q()
                if (r0 == 0) goto L76
                h7.xf r0 = p124h7.AbstractC2951xf.f12032a
                r0.mo7311c(r5)
                jb.z<K> r0 = r4.f18336a
                java.lang.Object r0 = r0.mo7919a(r5)
                jb.z<V> r2 = r4.f18337b
                java.lang.Object r2 = r2.mo7919a(r5)
                java.lang.Object r2 = r1.put(r0, r2)
                if (r2 != 0) goto L6c
                goto L4e
            L6c:
                jb.w r5 = new jb.w
                java.lang.String r0 = p214m2.C4338p.m9700a(r3, r0)
                r5.<init>(r0)
                throw r5
            L76:
                r5.mo10396A()
            L79:
                r5 = r1
            L7a:
                return r5
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r9, java.lang.Object r10) {
                r8 = this;
                java.util.Map r10 = (java.util.Map) r10
                if (r10 != 0) goto L9
                r9.mo10417R()
                goto L148
            L9:
                mb.g r0 = r8.f18339d
                boolean r0 = r0.f18335Z
                if (r0 != 0) goto L3b
                r9.mo10421i()
                java.util.Set r10 = r10.entrySet()
                java.util.Iterator r10 = r10.iterator()
            L1a:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L145
                java.lang.Object r0 = r10.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r9.mo10416L(r1)
                jb.z<V> r1 = r8.f18337b
                java.lang.Object r0 = r0.getValue()
                r1.mo7920b(r9, r0)
                goto L1a
            L3b:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r10.size()
                r0.<init>(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r10.size()
                r1.<init>(r2)
                java.util.Set r10 = r10.entrySet()
                java.util.Iterator r10 = r10.iterator()
                r2 = 0
                r3 = 0
            L57:
                boolean r4 = r10.hasNext()
                if (r4 == 0) goto Lb9
                java.lang.Object r4 = r10.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                jb.z<K> r5 = r8.f18336a
                java.lang.Object r6 = r4.getKey()
                java.util.Objects.requireNonNull(r5)
                mb.f r7 = new mb.f     // Catch: java.io.IOException -> Lb2
                r7.<init>()     // Catch: java.io.IOException -> Lb2
                r5.mo7920b(r7, r6)     // Catch: java.io.IOException -> Lb2
                java.util.List<jb.p> r5 = r7.f18331j0     // Catch: java.io.IOException -> Lb2
                boolean r5 = r5.isEmpty()     // Catch: java.io.IOException -> Lb2
                if (r5 == 0) goto L99
                jb.p r5 = r7.f18333l0     // Catch: java.io.IOException -> Lb2
                r0.add(r5)
                java.lang.Object r4 = r4.getValue()
                r1.add(r4)
                java.util.Objects.requireNonNull(r5)
                boolean r4 = r5 instanceof p169jb.C3470m
                if (r4 != 0) goto L96
                boolean r4 = r5 instanceof p169jb.C3476s
                if (r4 == 0) goto L94
                goto L96
            L94:
                r4 = 0
                goto L97
            L96:
                r4 = 1
            L97:
                r3 = r3 | r4
                goto L57
            L99:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> Lb2
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb2
                r10.<init>()     // Catch: java.io.IOException -> Lb2
                java.lang.String r0 = "Expected one JSON element but was "
                r10.append(r0)     // Catch: java.io.IOException -> Lb2
                java.util.List<jb.p> r0 = r7.f18331j0     // Catch: java.io.IOException -> Lb2
                r10.append(r0)     // Catch: java.io.IOException -> Lb2
                java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> Lb2
                r9.<init>(r10)     // Catch: java.io.IOException -> Lb2
                throw r9     // Catch: java.io.IOException -> Lb2
            Lb2:
                r9 = move-exception
                jb.q r10 = new jb.q
                r10.<init>(r9)
                throw r10
            Lb9:
                if (r3 == 0) goto Le5
                r9.mo10420h()
                int r10 = r0.size()
            Lc2:
                if (r2 >= r10) goto Le1
                r9.mo10420h()
                java.lang.Object r3 = r0.get(r2)
                jb.p r3 = (p169jb.AbstractC3473p) r3
                jb.z<jb.p> r4 = p222mb.C4524o.f18373C
                r4.mo7920b(r9, r3)
                jb.z<V> r3 = r8.f18337b
                java.lang.Object r4 = r1.get(r2)
                r3.mo7920b(r9, r4)
                r9.mo10424n()
                int r2 = r2 + 1
                goto Lc2
            Le1:
                r9.mo10424n()
                goto L148
            Le5:
                r9.mo10421i()
                int r10 = r0.size()
            Lec:
                if (r2 >= r10) goto L145
                java.lang.Object r3 = r0.get(r2)
                jb.p r3 = (p169jb.AbstractC3473p) r3
                java.util.Objects.requireNonNull(r3)
                boolean r4 = r3 instanceof p169jb.C3477t
                if (r4 == 0) goto L12a
                jb.t r3 = r3.m7947e()
                java.lang.Object r4 = r3.f14969a
                boolean r5 = r4 instanceof java.lang.Number
                if (r5 == 0) goto L10e
                java.lang.Number r3 = r3.m7953n()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                goto L130
            L10e:
                boolean r5 = r4 instanceof java.lang.Boolean
                if (r5 == 0) goto L11b
                boolean r3 = r3.m7952m()
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                goto L130
            L11b:
                boolean r4 = r4 instanceof java.lang.String
                if (r4 == 0) goto L124
                java.lang.String r3 = r3.mo7944l()
                goto L130
            L124:
                java.lang.AssertionError r9 = new java.lang.AssertionError
                r9.<init>()
                throw r9
            L12a:
                boolean r3 = r3 instanceof p169jb.C3475r
                if (r3 == 0) goto L13f
                java.lang.String r3 = "null"
            L130:
                r9.mo10416L(r3)
                jb.z<V> r3 = r8.f18337b
                java.lang.Object r4 = r1.get(r2)
                r3.mo7920b(r9, r4)
                int r2 = r2 + 1
                goto Lec
            L13f:
                java.lang.AssertionError r9 = new java.lang.AssertionError
                r9.<init>()
                throw r9
            L145:
                r9.mo10415A()
            L148:
                return
        }
    }

    public C4516g(lb.C4244g r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f18334Y = r1
            r0.f18335Z = r2
            return
    }

    @Override // p169jb.InterfaceC3458a0
    /* renamed from: a */
    public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r12, p274pb.C5380a<T> r13) {
            r11 = this;
            java.lang.reflect.Type r1 = r13.f21382b
            java.lang.Class<? super T> r3 = r13.f21381a
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 != 0) goto Le
            r0 = 0
            return r0
        Le:
            java.lang.Class r3 = lb.C4238a.m9549e(r1)
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class<java.util.Properties> r6 = java.util.Properties.class
            r7 = 2
            r8 = 0
            r9 = 1
            if (r1 != r6) goto L24
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r7]
            r1[r8] = r5
            r1[r9] = r5
            goto L3b
        L24:
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            java.lang.reflect.Type r1 = lb.C4238a.m9550f(r1, r3, r5)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L35
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            goto L3b
        L35:
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r7]
            r1[r8] = r4
            r1[r9] = r4
        L3b:
            r3 = r1[r8]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            if (r3 == r4) goto L50
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r3 != r4) goto L46
            goto L50
        L46:
            pb.a r4 = new pb.a
            r4.<init>(r3)
            jb.z r3 = r12.m7931e(r4)
            goto L52
        L50:
            jb.z<java.lang.Boolean> r3 = p222mb.C4524o.f18378c
        L52:
            r4 = r3
            r3 = r1[r9]
            pb.a r5 = new pb.a
            r5.<init>(r3)
            jb.z r6 = r12.m7931e(r5)
            lb.g r3 = r11.f18334Y
            lb.s r7 = r3.m9555a(r13)
            mb.g$a r10 = new mb.g$a
            r3 = r1[r8]
            r5 = r1[r9]
            r0 = r10
            r1 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
    }
}
