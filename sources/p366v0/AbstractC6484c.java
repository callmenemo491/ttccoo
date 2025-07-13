package p366v0;

/* renamed from: v0.c */
/* loaded from: classes.dex */
public abstract class AbstractC6484c<T> {

    /* renamed from: a */
    public java.lang.Object f25150a;

    public AbstractC6484c() {
            r2 = this;
            r2.<init>()
            char[] r0 = p106g3.C2238j.f10214a
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 20
            r0.<init>(r1)
            r2.f25150a = r0
            return
    }

    public AbstractC6484c(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.f25150a = r1
            return
    }

    public AbstractC6484c(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f25150a = r1
            return
    }

    public AbstractC6484c(p323s3.C5953g r1) {
            r0 = this;
            r0.<init>()
            r0.f25150a = r1
            return
    }

    public AbstractC6484c(sb.AbstractC6014h r1) {
            r0 = this;
            r0.<init>()
            r0.f25150a = r1
            return
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    /* renamed from: a */
    public abstract p229n2.InterfaceC4681k mo10705a();

    /* renamed from: b */
    public abstract p366v0.AbstractC6484c mo13169b(sb.AbstractC6014h r1);

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    /* renamed from: c */
    public p229n2.InterfaceC4681k m13170c() {
            r1 = this;
            java.lang.Object r0 = r1.f25150a
            java.util.Queue r0 = (java.util.Queue) r0
            java.lang.Object r0 = r0.poll()
            n2.k r0 = (p229n2.InterfaceC4681k) r0
            if (r0 != 0) goto L10
            n2.k r0 = r1.mo10705a()
        L10:
            return r0
    }

    /* renamed from: d */
    public abstract p453zb.C7270b mo13171d();

    /* renamed from: e */
    public abstract p453zb.C7269a mo13172e(int r1, p453zb.C7269a r2);

    /* renamed from: f */
    public abstract float mo11479f(T r1);

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    /* renamed from: g */
    public void m13173g(p229n2.InterfaceC4681k r3) {
            r2 = this;
            java.lang.Object r0 = r2.f25150a
            java.util.Queue r0 = (java.util.Queue) r0
            int r0 = r0.size()
            r1 = 20
            if (r0 >= r1) goto L13
            java.lang.Object r0 = r2.f25150a
            java.util.Queue r0 = (java.util.Queue) r0
            r0.offer(r3)
        L13:
            return
    }

    /* renamed from: h */
    public abstract void mo11480h(T r1, float r2);

    /* JADX WARN: Incorrect return type in method signature: (Lh7/cg;)TKeyFormatProtoT; */
    /* renamed from: i */
    public abstract p124h7.InterfaceC2935x mo7013i(p124h7.AbstractC2574cg r1);

    /* JADX WARN: Incorrect types in method signature: (TKeyFormatProtoT;)TKeyT; */
    /* renamed from: j */
    public abstract java.lang.Object mo7014j(p124h7.InterfaceC2935x r1);

    /* renamed from: k */
    public java.util.Map<java.lang.String, p124h7.C2811q1<KeyFormatProtoT>> mo7015k() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: (TKeyFormatProtoT;)V */
    /* renamed from: l */
    public abstract void mo7016l(p124h7.InterfaceC2935x r1);
}
