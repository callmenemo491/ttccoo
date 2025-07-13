package lb;

/* renamed from: lb.o */
/* loaded from: classes.dex */
public final class C4252o implements p169jb.InterfaceC3458a0, java.lang.Cloneable {

    /* renamed from: a0 */
    public static final lb.C4252o f17425a0 = null;

    /* renamed from: Y */
    public java.util.List<p169jb.InterfaceC3459b> f17426Y;

    /* renamed from: Z */
    public java.util.List<p169jb.InterfaceC3459b> f17427Z;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: lb.o$a */
    public class a<T> extends p169jb.AbstractC3483z<T> {

        /* renamed from: a */
        public p169jb.AbstractC3483z<T> f17428a;

        /* renamed from: b */
        public final /* synthetic */ boolean f17429b;

        /* renamed from: c */
        public final /* synthetic */ boolean f17430c;

        /* renamed from: d */
        public final /* synthetic */ p169jb.C3467j f17431d;

        /* renamed from: e */
        public final /* synthetic */ p274pb.C5380a f17432e;

        /* renamed from: f */
        public final /* synthetic */ lb.C4252o f17433f;

        public a(lb.C4252o r1, boolean r2, boolean r3, p169jb.C3467j r4, p274pb.C5380a r5) {
                r0 = this;
                r0.f17433f = r1
                r0.f17429b = r2
                r0.f17430c = r3
                r0.f17431d = r4
                r0.f17432e = r5
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public T mo7919a(p290qb.C5612a r4) {
                r3 = this;
                boolean r0 = r3.f17429b
                if (r0 == 0) goto L9
                r4.mo10397E0()
                r4 = 0
                return r4
            L9:
                jb.z<T> r0 = r3.f17428a
                if (r0 == 0) goto Le
                goto L1a
            Le:
                jb.j r0 = r3.f17431d
                lb.o r1 = r3.f17433f
                pb.a r2 = r3.f17432e
                jb.z r0 = r0.m7932f(r1, r2)
                r3.f17428a = r0
            L1a:
                java.lang.Object r4 = r0.mo7919a(r4)
                return r4
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r4, T r5) {
                r3 = this;
                boolean r0 = r3.f17430c
                if (r0 == 0) goto L8
                r4.mo10417R()
                return
            L8:
                jb.z<T> r0 = r3.f17428a
                if (r0 == 0) goto Ld
                goto L19
            Ld:
                jb.j r0 = r3.f17431d
                lb.o r1 = r3.f17433f
                pb.a r2 = r3.f17432e
                jb.z r0 = r0.m7932f(r1, r2)
                r3.f17428a = r0
            L19:
                r0.mo7920b(r4, r5)
                return
        }
    }

    static {
            lb.o r0 = new lb.o
            r0.<init>()
            lb.C4252o.f17425a0 = r0
            return
    }

    public C4252o() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.f17426Y = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r1.f17427Z = r0
            return
    }

    @Override // p169jb.InterfaceC3458a0
    /* renamed from: a */
    public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r12, p274pb.C5380a<T> r13) {
            r11 = this;
            java.lang.Class<? super T> r0 = r13.f21381a
            boolean r1 = r11.m9557c(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L13
            boolean r4 = r11.m9556b(r0, r2)
            if (r4 == 0) goto L11
            goto L13
        L11:
            r8 = 0
            goto L14
        L13:
            r8 = 1
        L14:
            if (r1 != 0) goto L1f
            boolean r0 = r11.m9556b(r0, r3)
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r7 = 0
            goto L20
        L1f:
            r7 = 1
        L20:
            if (r8 != 0) goto L26
            if (r7 != 0) goto L26
            r12 = 0
            return r12
        L26:
            lb.o$a r0 = new lb.o$a
            r5 = r0
            r6 = r11
            r9 = r12
            r10 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
    }

    /* renamed from: b */
    public final boolean m9556b(java.lang.Class<?> r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L5
            java.util.List<jb.b> r3 = r1.f17426Y
            goto L7
        L5:
            java.util.List<jb.b> r3 = r1.f17427Z
        L7:
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r3.next()
            jb.b r0 = (p169jb.InterfaceC3459b) r0
            boolean r0 = r0.m7922a(r2)
            if (r0 == 0) goto Lb
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    /* renamed from: c */
    public final boolean m9557c(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L16
            boolean r0 = r2.isAnonymousClass()
            if (r0 != 0) goto L14
            boolean r2 = r2.isLocalClass()
            if (r2 == 0) goto L16
        L14:
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            lb.o r0 = (lb.C4252o) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }
}
