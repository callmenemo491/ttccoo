package io.tacocrypto.app;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends androidx.databinding.AbstractC0357d {

    /* renamed from: a */
    public static final android.util.SparseIntArray f12866a = null;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r1 = 18
            r0.<init>(r1)
            io.tacocrypto.app.DataBinderMapperImpl.f12866a = r0
            r2 = 2131558436(0x7f0d0024, float:1.8742188E38)
            r3 = 1
            r0.put(r2, r3)
            r2 = 2131558437(0x7f0d0025, float:1.874219E38)
            r3 = 2
            r0.put(r2, r3)
            r2 = 2131558446(0x7f0d002e, float:1.8742208E38)
            r3 = 3
            r0.put(r2, r3)
            r2 = 2131558485(0x7f0d0055, float:1.8742287E38)
            r3 = 4
            r0.put(r2, r3)
            r2 = 2131558487(0x7f0d0057, float:1.8742291E38)
            r3 = 5
            r0.put(r2, r3)
            r2 = 2131558587(0x7f0d00bb, float:1.8742494E38)
            r3 = 6
            r0.put(r2, r3)
            r2 = 2131558634(0x7f0d00ea, float:1.874259E38)
            r3 = 7
            r0.put(r2, r3)
            r2 = 2131558636(0x7f0d00ec, float:1.8742593E38)
            r3 = 8
            r0.put(r2, r3)
            r2 = 2131558637(0x7f0d00ed, float:1.8742595E38)
            r3 = 9
            r0.put(r2, r3)
            r2 = 2131558656(0x7f0d0100, float:1.8742634E38)
            r3 = 10
            r0.put(r2, r3)
            r2 = 2131558657(0x7f0d0101, float:1.8742636E38)
            r3 = 11
            r0.put(r2, r3)
            r2 = 2131558667(0x7f0d010b, float:1.8742656E38)
            r3 = 12
            r0.put(r2, r3)
            r2 = 2131558668(0x7f0d010c, float:1.8742658E38)
            r3 = 13
            r0.put(r2, r3)
            r2 = 2131558677(0x7f0d0115, float:1.8742677E38)
            r3 = 14
            r0.put(r2, r3)
            r2 = 2131558681(0x7f0d0119, float:1.8742685E38)
            r3 = 15
            r0.put(r2, r3)
            r2 = 2131558682(0x7f0d011a, float:1.8742687E38)
            r3 = 16
            r0.put(r2, r3)
            r2 = 2131558691(0x7f0d0123, float:1.8742705E38)
            r3 = 17
            r0.put(r2, r3)
            r2 = 2131558692(0x7f0d0124, float:1.8742707E38)
            r0.put(r2, r1)
            return
    }

    public DataBinderMapperImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.databinding.AbstractC0357d
    /* renamed from: a */
    public java.util.List<androidx.databinding.AbstractC0357d> mo1068a() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            androidx.databinding.library.baseAdapters.DataBinderMapperImpl r1 = new androidx.databinding.library.baseAdapters.DataBinderMapperImpl
            r1.<init>()
            r0.add(r1)
            return r0
    }

    @Override // androidx.databinding.AbstractC0357d
    /* renamed from: b */
    public androidx.databinding.ViewDataBinding mo1043b(androidx.databinding.InterfaceC0358e r2, android.view.View r3, int r4) {
            r1 = this;
            android.util.SparseIntArray r0 = io.tacocrypto.app.DataBinderMapperImpl.f12866a
            int r4 = r0.get(r4)
            if (r4 <= 0) goto L1ef
            java.lang.Object r0 = r3.getTag()
            if (r0 == 0) goto L1e7
            switch(r4) {
                case 1: goto L1cd;
                case 2: goto L1b3;
                case 3: goto L199;
                case 4: goto L17f;
                case 5: goto L165;
                case 6: goto L14b;
                case 7: goto L131;
                case 8: goto L117;
                case 9: goto Lfd;
                case 10: goto Le3;
                case 11: goto Lc9;
                case 12: goto Laf;
                case 13: goto L95;
                case 14: goto L7b;
                case 15: goto L61;
                case 16: goto L47;
                case 17: goto L2d;
                case 18: goto L13;
                default: goto L11;
            }
        L11:
            goto L1ef
        L13:
            java.lang.String r4 = "layout/wallet_farmingtales_dialog_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L21
            jd.m2 r4 = new jd.m2
            r4.<init>(r2, r3)
            return r4
        L21:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for wallet_farmingtales_dialog is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L2d:
            java.lang.String r4 = "layout/wallet_brawlers_dialog_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L3b
            jd.k2 r4 = new jd.k2
            r4.<init>(r2, r3)
            return r4
        L3b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for wallet_brawlers_dialog is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L47:
            java.lang.String r4 = "layout/tool_nft_transfer_old_dialog_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L55
            jd.b2 r4 = new jd.b2
            r4.<init>(r2, r3)
            return r4
        L55:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for tool_nft_transfer_old_dialog is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L61:
            java.lang.String r4 = "layout/tool_nft_transfer_dialog_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L6f
            jd.z1 r4 = new jd.z1
            r4.<init>(r2, r3)
            return r4
        L6f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for tool_nft_transfer_dialog is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L7b:
            java.lang.String r4 = "layout/tool_nft_main_fragment_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L89
            jd.v1 r4 = new jd.v1
            r4.<init>(r2, r3)
            return r4
        L89:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for tool_nft_main_fragment is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L95:
            java.lang.String r4 = "layout/tool_edit_atomic_fragment_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto La3
            jd.l1 r4 = new jd.l1
            r4.<init>(r2, r3)
            return r4
        La3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for tool_edit_atomic_fragment is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        Laf:
            java.lang.String r4 = "layout/tool_colonizemars_login_fragment_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Lbd
            jd.j1 r4 = new jd.j1
            r4.<init>(r2, r3)
            return r4
        Lbd:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for tool_colonizemars_login_fragment is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        Lc9:
            java.lang.String r4 = "layout/tool_alcor_withdraw_fragment_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Ld7
            jd.y0 r4 = new jd.y0
            r4.<init>(r2, r3)
            return r4
        Ld7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for tool_alcor_withdraw_fragment is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        Le3:
            java.lang.String r4 = "layout/tool_alcor_provide_fragment_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Lf1
            jd.w0 r4 = new jd.w0
            r4.<init>(r2, r3)
            return r4
        Lf1:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for tool_alcor_provide_fragment is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        Lfd:
            java.lang.String r4 = "layout/swap_dialog_fragment_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L10b
            jd.t0 r4 = new jd.t0
            r4.<init>(r2, r3)
            return r4
        L10b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for swap_dialog_fragment is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L117:
            java.lang.String r4 = "layout/swap_dialog_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L125
            jd.r0 r4 = new jd.r0
            r4.<init>(r2, r3)
            return r4
        L125:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for swap_dialog is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L131:
            java.lang.String r4 = "layout/stake_farmingtales_dialog_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L13f
            jd.p0 r4 = new jd.p0
            r4.<init>(r2, r3)
            return r4
        L13f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for stake_farmingtales_dialog is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L14b:
            java.lang.String r4 = "layout/request_transfer_fragment_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L159
            jd.c0 r4 = new jd.c0
            r4.<init>(r2, r3)
            return r4
        L159:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for request_transfer_fragment is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L165:
            java.lang.String r4 = "layout/heal_brawlers_dialog_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L173
            jd.w r4 = new jd.w
            r4.<init>(r2, r3)
            return r4
        L173:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for heal_brawlers_dialog is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L17f:
            java.lang.String r4 = "layout/fragment_transfer_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L18d
            jd.t r4 = new jd.t
            r4.<init>(r2, r3)
            return r4
        L18d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for fragment_transfer is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L199:
            java.lang.String r4 = "layout/contacts_dialog_fragment_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1a7
            jd.k r4 = new jd.k
            r4.<init>(r2, r3)
            return r4
        L1a7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for contacts_dialog_fragment is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L1b3:
            java.lang.String r4 = "layout/cait_rent_cpu_fragment_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1c1
            jd.g r4 = new jd.g
            r4.<init>(r2, r3)
            return r4
        L1c1:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for cait_rent_cpu_fragment is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L1cd:
            java.lang.String r4 = "layout/buy_stake_dialog_0"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1db
            jd.e r4 = new jd.e
            r4.<init>(r2, r3)
            return r4
        L1db:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The tag for buy_stake_dialog is invalid. Received: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r3, r0)
            r2.<init>(r3)
            throw r2
        L1e7:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "view must have a tag"
            r2.<init>(r3)
            throw r2
        L1ef:
            r2 = 0
            return r2
    }

    @Override // androidx.databinding.AbstractC0357d
    /* renamed from: c */
    public androidx.databinding.ViewDataBinding mo1044c(androidx.databinding.InterfaceC0358e r2, android.view.View[] r3, int r4) {
            r1 = this;
            r2 = 0
            if (r3 == 0) goto L21
            int r0 = r3.length
            if (r0 != 0) goto L7
            goto L21
        L7:
            android.util.SparseIntArray r0 = io.tacocrypto.app.DataBinderMapperImpl.f12866a
            int r4 = r0.get(r4)
            if (r4 <= 0) goto L21
            r4 = 0
            r3 = r3[r4]
            java.lang.Object r3 = r3.getTag()
            if (r3 == 0) goto L19
            goto L21
        L19:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "view must have a tag"
            r2.<init>(r3)
            throw r2
        L21:
            return r2
    }
}
