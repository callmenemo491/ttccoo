package p222mb;

/* renamed from: mb.j */
/* loaded from: classes.dex */
public final class C4519j implements p169jb.InterfaceC3458a0 {

    /* renamed from: Y */
    public final lb.C4244g f18348Y;

    /* renamed from: Z */
    public final p169jb.InterfaceC3461d f18349Z;

    /* renamed from: a0 */
    public final lb.C4252o f18350a0;

    /* renamed from: b0 */
    public final p222mb.C4513d f18351b0;

    /* renamed from: c0 */
    public final p253ob.AbstractC5188b f18352c0;

    /* renamed from: mb.j$a */
    public static final class a<T> extends p169jb.AbstractC3483z<T> {

        /* renamed from: a */
        public final lb.InterfaceC4256s<T> f18353a;

        /* renamed from: b */
        public final java.util.Map<java.lang.String, p222mb.C4519j.b> f18354b;

        public a(lb.InterfaceC4256s<T> r1, java.util.Map<java.lang.String, p222mb.C4519j.b> r2) {
                r0 = this;
                r0.<init>()
                r0.f18353a = r1
                r0.f18354b = r2
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public T mo7919a(p290qb.C5612a r4) {
                r3 = this;
                qb.b r0 = r4.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r4.mo10411m0()
                r4 = 0
                return r4
            Ld:
                lb.s<T> r0 = r3.f18353a
                java.lang.Object r0 = r0.mo9554a()
                r4.mo10410h()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
            L16:
                boolean r1 = r4.mo10403Q()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                if (r1 == 0) goto L37
                java.lang.String r1 = r4.mo10409f0()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                java.util.Map<java.lang.String, mb.j$b> r2 = r3.f18354b     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                mb.j$b r1 = (p222mb.C4519j.b) r1     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                if (r1 == 0) goto L33
                boolean r2 = r1.f18357c     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                if (r2 != 0) goto L2f
                goto L33
            L2f:
                r1.mo10428a(r4, r0)     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                goto L16
            L33:
                r4.mo10397E0()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                goto L16
            L37:
                r4.mo10396A()
                return r0
            L3b:
                r4 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r4)
                throw r0
            L42:
                r4 = move-exception
                jb.w r0 = new jb.w
                r0.<init>(r4)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r4, T r5) {
                r3 = this;
                if (r5 != 0) goto L6
                r4.mo10417R()
                return
            L6:
                r4.mo10421i()
                java.util.Map<java.lang.String, mb.j$b> r0 = r3.f18354b     // Catch: java.lang.IllegalAccessException -> L32
                java.util.Collection r0 = r0.values()     // Catch: java.lang.IllegalAccessException -> L32
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalAccessException -> L32
            L13:
                boolean r1 = r0.hasNext()     // Catch: java.lang.IllegalAccessException -> L32
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()     // Catch: java.lang.IllegalAccessException -> L32
                mb.j$b r1 = (p222mb.C4519j.b) r1     // Catch: java.lang.IllegalAccessException -> L32
                boolean r2 = r1.mo10430c(r5)     // Catch: java.lang.IllegalAccessException -> L32
                if (r2 == 0) goto L13
                java.lang.String r2 = r1.f18355a     // Catch: java.lang.IllegalAccessException -> L32
                r4.mo10416L(r2)     // Catch: java.lang.IllegalAccessException -> L32
                r1.mo10429b(r4, r5)     // Catch: java.lang.IllegalAccessException -> L32
                goto L13
            L2e:
                r4.mo10415A()
                return
            L32:
                r4 = move-exception
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>(r4)
                throw r5
        }
    }

    /* renamed from: mb.j$b */
    public static abstract class b {

        /* renamed from: a */
        public final java.lang.String f18355a;

        /* renamed from: b */
        public final boolean f18356b;

        /* renamed from: c */
        public final boolean f18357c;

        public b(java.lang.String r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.f18355a = r1
                r0.f18356b = r2
                r0.f18357c = r3
                return
        }

        /* renamed from: a */
        public abstract void mo10428a(p290qb.C5612a r1, java.lang.Object r2);

        /* renamed from: b */
        public abstract void mo10429b(p290qb.C5614c r1, java.lang.Object r2);

        /* renamed from: c */
        public abstract boolean mo10430c(java.lang.Object r1);
    }

    public C4519j(lb.C4244g r2, p169jb.InterfaceC3461d r3, lb.C4252o r4, p222mb.C4513d r5) {
            r1 = this;
            r1.<init>()
            ob.b r0 = p253ob.AbstractC5188b.f20334a
            r1.f18352c0 = r0
            r1.f18348Y = r2
            r1.f18349Z = r3
            r1.f18350a0 = r4
            r1.f18351b0 = r5
            return
    }

    @Override // p169jb.InterfaceC3458a0
    /* renamed from: a */
    public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r35, p274pb.C5380a<T> r36) {
            r34 = this;
            r11 = r34
            r12 = r35
            r0 = r36
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            java.lang.Class<? super T> r1 = r0.f21381a
            boolean r2 = r13.isAssignableFrom(r1)
            r14 = 0
            if (r2 != 0) goto L12
            return r14
        L12:
            lb.g r2 = r11.f18348Y
            lb.s r15 = r2.m9555a(r0)
            mb.j$a r10 = new mb.j$a
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto L2c
        L25:
            r14 = r9
            r33 = r10
            r28 = r15
            goto L1e1
        L2c:
            java.lang.reflect.Type r8 = r0.f21382b
            r7 = r0
            r6 = r1
        L30:
            if (r6 == r13) goto L25
            java.lang.reflect.Field[] r5 = r6.getDeclaredFields()
            int r4 = r5.length
            r3 = 0
            r2 = 0
        L39:
            if (r2 >= r4) goto L1ba
            r1 = r5[r2]
            r0 = 1
            boolean r16 = r11.m10431b(r1, r0)
            boolean r17 = r11.m10431b(r1, r3)
            if (r16 != 0) goto L60
            if (r17 != 0) goto L60
            r19 = r2
            r20 = r4
            r31 = r5
            r36 = r6
            r32 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r29 = 0
            r15 = r8
            goto L184
        L60:
            ob.b r3 = r11.f18352c0
            r3.mo11504a(r1)
            java.lang.reflect.Type r3 = r7.f21382b
            java.lang.reflect.Type r14 = r1.getGenericType()
            java.lang.reflect.Type r14 = lb.C4238a.m9551g(r3, r6, r14)
            java.lang.Class<kb.b> r3 = p189kb.InterfaceC4079b.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            kb.b r3 = (p189kb.InterfaceC4079b) r3
            if (r3 != 0) goto L86
            jb.d r3 = r11.f18349Z
            java.lang.String r3 = r3.mo7926e(r1)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r19 = r2
            goto L97
        L86:
            java.lang.String r0 = r3.value()
            java.lang.String[] r3 = r3.alternate()
            r19 = r2
            int r2 = r3.length
            if (r2 != 0) goto L9d
            java.util.List r3 = java.util.Collections.singletonList(r0)
        L97:
            r20 = r4
            r18 = 1
            r4 = r3
            goto Lbd
        L9d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r20 = r4
            int r4 = r3.length
            r18 = 1
            int r4 = r4 + 1
            r2.<init>(r4)
            r2.add(r0)
            int r0 = r3.length
            r4 = 0
        Lae:
            if (r4 >= r0) goto Lbc
            r21 = r0
            r0 = r3[r4]
            r2.add(r0)
            int r4 = r4 + 1
            r0 = r21
            goto Lae
        Lbc:
            r4 = r2
        Lbd:
            int r3 = r4.size()
            r0 = 0
            r2 = 0
        Lc3:
            if (r2 >= r3) goto L171
            java.lang.Object r21 = r4.get(r2)
            r22 = r13
            r13 = r21
            java.lang.String r13 = (java.lang.String) r13
            r21 = r9
            if (r2 == 0) goto Ld5
            r16 = 0
        Ld5:
            pb.a r9 = new pb.a
            r9.<init>(r14)
            r23 = r0
            java.lang.Class<? super T> r0 = r9.f21381a
            r24 = r2
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto Led
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto Led
            r25 = 1
            goto Lef
        Led:
            r25 = 0
        Lef:
            java.lang.Class<kb.a> r0 = p189kb.InterfaceC4078a.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            kb.a r0 = (p189kb.InterfaceC4078a) r0
            if (r0 == 0) goto L104
            mb.d r2 = r11.f18351b0
            r26 = r1
            lb.g r1 = r11.f18348Y
            jb.z r0 = r2.m10394b(r1, r12, r9, r0)
            goto L107
        L104:
            r26 = r1
            r0 = 0
        L107:
            if (r0 == 0) goto L10c
            r27 = 1
            goto L10e
        L10c:
            r27 = 0
        L10e:
            if (r0 != 0) goto L114
            jb.z r0 = r12.m7931e(r9)
        L114:
            r28 = r0
            mb.i r2 = new mb.i
            r1 = r23
            r0 = r2
            r11 = r1
            r23 = r26
            r1 = r34
            r12 = r2
            r2 = r13
            r26 = r3
            r29 = 0
            r3 = r16
            r30 = r4
            r4 = r17
            r31 = r5
            r5 = r23
            r36 = r6
            r6 = r27
            r27 = r14
            r14 = r7
            r7 = r28
            r28 = r15
            r15 = r8
            r8 = r35
            r32 = r14
            r14 = r21
            r33 = r10
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r14.put(r13, r12)
            mb.j$b r0 = (p222mb.C4519j.b) r0
            if (r11 != 0) goto L152
            goto L153
        L152:
            r0 = r11
        L153:
            int r2 = r24 + 1
            r11 = r34
            r12 = r35
            r6 = r36
            r9 = r14
            r8 = r15
            r13 = r22
            r1 = r23
            r3 = r26
            r14 = r27
            r15 = r28
            r4 = r30
            r5 = r31
            r7 = r32
            r10 = r33
            goto Lc3
        L171:
            r11 = r0
            r31 = r5
            r36 = r6
            r32 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r29 = 0
            r15 = r8
            if (r11 != 0) goto L19e
        L184:
            int r2 = r19 + 1
            r11 = r34
            r12 = r35
            r6 = r36
            r9 = r14
            r8 = r15
            r4 = r20
            r13 = r22
            r15 = r28
            r5 = r31
            r7 = r32
            r10 = r33
            r3 = 0
            r14 = 0
            goto L39
        L19e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r11.f18355a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1ba:
            r36 = r6
            r0 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r15 = r8
            java.lang.reflect.Type r0 = r0.f21382b
            java.lang.reflect.Type r1 = r36.getGenericSuperclass()
            r2 = r36
            java.lang.reflect.Type r0 = lb.C4238a.m9551g(r0, r2, r1)
            pb.a r7 = new pb.a
            r7.<init>(r0)
            java.lang.Class<? super T> r6 = r7.f21381a
            r11 = r34
            r12 = r35
            r15 = r28
            r14 = 0
            goto L30
        L1e1:
            r0 = r28
            r1 = r33
            r1.<init>(r0, r14)
            return r1
    }

    /* renamed from: b */
    public boolean m10431b(java.lang.reflect.Field r6, boolean r7) {
            r5 = this;
            lb.o r0 = r5.f18350a0
            java.lang.Class r1 = r6.getType()
            boolean r2 = r0.m9557c(r1)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L17
            boolean r1 = r0.m9556b(r1, r7)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            if (r1 != 0) goto L63
            int r1 = r6.getModifiers()
            r1 = r1 & 136(0x88, float:1.9E-43)
            if (r1 == 0) goto L23
            goto L5d
        L23:
            boolean r1 = r6.isSynthetic()
            if (r1 == 0) goto L2a
            goto L5d
        L2a:
            java.lang.Class r1 = r6.getType()
            boolean r1 = r0.m9557c(r1)
            if (r1 == 0) goto L35
            goto L5d
        L35:
            if (r7 == 0) goto L3a
            java.util.List<jb.b> r7 = r0.f17426Y
            goto L3c
        L3a:
            java.util.List<jb.b> r7 = r0.f17427Z
        L3c:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L5f
            h7.rb r0 = new h7.rb
            r0.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L4b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5f
            java.lang.Object r7 = r6.next()
            jb.b r7 = (p169jb.InterfaceC3459b) r7
            boolean r7 = r7.m7923b(r0)
            if (r7 == 0) goto L4b
        L5d:
            r6 = 1
            goto L60
        L5f:
            r6 = 0
        L60:
            if (r6 != 0) goto L63
            goto L64
        L63:
            r3 = 0
        L64:
            return r3
    }
}
