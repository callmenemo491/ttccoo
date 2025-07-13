package p362uh;

/* renamed from: uh.k */
/* loaded from: classes.dex */
public final class C6465k extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.CharSequence, java.lang.Integer, ch.C0978e<? extends java.lang.Integer, ? extends java.lang.Integer>> {

    /* renamed from: Z */
    public final /* synthetic */ java.util.List<java.lang.String> f25053Z;

    /* renamed from: a0 */
    public final /* synthetic */ boolean f25054a0;

    public C6465k(java.util.List<java.lang.String> r1, boolean r2) {
            r0 = this;
            r0.f25053Z = r1
            r0.f25054a0 = r2
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0978e<? extends java.lang.Integer, ? extends java.lang.Integer> mo122l(java.lang.CharSequence r14, java.lang.Integer r15) {
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.String r0 = "$this$$receiver"
            p214m2.C4339q.m9706k(r14, r0)
            java.util.List<java.lang.String> r6 = r13.f25053Z
            boolean r7 = r13.f25054a0
            r8 = 0
            r0 = 0
            if (r7 != 0) goto L56
            int r1 = r6.size()
            r2 = 1
            if (r1 != r2) goto L56
            java.lang.String r1 = "<this>"
            p214m2.C4339q.m9706k(r6, r1)
            p214m2.C4339q.m9706k(r6, r1)
            int r1 = r6.size()
            if (r1 == 0) goto L4e
            if (r1 != r2) goto L46
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 4
            int r14 = p362uh.C6467m.m13070a0(r14, r1, r15, r0, r2)
            if (r14 >= 0) goto L3b
            goto Le6
        L3b:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            ch.e r15 = new ch.e
            r15.<init>(r14, r1)
            goto Le7
        L46:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "List has more than one element."
            r14.<init>(r15)
            throw r14
        L4e:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "List is empty."
            r14.<init>(r15)
            throw r14
        L56:
            rh.c r1 = new rh.c
            if (r15 >= 0) goto L5b
            r15 = 0
        L5b:
            int r0 = r14.length()
            r1.<init>(r15, r0)
            boolean r0 = r14 instanceof java.lang.String
            if (r0 == 0) goto La7
            int r9 = r1.f22648Z
            int r10 = r1.f22649a0
            if (r10 <= 0) goto L6e
            if (r15 <= r9) goto L72
        L6e:
            if (r10 >= 0) goto Le6
            if (r9 > r15) goto Le6
        L72:
            java.util.Iterator r11 = r6.iterator()
        L76:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = r14
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r0.length()
            r3 = r15
            r5 = r7
            boolean r0 = p362uh.C6463i.m13055L(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L76
            goto L95
        L94:
            r12 = r8
        L95:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto La3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            ch.e r15 = new ch.e
            r15.<init>(r14, r12)
            goto Le7
        La3:
            if (r15 == r9) goto Le6
            int r15 = r15 + r10
            goto L72
        La7:
            int r9 = r1.f22648Z
            int r10 = r1.f22649a0
            if (r10 <= 0) goto Laf
            if (r15 <= r9) goto Lb3
        Laf:
            if (r10 >= 0) goto Le6
            if (r9 > r15) goto Le6
        Lb3:
            java.util.Iterator r11 = r6.iterator()
        Lb7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Ld3
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r2 = r14
            r3 = r15
            r5 = r7
            boolean r0 = p362uh.C6467m.m13075f0(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto Lb7
            goto Ld4
        Ld3:
            r12 = r8
        Ld4:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto Le2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            ch.e r15 = new ch.e
            r15.<init>(r14, r12)
            goto Le7
        Le2:
            if (r15 == r9) goto Le6
            int r15 = r15 + r10
            goto Lb3
        Le6:
            r15 = r8
        Le7:
            if (r15 == 0) goto Lfc
            A r14 = r15.f5050Y
            B r15 = r15.f5051Z
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            ch.e r8 = new ch.e
            r8.<init>(r14, r15)
        Lfc:
            return r8
    }
}
