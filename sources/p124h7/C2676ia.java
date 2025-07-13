package p124h7;

/* renamed from: h7.ia */
/* loaded from: classes.dex */
public final class C2676ia implements android.os.Parcelable.Creator<p124h7.C2658ha> {
    public C2676ia() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2658ha createFromParcel(android.os.Parcel r18) {
            r17 = this;
            r0 = r18
            int r1 = p270p6.C5368b.m11710t(r18)
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = r3
            r8 = r7
            r9 = r8
            r14 = r9
            r15 = r14
            r10 = r4
            r12 = 0
            r13 = 0
            r16 = 0
        L14:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L60
            int r2 = r18.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 1: goto L5a;
                case 2: goto L54;
                case 3: goto L4e;
                case 4: goto L48;
                case 5: goto L42;
                case 6: goto L3c;
                case 7: goto L36;
                case 8: goto L30;
                case 9: goto L29;
                default: goto L25;
            }
        L25:
            p270p6.C5368b.m11709s(r0, r2)
            goto L14
        L29:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r16 = r2
            goto L14
        L30:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r15 = r2
            goto L14
        L36:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r14 = r2
            goto L14
        L3c:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r13 = r2
            goto L14
        L42:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r12 = r2
            goto L14
        L48:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r10 = r2
            goto L14
        L4e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r9 = r2
            goto L14
        L54:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r8 = r2
            goto L14
        L5a:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r7 = r2
            goto L14
        L60:
            p270p6.C5368b.m11699i(r0, r1)
            h7.ha r0 = new h7.ha
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r12, r13, r14, r15, r16)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2658ha[] newArray(int r1) {
            r0 = this;
            h7.ha[] r1 = new p124h7.C2658ha[r1]
            return r1
    }
}
