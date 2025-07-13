package p010a9;

/* renamed from: a9.a */
/* loaded from: classes.dex */
public abstract class AbstractC0033a<T> implements java.util.Iterator<T> {

    /* renamed from: Y */
    public int f75Y;

    /* renamed from: Z */
    public T f76Z;

    public AbstractC0033a() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.f75Y = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r10 = this;
            int r0 = r10.f75Y
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 == r3) goto L9
            r4 = 1
            goto La
        L9:
            r4 = 0
        La:
            if (r4 == 0) goto Lb4
            int r0 = p365v.C6480g.m13148b(r0)
            if (r0 == 0) goto Lb3
            r4 = 2
            if (r0 == r4) goto Lb2
            r0 = 3
            r10.f75Y = r3
            r3 = r10
            a9.k$a r3 = (p010a9.C0043k.a) r3
        L1b:
            int r4 = r3.f96d0
        L1d:
            int r5 = r3.f96d0
            r6 = -1
            if (r5 == r6) goto La6
            int r5 = r3.mo42b(r5)
            if (r5 != r6) goto L31
            java.lang.CharSequence r5 = r3.f93a0
            int r5 = r5.length()
            r3.f96d0 = r6
            goto L37
        L31:
            int r7 = r3.mo41a(r5)
            r3.f96d0 = r7
        L37:
            int r7 = r3.f96d0
            if (r7 != r4) goto L4a
            int r7 = r7 + 1
            r3.f96d0 = r7
            java.lang.CharSequence r5 = r3.f93a0
            int r5 = r5.length()
            if (r7 <= r5) goto L1d
            r3.f96d0 = r6
            goto L1d
        L4a:
            if (r4 >= r5) goto L5d
            a9.b r7 = r3.f94b0
            java.lang.CharSequence r8 = r3.f93a0
            char r8 = r8.charAt(r4)
            boolean r7 = r7.mo39c(r8)
            if (r7 == 0) goto L5d
            int r4 = r4 + 1
            goto L4a
        L5d:
            if (r5 <= r4) goto L71
            a9.b r7 = r3.f94b0
            java.lang.CharSequence r8 = r3.f93a0
            int r9 = r5 + (-1)
            char r8 = r8.charAt(r9)
            boolean r7 = r7.mo39c(r8)
            if (r7 == 0) goto L71
            r5 = r9
            goto L5d
        L71:
            boolean r7 = r3.f95c0
            if (r7 == 0) goto L78
            if (r4 != r5) goto L78
            goto L1b
        L78:
            int r7 = r3.f97e0
            if (r7 != r2) goto L98
            java.lang.CharSequence r5 = r3.f93a0
            int r5 = r5.length()
            r3.f96d0 = r6
        L84:
            if (r5 <= r4) goto L9b
            a9.b r6 = r3.f94b0
            java.lang.CharSequence r7 = r3.f93a0
            int r8 = r5 + (-1)
            char r7 = r7.charAt(r8)
            boolean r6 = r6.mo39c(r7)
            if (r6 == 0) goto L9b
            r5 = r8
            goto L84
        L98:
            int r7 = r7 - r2
            r3.f97e0 = r7
        L9b:
            java.lang.CharSequence r3 = r3.f93a0
            java.lang.CharSequence r3 = r3.subSequence(r4, r5)
            java.lang.String r3 = r3.toString()
            goto La9
        La6:
            r3.f75Y = r0
            r3 = 0
        La9:
            r10.f76Z = r3
            int r3 = r10.f75Y
            if (r3 == r0) goto Lb2
            r10.f75Y = r2
            r1 = 1
        Lb2:
            return r1
        Lb3:
            return r2
        Lb4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            r0 = 2
            r2.f75Y = r0
            T r0 = r2.f76Z
            r1 = 0
            r2.f76Z = r1
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
