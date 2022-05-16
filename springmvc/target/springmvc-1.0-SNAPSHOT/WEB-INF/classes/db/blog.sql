/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : blog

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 09/05/2022 18:43:39
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`
(
    `aid`   int(0) NOT NULL AUTO_INCREMENT COMMENT '文章id',
    `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '标题',
    `text`  mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '内容',
    `uid`   int(0) NULL DEFAULT NULL COMMENT '用户id',
    PRIMARY KEY (`aid`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article`
VALUES (1, '我的头发去哪儿了',
        '早上起来洗脸照镜子，忽然发现头发少了许多。仔细观察了一阵，先是发际线节节败退，顶上水土流失，植被日渐稀薄，后来竟然草盛豆苗稀，岩石裸露了。人人都有的头发，在我这里居然成了稀缺资源，成了一件憾事了。\r\n头发是一个人的“上层建筑”，“顶上功夫”，是人的第二张脸，关乎人的第一印象。一个人一看头发好，就是一幅生机勃勃的景象。反之，则憔悴颓糜，疲软无力，精神不起来。有人说，发如韭，割复生，而我的头发么不像韭菜一样一茬茬地生长，反而无边落叶萧萧下呢？别时容易见时难，发落容易再生难，几根无关紧要的头发，怎么让人如此纠结呢！书上说，物质是不灭的。我低头睁大眼睛寻寻觅觅，地板上空无一物，床上不见蛛丝马迹，衣服上不曾沾染，我曾经的一头乌发，都纷纷到哪去了呢？\r\n哦，找到几根，在书本里。从小就迷信“书中自有黄金屋，书中自有颜如玉。”“学而优则仕”，把头深深地埋进书本里，从书本上找答案，在书上找出路，青灯黄卷误人深，百无一用是书生，书中的知识没记住多少，倒把好多头发吸进书本当书签了。\r\n哦，找到几根，在电脑下边。读书人身无长物，徒有一只秃笔，写了半辈子文字，浪费了公家几车纸，后来科技发达，改用电脑了，于是不再纸上谈兵，又在键盘上敲敲打打，手忙眼眯脸儿腆，一个姿势坐半天，搜索枯肠咬文嚼字，成就了不少八股文章，谁知一手好字被电脑废了，一双好眼被电脑废了，一头青丝当然也被电脑祸害了。\r\n哦，找到几根，在酒桌上。人在江湖走，哪能不喝酒，不是当“三陪”，就是被人灌醉，抑或自斟浅饮，自我陶醉。滚滚红尘三杯酒，漫漫人生一碗茶。笑与被笑之间，醉与半醉之际，揉碎了桃花，揉乱了岁月，也揉掉了几多头发。\r\n哦，又找到几根，在车座上。整天不是写材料，就是下乡，风雨兼程，日夜奔命，鞍马劳顿，颠沛劳形，搔首按腰，揉眼挠发，捻断了多少枯发。\r\n哦，还有，还有，在这里，在那里……\r\n不找不知道，一找真不少。找到了，知道曾经属于我的东西的归宿，知道他们一切安好，心里踏实了许多。但看见损兵折将这么多，去之者众，留之者寡，怎不让人心酸。也罢，不找了，不找了，就算找到了也不是我的了。白发与掉发，是自然现象，对谁都是公平的，谁也不曾幸免。杜牧诗言：“公道世间惟白发，贵人头上不曾饶。”白居易也释然道：“今日红颜欺了我，他日白发不放君。”张学良晚年信基督，啥都想开了，“白发催人老，虚名误人深。主恩开高厚，世事如浮云。”慢慢变老，齿摇发脱，对每个人都是公平的，只是早晚的事。再说，牙齿发肤，受之父母，本来就不是你的。佛经上也说，已经失去的，原本就不是你的。头发掉就掉了，再惋惜也没有用。\r\n正在傻想之际，忽然天边飘过两片像头发一样的云，突然想起最近有高人指点迷津：左边的一片叫马云，右边的一片叫星云。马云教人年轻时要奋斗，要创业，要拼搏，要竞争，敢教日月换新天。星云大师教人到了一定年龄要学会想开，学会舍得，学会放下，学会平静，惯看秋月春风。像马云一样拿得起，像星云一样放得下。\r\n看到两片云，眼前突然一亮：头发少的人很多很多，天上的太白金星毛发稀疏，地下的土地公公是个大脑门儿，古代的老子、孔子是大额头，杜甫的头发好像也不多，因为他说过“白发搔更短，浑欲不胜簪”，方外人和尚不蓄发，文艺圈内有不少光头，也很个性。头发虽不是身外之物，但原本就不是你的，要走就让他随风一起走吧。他曾经是你的，曾经一头乌发，风度翩翩就够了，当初曾经拥有，何必一生强求？他本来就不是你的，该走的时候人家招呼不打一声就毅然决然地走了，强留也没有用。再者说，头发虽是“上层建筑”，但只是“表面文章”，掉就掉了吧，留下几根做代表就行了，何况留下的都是“关键少数”，是百年征战留下的精兵强将，是大浪淘沙沉淀下来的金子。都说头发是“烦恼丝”，掉的越少越好，“删繁就简三秋树，领新标异二月花”，上边负担轻，对脖子有好处，烦恼也少。既便再少点、更少点，抑或是光头朝天也无所谓，去伪存真，不要装饰，更显精气神。我自释然对落发，稀稀拉拉伴流年。就这样优雅地老去，有何不好！',
        1);
INSERT INTO `article`
VALUES (2, '被偷之后',
        '	这天,乔治和妻子回到家,发现家里值钱的东西都被洗劫一空。\r\n“都是你的错,”妻子埋怨道,“我们走之前,你应该检查一下门是不是锁好了。”\r\n邻居们闻讯赶了过来,帮着腔。\r\n一个人说:“乔治,你应该把窗子关好。”\r\n另一个说:“你怎么没想到会来小偷呢?”\r\n第三个人说:“锁都坏了,你也没换一把新锁。”\r\n“等等,各位,”乔治说,“我不是唯一应该受谴责的人。”\r\n众人问:“那还有谁?”\r\n“小偷,”\r\n乔治说,“小偷就一点儿错都没有吗?”',
        1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `uid`      int(0) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
    `nickname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '昵称',
    `sex`      varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '性别',
    `age`      int(0) NULL DEFAULT NULL COMMENT '年龄',
    PRIMARY KEY (`uid`) USING BTREE,
    UNIQUE INDEX `user_pk` (`uid`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user`
VALUES (1, 'admin', '123', 'WangBinRen', '男', 20);

SET
FOREIGN_KEY_CHECKS = 1;
