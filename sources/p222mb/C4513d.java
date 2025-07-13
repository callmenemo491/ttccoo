package p222mb;

/* renamed from: mb.d */
/* loaded from: classes.dex */
public final class C4513d implements p169jb.InterfaceC3458a0 {

    /* renamed from: Y */
    public final lb.C4244g f18323Y;

    public C4513d(lb.C4244g r1) {
            r0 = this;
            r0.<init>()
            r0.f18323Y = r1
            return
    }

    @Override // p169jb.InterfaceC3458a0
    /* renamed from: a */
    public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r3, p274pb.C5380a<T> r4) {
            r2 = this;
            java.lang.Class<? super T> r0 = r4.f21381a
            java.lang.Class<kb.a> r1 = p189kb.InterfaceC4078a.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            kb.a r0 = (p189kb.InterfaceC4078a) r0
            if (r0 != 0) goto Le
            r3 = 0
            return r3
        Le:
            lb.g r1 = r2.f18323Y
            jb.z r3 = r2.m10394b(r1, r3, r4, r0)
            return r3
    }

    /* renamed from: b */
    public p169jb.AbstractC3483z<?> m10394b(lb.C4244g r9, p169jb.C3467j r10, p274pb.C5380a<?> r11, p189kb.InterfaceC4078a r12) {
            r8 = this;
            java.lang.Class r0 = r12.value()
            pb.a r1 = new pb.a
            r1.<init>(r0)
            lb.s r9 = r9.m9555a(r1)
            java.lang.Object r9 = r9.mo9554a()
            boolean r0 = r9 instanceof p169jb.AbstractC3483z
            if (r0 == 0) goto L18
            jb.z r9 = (p169jb.AbstractC3483z) r9
            goto L72
        L18:
            boolean r0 = r9 instanceof p169jb.InterfaceC3458a0
            if (r0 == 0) goto L23
            jb.a0 r9 = (p169jb.InterfaceC3458a0) r9
            jb.z r9 = r9.mo7921a(r10, r11)
            goto L72
        L23:
            boolean r0 = r9 instanceof p169jb.InterfaceC3479v
            if (r0 != 0) goto L58
            boolean r1 = r9 instanceof p169jb.InterfaceC3472o
            if (r1 == 0) goto L2c
            goto L58
        L2c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r12 = android.support.v4.media.C0144c.m256a(r12)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L58:
            r1 = 0
            if (r0 == 0) goto L60
            r0 = r9
            jb.v r0 = (p169jb.InterfaceC3479v) r0
            r3 = r0
            goto L61
        L60:
            r3 = r1
        L61:
            boolean r0 = r9 instanceof p169jb.InterfaceC3472o
            if (r0 == 0) goto L68
            r1 = r9
            jb.o r1 = (p169jb.InterfaceC3472o) r1
        L68:
            r4 = r1
            mb.m r9 = new mb.m
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L72:
            if (r9 == 0) goto L80
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L80
            jb.y r10 = new jb.y
            r10.<init>(r9)
            r9 = r10
        L80:
            return r9
    }
}
