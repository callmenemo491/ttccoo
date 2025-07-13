package p067e2;

/* renamed from: e2.b */
/* loaded from: classes.dex */
public final class C1509b {
    /* renamed from: a */
    public static final <IT, VH extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> p086f2.InterfaceC1987b<IT> m4096a(p003a2.InterfaceC0004a<? extends IT, VH> r5, int r6) {
            java.lang.String r0 = "$this$getSelectionStateProvider"
            p214m2.C4339q.m9707l(r5, r0)
            boolean r0 = r5 instanceof p067e2.C1511d
            java.lang.String r1 = " is not a RealItemDefinition"
            if (r0 == 0) goto L4a
            r2 = r5
            e2.d r2 = (p067e2.C1511d) r2
            a2.b r2 = r2.f7353h
            b2.a<?> r2 = r2.f9b
            boolean r3 = r2 instanceof p019b2.InterfaceC0658d
            r4 = 0
            if (r3 != 0) goto L19
            r3 = r4
            goto L1a
        L19:
            r3 = r2
        L1a:
            b2.d r3 = (p019b2.InterfaceC0658d) r3
            if (r3 == 0) goto L24
            f2.a r5 = new f2.a
            r5.<init>(r3, r6)
            goto L30
        L24:
            if (r0 == 0) goto L31
            boolean r5 = r2 instanceof p019b2.InterfaceC0655a
            if (r5 != 0) goto L2b
            r2 = r4
        L2b:
            f2.a r5 = new f2.a
            r5.<init>(r2, r6)
        L30:
            return r5
        L31:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L4a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    /* renamed from: b */
    public static final p067e2.C1511d<?, ?> m4097b(p003a2.InterfaceC0004a<?, ?> r1) {
            java.lang.String r0 = "$this$realDefinition"
            p214m2.C4339q.m9707l(r1, r0)
            boolean r0 = r1 instanceof p067e2.C1511d
            if (r0 != 0) goto Lb
            r0 = 0
            goto Lc
        Lb:
            r0 = r1
        Lc:
            e2.d r0 = (p067e2.C1511d) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " is not a RealItemDefinition"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: c */
    public static final androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 m4098c(android.view.View r1) {
            r0 = 2131362521(0x7f0a02d9, float:1.8344825E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof androidx.recyclerview.widget.RecyclerView.AbstractC0546b0
            if (r0 != 0) goto Lc
            r1 = 0
        Lc:
            androidx.recyclerview.widget.RecyclerView$b0 r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r1
            if (r1 == 0) goto L11
            return r1
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Didn't find view holder in itemView tag."
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }
}
